package me.bigtallahasee.myfirstplugin.CommandList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Suicide implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("fml")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Wussies take the easy way out!");
                player.setHealth(0);
            } else {
                System.out.println("You need to be a player to do this command");
            }
        }
        return false;
    }
}

