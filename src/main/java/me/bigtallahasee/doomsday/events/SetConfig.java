package me.bigtallahasee.doomsday.events;

import me.bigtallahasee.doomsday.Doomsday;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.plugin.Plugin;

public class SetConfig implements Listener {
    Plugin plugin = Doomsday.getPlugin(Doomsday.class);

    @EventHandler
    public void OnChatEvent(PlayerCommandSendEvent e)
    {

    }

}
