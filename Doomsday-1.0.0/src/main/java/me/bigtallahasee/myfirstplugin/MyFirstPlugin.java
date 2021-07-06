package me.bigtallahasee.myfirstplugin;

import me.bigtallahasee.myfirstplugin.CommandList.Doc;
import me.bigtallahasee.myfirstplugin.CommandList.Suicide;
import me.bigtallahasee.myfirstplugin.events.BedLeave;
import me.bigtallahasee.myfirstplugin.events.DeathMessage;
import me.bigtallahasee.myfirstplugin.events.PlayerJoin;
import me.bigtallahasee.myfirstplugin.events.PlayerLeave;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("My first plugin has started!!! Hello!!!");

        getServer().getPluginManager().registerEvents(new BedLeave(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new DeathMessage(), this);
        getCommand("doc").setExecutor(new Doc());
        getCommand("fml").setExecutor(new Suicide());

    }
}


