package me.bigtallahasee.myfirstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class DeathMessage implements Listener {

    @EventHandler
    void onDeathEvent(PlayerDeathEvent event){
        Player player = event.getEntity();
        event.setDeathMessage(ChatColor.GREEN+player.getDisplayName()+ChatColor.GREEN+" was mauled by a Zombie!!");
    }
}


