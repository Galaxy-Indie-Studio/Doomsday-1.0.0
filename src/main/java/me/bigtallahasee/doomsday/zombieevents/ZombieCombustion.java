package me.bigtallahasee.doomsday.zombieevents;

import me.bigtallahasee.doomsday.Doomsday;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.plugin.Plugin;

public class ZombieCombustion implements Listener {
    Plugin plugin = Doomsday.getPlugin(Doomsday.class);

    @EventHandler
    public void entityCombustion(EntityCombustEvent e) {
        Entity entity = e.getEntity();
        if (entity instanceof LivingEntity) {
            LivingEntity le = (LivingEntity) entity;
            if (le instanceof Zombie) {
                Zombie zombie = (Zombie) le;
                if (zombie.getWorld().getTime() >= 0L && zombie.getWorld().getTime() <= 24000L)
                    e.setCancelled(true);
            }
        }
    }
}