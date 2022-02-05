package me.bigtallahasee.doomsday.zombieevents;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;

import me.bigtallahasee.doomsday.Doomsday;

public class ZombieStats implements Listener {
    Plugin plugin = Doomsday.getPlugin(Doomsday.class);

    @EventHandler
    public void onZombieSpawn(CreatureSpawnEvent e) {
        LivingEntity livingEntity = e.getEntity();
        int hp = plugin.getConfig().getInt("Zombies-SetHealth");
        if (livingEntity instanceof Zombie) {
            ((Zombie) livingEntity).getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(hp);
            ((Zombie) livingEntity).setHealth(hp);
            livingEntity.setCustomName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Zombies-SetName")));
        }
    }
    @EventHandler
        public void ZombieStrength(EntityDamageByEntityEvent e) {
            int strength = plugin.getConfig().getInt("Zombies-SetStrength");
            if (e.getDamager() instanceof Zombie)
                e.setDamage(strength);
        }
    }

