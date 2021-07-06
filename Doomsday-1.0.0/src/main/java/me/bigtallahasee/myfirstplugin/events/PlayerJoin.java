package me.bigtallahasee.myfirstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener{

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.DARK_RED+"Welcome "+ChatColor.DARK_RED+player.getDisplayName()+ChatColor.DARK_RED+" to the Zombie Apocalypse");
    }
}
