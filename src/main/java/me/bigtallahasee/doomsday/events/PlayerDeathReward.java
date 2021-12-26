package me.bigtallahasee.doomsday.events;

import static me.bigtallahasee.doomsday.Doomsday.econ;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;

import me.bigtallahasee.doomsday.Doomsday;

public class PlayerDeathReward implements Listener {
    Plugin plugin = Doomsday.getPlugin(Doomsday.class);

    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
        if (plugin.getConfig().getBoolean("Players-MoneyReward")) {
            Player player = event.getEntity();
            Player killer = player.getKiller();
            if (killer instanceof Player) {
                econ.depositPlayer(killer, plugin.getConfig().getDouble("Players-SetMoneyReward", 100.0D));
                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Players-RewardMessage")));
            }
        }
    }
}
