package me.bigtallahasee.doomsday.zombieevents;

import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class DisableZombieExp implements Listener {
    @EventHandler
    public void onentitydie(EntityDeathEvent e) {
        e.setDroppedExp(0);
        if (e.getEntity() instanceof Zombie)
            e.getDrops().clear();
    }

}
