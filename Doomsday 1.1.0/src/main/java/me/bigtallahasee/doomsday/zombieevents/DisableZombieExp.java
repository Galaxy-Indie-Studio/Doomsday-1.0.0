package me.bigtallahasee.doomsday.zombieevents;

import org.bukkit.Material;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class DisableZombieExp implements Listener {
    @EventHandler
    public void onentitydie(EntityDeathEvent e) {
        e.setDroppedExp(0);
        if (e.getEntity() instanceof Zombie) {
            e.getDrops().clear();
            Random ob = new Random();
            for (int counter = 1; counter <= 1; counter++) {
                int num = 1 + ob.nextInt(4);
                if (num == 3)
                    e.getEntity().getLocation().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.ROTTEN_FLESH, 0));
            }
        }
        if (e.getEntity() instanceof Zombie)
            e.getDrops().clear();
    }

}
