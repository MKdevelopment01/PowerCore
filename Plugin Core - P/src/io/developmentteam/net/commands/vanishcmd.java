package io.developmentteam.net.commands;
import io.developmentteam.net.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class vanishcmd implements CommandExecutor{
    ArrayList<Player> invisible_list = new ArrayList<>();
    Main plugin;

    public vanishcmd(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("powerplug.fly"))
                if (player.hasPermission("powerplug.vanish"))
                    if (invisible_list.contains(player)) {
                        for (Player people : Bukkit.getOnlinePlayers()) {
                            people.showPlayer(plugin, player);

                        }
                        invisible_list.remove(player);
                        player.sendMessage(ChatColor.AQUA + "You are now " + ChatColor.RED + "visible " + ChatColor.AQUA + "for other players in the server");
                    } else if (!invisible_list.contains(player)) {
                        for (Player people : Bukkit.getOnlinePlayers()) {
                            people.hidePlayer(plugin, player);
                        }
                        invisible_list.add(player);
                        player.sendMessage(ChatColor.AQUA + "You are now " + ChatColor.GREEN + "invisible " + ChatColor.AQUA + "for other players in the server");

                    }
        }
        return true;
    }
}
