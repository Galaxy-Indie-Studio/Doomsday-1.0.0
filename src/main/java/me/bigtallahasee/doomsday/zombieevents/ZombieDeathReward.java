package me.bigtallahasee.doomsday.zombieevents;

import static me.bigtallahasee.doomsday.Doomsday.econ;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.Plugin;

import me.bigtallahasee.doomsday.Doomsday;

public class ZombieDeathReward implements Listener {
    Plugin plugin = Doomsday.getPlugin(Doomsday.class);
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        if (plugin.getConfig().getBoolean("Zombies-MoneyReward") &&
                e.getEntity().getKiller() instanceof Player && e.getEntity() instanceof Zombie) {
            Player p = e.getEntity().getKiller();
            econ.depositPlayer(p, plugin.getConfig().getDouble("Zombies-SetMoneyReward", 10.0D));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Zombies-RewardMessage")));
        }
    }
}
