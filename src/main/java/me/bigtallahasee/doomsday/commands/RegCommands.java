package me.bigtallahasee.doomsday.commands;

import me.bigtallahasee.doomsday.Doomsday;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.*;

public class RegCommands implements TabExecutor {
    Doomsday plugin = Doomsday.getPlugin(Doomsday.class);

    private String adminPingMsg = plugin.getConfig().get("Admin-Ping-Msg").toString();
    private String modPingMsg = plugin.getConfig().get("Mod-Ping-Msg").toString();
    private String helperPingMsg = plugin.getConfig().get("Helper-Ping-Msg").toString();

    private String adminAutoMsg = plugin.getConfig().get("Admin-To-Player-Auto-Msg").toString();
    private String modAutoMsg = plugin.getConfig().get("Mod-To-Player-Auto-Msg").toString();
    private String helperAutoMsg = plugin.getConfig().get("Helper-To-Player-Auto-Msg").toString();
    private String staffAutoMsg = plugin.getConfig().get("Staff-To-Player-Auto-Msg").toString();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(sender instanceof Player) {
            if (player.hasPermission("dd.default") || player.hasPermission("dd.*") || player.isOp()) {
                if (command.getName().equals("dday")) {
                    if (args[0].equalsIgnoreCase("suicide")) {
                        player.sendMessage("Wussies take the easy way out!");
                        player.setHealth(0);
                    }
                    if (player.hasPermission("dd.doc")) {
                        if (args[0].equalsIgnoreCase("doc")) {
                            if (player.getHealth() == 20.0F) {
                                player.sendMessage("Don't waste my time!");
                            } else {
                                player.sendMessage("I need a doctor!");
                                player.setHealth(player.getHealth() + 2);
                            }
                        }
                    }
                    if(args[0].equalsIgnoreCase("ping")){
                        if(args[1].equalsIgnoreCase("admin")){
                            //msg sent to admin
                            Bukkit.broadcast(" ", "dd.admin");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.admin");
                            Bukkit.broadcast(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Admin Ping          "+ ChatColor.BLACK +"#", "dd.admin");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.admin");
                            Bukkit.broadcast(  ChatColor.GREEN + player.getName() + " " + ChatColor.RED + adminPingMsg, "dd.admin");
                            Bukkit.broadcast(" ", "dd.admin");

                            //msg sent to player
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Admin Ping          "+ ChatColor.BLACK +"#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.RED + adminAutoMsg);
                            player.sendMessage(" ");
                        }
                        if(args[1].equalsIgnoreCase("mod")){
                            Bukkit.broadcast(" ", "dd.mod");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.mod");
                            Bukkit.broadcast(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Mod Ping          "+ ChatColor.BLACK +"#", "dd.mod");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.mod");
                            Bukkit.broadcast(  ChatColor.GREEN + player.getName() + " " + ChatColor.RED + modPingMsg, "dd.mod");
                            Bukkit.broadcast(" ", "dd.mod");

                            //msg sent to player
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Mod Ping          "+ ChatColor.BLACK +"#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.RED + modAutoMsg);
                            player.sendMessage(" ");
                        }
                        if(args[1].equalsIgnoreCase("helper")){
                            Bukkit.broadcast(" ", "dd.helper");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.helper");
                            Bukkit.broadcast(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Helper Ping          "+ ChatColor.BLACK +"#", "dd.helper");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.helper");
                            Bukkit.broadcast(  ChatColor.GREEN + player.getName() + " " + ChatColor.RED + helperPingMsg, "dd.helper");
                            Bukkit.broadcast(" ", "dd.helper");

                            //msg sent to player
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Helper Ping          "+ ChatColor.BLACK +"#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.RED + helperAutoMsg);
                            player.sendMessage(" ");
                        }
                        if(args[1].equalsIgnoreCase("all")){
                            //broadcast to admin
                            Bukkit.broadcast(" ", "dd.admin");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.admin");
                            Bukkit.broadcast(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Staff Ping          "+ ChatColor.BLACK +"#", "dd.admin");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.admin");
                            Bukkit.broadcast(  ChatColor.GREEN + player.getName() + " " + ChatColor.RED + adminPingMsg, "dd.admin");
                            Bukkit.broadcast(" ", "dd.admin");

                            //broadcast to mods
                            Bukkit.broadcast(" ", "dd.mod");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.mod");
                            Bukkit.broadcast(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Staff Ping          "+ ChatColor.BLACK +"#", "dd.mod");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.mod");
                            Bukkit.broadcast(  ChatColor.GREEN + player.getName() + " " + ChatColor.RED + modPingMsg, "dd.mod");
                            Bukkit.broadcast(" ", "dd.mod");

                            //broadcast to helpers
                            Bukkit.broadcast(" ", "dd.helper");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.helper");
                            Bukkit.broadcast(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Staff Ping          "+ ChatColor.BLACK +"#", "dd.helper");
                            Bukkit.broadcast(ChatColor.BLACK + "#----------------------------#", "dd.helper");
                            Bukkit.broadcast(  ChatColor.GREEN + player.getName() + " " + ChatColor.RED + helperPingMsg, "dd.helper");
                            Bukkit.broadcast(" ", "dd.helper");

                            //msg sent to player
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED +"Doomsday Staff Ping          "+ ChatColor.BLACK +"#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.RED + staffAutoMsg);
                            player.sendMessage(" ");
                        }
                    }
                }
            }else{
                player.sendMessage(ChatColor.RED + "You don't have the proper permission to");
                player.sendMessage(ChatColor.RED + "execute this command!");
                player.sendMessage(ChatColor.GREEN + "Required Permission (dd.default)");
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = Arrays.asList("suicide", "doc", "ping");
        String input = args[0].toLowerCase();



        List<String> completions = null;
        for (String s : list) {
            if (s.startsWith(input)) {
                if (completions == null) {
                    completions = new ArrayList<>();
                }
                completions.add(s);
            }
        }
        if (completions != null) {
            Collections.sort(completions);
            return completions;
        }
        return completions;
    }
}
