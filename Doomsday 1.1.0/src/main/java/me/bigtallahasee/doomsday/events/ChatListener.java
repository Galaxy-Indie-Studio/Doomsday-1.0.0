package me.bigtallahasee.doomsday.events;

import me.bigtallahasee.doomsday.Doomsday;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class ChatListener implements Listener {
    Plugin plugin = Doomsday.getPlugin(Doomsday.class);


    @EventHandler
    public void onPlayerCommand(PlayerChatEvent event) {
        String[] split = event.getMessage().split(" ");
        Player player = event.getPlayer();
        if ((split[0].equalsIgnoreCase("preward"))) {
            plugin.getConfig().set("Players-SetMoneyRewardt", split);
            event.setCancelled(true);
        }
    }
}
