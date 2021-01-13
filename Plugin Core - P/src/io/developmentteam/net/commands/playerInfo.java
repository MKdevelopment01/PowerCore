package io.developmentteam.net.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class playerInfo implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("powerplug.playerinfo"))
                if (args.length == 1) {
                    Player target = Bukkit.getPlayer(args[0]);
                    player.sendMessage(ChatColor.BLUE + target.getPlayer().getName() + "'s Information");
                    player.sendMessage(ChatColor.GRAY + "_________________________________________________");
                    player.sendMessage(ChatColor.AQUA + "The coords of the player are: " + target.getLocation());
                    player.sendMessage(ChatColor.AQUA + "The players Health + Food is: " + ChatColor.RED + "Health: " + target.getHealth() + ChatColor.GOLD + " Food: " + target.getFoodLevel());
                    player.sendMessage(ChatColor.AQUA + "The GameMode of the player is: " + ChatColor.BLUE + target.getGameMode());
                    player.sendMessage(ChatColor.AQUA + "Fly mode is: " + ChatColor.BLUE + target.getAllowFlight());
                    player.sendMessage(ChatColor.GRAY + "_________________________________________________");
                }
        } else {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "you gave not a playername in the command");
            player.sendMessage(ChatColor.RED + "Usage: /playerinfo [player]");

        }
        return false;
    }
}
