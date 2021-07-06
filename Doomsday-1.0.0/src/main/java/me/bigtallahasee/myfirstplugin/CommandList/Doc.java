package me.bigtallahasee.myfirstplugin.CommandList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Doc implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("MyFirstPlugin.doc")) {
                if (player.getHealth() == 20.0f) {
                    player.sendMessage("Don't waste my time!");
                } else {
                    player.sendMessage("I need a doctor!");
                    player.setHealth(player.getHealth() + 2);
                }
            }
            if (!player.hasPermission("MyFirstPlugin.doc")) {
                player.sendMessage(ChatColor.RED +"You don't have the required permission (MyFirstPlugin.doc) to run this command");
            }
            return false;
        }
        return false;
    }
}



