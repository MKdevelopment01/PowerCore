package io.developmentteam.net;

import io.developmentteam.net.commands.vanishcmd;
import io.developmentteam.net.commands.playerInfo;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

        getLogger().info("Enabling PowerCore By KevTheDev and PowerGamerDev");
        getCommand("playerinfo").setExecutor(new playerInfo());
        getLogger().info("Enabling The Vanish Option On The Core");
        getCommand("vanishcmd").setExecutor(new playerInfo());

    }
    @Override
    public void  onDisable(){

    }

}
