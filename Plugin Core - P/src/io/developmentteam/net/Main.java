package io.developmentteam.net;

import io.developmentteam.net.commands.playerInfo;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

        getLogger().info("Enabling PowerCore By KevTheDev and PowerGamerDev");
        getCommand("playerinfo").setExecutor(new playerInfo());
    }
    public void  onDisable(){

    }


}
