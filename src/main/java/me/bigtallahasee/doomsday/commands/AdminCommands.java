package me.bigtallahasee.doomsday.commands;

import me.bigtallahasee.doomsday.Doomsday;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdminCommands implements TabExecutor {
    Doomsday plugin = Doomsday.getPlugin(Doomsday.class);
    private String zombieName = plugin.getConfig().get("Zombies-SetName").toString();
    private String zombieStrength = plugin.getConfig().get("Zombies-SetStrength").toString();
    private String zombieHealth = plugin.getConfig().get("Zombies-SetHealth").toString();
    private String zombieKillReward = plugin.getConfig().get("Zombies-SetMoneyReward").toString();
    private String zombieKillMsg = plugin.getConfig().get("Zombies-RewardMessage").toString();
    private String zombieKillRewardEnabled = plugin.getConfig().get("Zombies-MoneyReward").toString();

    private String playerKillReward = plugin.getConfig().get("Players-SetMoneyReward").toString();
    private String playerKillMsg = plugin.getConfig().get("Players-RewardMessage").toString();
    private String playerKillRewardEnabled = plugin.getConfig().get("Players-MoneyReward").toString();

    private boolean isBlocked = true;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("dd.*") || player.isOp()) {
            if (command.getName().equals("ddayadmin")) {
                if (args[0].equalsIgnoreCase("config")) {
                    if (args[1].equalsIgnoreCase("set")) {
                        if (args[2].equalsIgnoreCase("player")) {
                            if (args[3].equalsIgnoreCase("killreward")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");
                            }
                            if (args[3].equalsIgnoreCase("killmsg")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");
                            }
                        }
                        if (args[2].equalsIgnoreCase("zombie")) {
                            if (args[3].equalsIgnoreCase("health")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");
                            }
                            if (args[3].equalsIgnoreCase("strength")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");
                            }
                            if (args[3].equalsIgnoreCase("killreward")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");
                            }
                            if (args[3].equalsIgnoreCase("killmsg")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");
                            }
                            if (args[3].equalsIgnoreCase("name")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");
                            }
                        }
                    }
                    if (args[1].equalsIgnoreCase("enable")) {
                        if (args[2].equalsIgnoreCase("player")) {
                            if (args[3].equalsIgnoreCase("killreward")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development");
                                player.sendMessage(ChatColor.RED + "and may not work properly!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");

                                plugin.getConfig().set("Players-MoneyReward", true);
                            }
                        }
                        if (args[2].equalsIgnoreCase("zombie")) {
                            if (args[3].equalsIgnoreCase("killreward")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note           " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development");
                                player.sendMessage(ChatColor.RED + "and may not work properly!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");

                                plugin.getConfig().set("Zombies-MoneyReward", true);
                            }
                        }
                    }
                    if (args[1].equalsIgnoreCase("disable")) {
                        if (args[2].equalsIgnoreCase("player")) {
                            if (args[3].equalsIgnoreCase("killreward")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note         " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature is under development");
                                player.sendMessage(ChatColor.RED + "and may not work properly!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");

                                plugin.getConfig().set("Players-MoneyReward", false);
                            }
                        }
                        if (args[2].equalsIgnoreCase("zombie")) {
                            if (args[3].equalsIgnoreCase("killreward")) {
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Dev Note         " + ChatColor.BLACK + "#");
                                player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                                player.sendMessage(ChatColor.RED + "This feature still under development");
                                player.sendMessage(ChatColor.RED + "and may not work properly!");
                                player.sendMessage(ChatColor.RED + "This feature will be available ASAP!");
                                player.sendMessage(ChatColor.RED + "Enjoy!");

                                plugin.getConfig().set("Zombies-MoneyReward", false);
                            }
                        }
                    }
                    if (args[1].equalsIgnoreCase("show")) {
                        if(args[2].equalsIgnoreCase("settings")) {
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Config             " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Zombie Settings              " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Name: " + ChatColor.GREEN +zombieName);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Health: " + ChatColor.GREEN +zombieHealth);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Strength: " + ChatColor.GREEN +zombieStrength);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Kill-Reward-Enabled: " + ChatColor.GREEN +zombieKillRewardEnabled);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Kill-Reward: " + ChatColor.GREEN +zombieKillReward);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Kill-Msg: " + ChatColor.GREEN +zombieKillMsg);
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Player Settings             " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Player-Kill-Reward-Enabled: " + ChatColor.GREEN + playerKillRewardEnabled);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Player-Kill-Reward: " + ChatColor.GREEN +playerKillReward);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Player-Kill-Msg: " + ChatColor.GREEN +playerKillMsg);
                            player.sendMessage(" ");

                        }
                        if(args[2].equalsIgnoreCase("all")){
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Config             " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Zombie Settings              " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Name: " + ChatColor.GREEN +zombieName);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Health: " + ChatColor.GREEN +zombieHealth);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Strength: " + ChatColor.GREEN +zombieStrength);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Kill-Reward-Enabled: " + ChatColor.GREEN +zombieKillRewardEnabled);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Kill-Reward: " + ChatColor.GREEN +zombieKillReward);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Zombie-Kill-Msg: " + ChatColor.GREEN +zombieKillMsg);
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Player Settings             " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Player-Kill-Reward-Enabled: " + ChatColor.GREEN + playerKillRewardEnabled);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Player-Kill-Reward: " + ChatColor.GREEN +playerKillReward);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Player-Kill-Msg: " + ChatColor.GREEN +playerKillMsg);
                            player.sendMessage(" ");

                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Mobs Blocked             " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");

                            //Shows weither or not mobs are enabled

                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Axolotl-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Axolotl")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Bat-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Bat")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Bee-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Bee")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Blaze-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Blaze")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Cat-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Cat")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Cod-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Cod")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Cow-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Cow")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Creeper-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Creeper")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Dolphin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Dolphin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Donkey-Blocked:: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Donkey")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Drowned-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Drowned")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Elder-Guardian-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Elder-Guardian")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Enderman-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Enderman")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Endermite-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Endermite")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Evoker-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Evoker")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Fox-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Fox")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Ghast-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Ghast")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Glow-Squid-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Glow-Squid")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Goat-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Goat")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Guardian-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Guardian")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Hoglin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Hoglin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Horse-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Horse")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Husk-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Husk")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Llama-Pigman-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Llama")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Magma-Cube-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Magma-Cube")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Mooshrom-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Mooshrom")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Mule-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Mule")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Ocelot-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Ocelot")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Panda-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Panda")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Parrot-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Parrot")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Phantom-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Phantom")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Pig-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Pig")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Piglin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Piglin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Piglin-Brute-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Piglin-Brute")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Pillager-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Pillager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Polar-Bear-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Polar-Bear")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Pufferfish-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Pufferfish")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Rabbit-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Rabbit")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Ravager-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Ravager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Salmon-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Salmon")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Sheep-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Sheep")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Shulker-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Shulker")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Silverfish-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Silverfish")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Skeleton-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Skeleton")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Skeleton-Horse-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Skeleton-Horse")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Slime-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Slime")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Spider-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Spider")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Squid-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Squid")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Stray-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Stray")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Strider-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Strider")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Trader-Llama-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Trader-Llama")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Tropical-Fish-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Tropical-Fish")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Turtle-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Turtle")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Vex-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Vex")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Vindicator-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Villager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Vindicator-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Vindicator")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Wandering-Trader-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Wandering-Trader")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Warden-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Warden")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Witch-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Witch")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Wither-Skeleton-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Wither-Skeleton")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Wolf-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Wolf")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zoglin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zoglin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zombie")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Horse-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zombie-Horse")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Villager-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zombie-Villager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Pigman-Blocked: "+ ChatColor.GREEN + plugin.getConfig().getBoolean("Block-Zombie-Pigman")));
                            player.sendMessage(" ");
                        }
                        if(args[2].equalsIgnoreCase("blocked")){
                            player.sendMessage(" ");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                            player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday Mobs Blocked             " + ChatColor.BLACK + "#");
                            player.sendMessage(ChatColor.BLACK + "#----------------------------#");

                            //Shows weither or not mobs are enabled

                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Axolotl-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Axolotl")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Bat-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Bat")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Bee-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Bee")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Blaze-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Blaze")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Cat-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Cat")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Cod-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Cod")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Cow-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Cow")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Creeper-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Creeper")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Dolphin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Dolphin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Donkey-Blocked:: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Donkey")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Drowned-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Drowned")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Elder-Guardian-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Elder-Guardian")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Enderman-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Enderman")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Endermite-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Endermite")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Evoker-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Evoker")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Fox-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Fox")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Ghast-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Ghast")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Glow-Squid-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Glow-Squid")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Goat-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Goat")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Guardian-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Guardian")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Hoglin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Hoglin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Horse-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Horse")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Husk-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Husk")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Llama-Pigman-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Llama")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Magma-Cube-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Magma-Cube")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Mooshrom-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Mooshrom")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Mule-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Mule")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Ocelot-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Ocelot")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Panda-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Panda")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Parrot-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Parrot")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Phantom-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Phantom")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Pig-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Pig")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Piglin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Piglin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Piglin-Brute-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Piglin-Brute")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Pillager-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Pillager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Polar-Bear-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Polar-Bear")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Pufferfish-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Pufferfish")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Rabbit-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Rabbit")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Ravager-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Ravager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Salmon-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Salmon")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Sheep-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Sheep")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Shulker-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Shulker")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Silverfish-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Silverfish")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Skeleton-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Skeleton")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Skeleton-Horse-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Skeleton-Horse")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Slime-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Slime")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Spider-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Spider")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Squid-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Squid")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Stray-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Stray")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Strider-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Strider")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Trader-Llama-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Trader-Llama")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Tropical-Fish-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Tropical-Fish")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Turtle-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Turtle")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Vex-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Vex")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Vindicator-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Villager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Vindicator-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Vindicator")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Wandering-Trader-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Wandering-Trader")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Warden-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Warden")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Witch-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Witch")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Wither-Skeleton-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Wither-Skeleton")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Wolf-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Wolf")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zoglin-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zoglin")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zombie")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Horse-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zombie-Horse")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Villager-Blocked: "+ ChatColor.GREEN +plugin.getConfig().getBoolean("Block-Zombie-Villager")));
                            player.sendMessage(String.valueOf(ChatColor.LIGHT_PURPLE + "Zombie-Pigman-Blocked: "+ ChatColor.GREEN + plugin.getConfig().getBoolean("Block-Zombie-Pigman")));
                        }
                    }
                    if (args[1].equalsIgnoreCase("block")) {
                        if (args[2].equalsIgnoreCase("passive")) {
                            if (args[3].equalsIgnoreCase("axolotl")) {
                                if (args[4].equalsIgnoreCase("true")) {
                                    player.sendMessage("You have disabled Axolotl Spawning!");
                                    plugin.getConfig().set("Block-Axolotl", true);
                                }
                                if (args[4].equalsIgnoreCase("false")) {
                                    player.sendMessage("You have enabled Axolotl Spawning!");
                                    plugin.getConfig().set("Block-Axolotl", false);
                                }
                            }
                            if (args[3].equalsIgnoreCase("bat")) {
                                if (args[4].equalsIgnoreCase("true")) {
                                    player.sendMessage("You have disabled Bat Spawning!");
                                    plugin.getConfig().set("Block-Bat", true);
                                }
                                if (args[4].equalsIgnoreCase("false")) {
                                    player.sendMessage("You have enabled Bat Spawning!");
                                    plugin.getConfig().set("Block-Bat", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("cat")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Cat Spawning!");
                                    plugin.getConfig().set("Block-Cat", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Cat Spawning!");
                                    plugin.getConfig().set("Block-Cat", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("chicken")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Chicken Spawning!");
                                    plugin.getConfig().set("Block-Chicken", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Chicken Spawning!");
                                    plugin.getConfig().set("Block-Chicken", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("cod")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Cod Spawning!");
                                    plugin.getConfig().set("Block-Cod", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Cod Spawning!");
                                    plugin.getConfig().set("Block-Cod", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("cow")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Cow Spawning!");
                                    plugin.getConfig().set("Block-Cow", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Cow Spawning!");
                                    plugin.getConfig().set("Block-Cow", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("dolphin")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Dolphin Spawning!");
                                    plugin.getConfig().set("Block-Dolphin", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Dolphin Spawning!");
                                    plugin.getConfig().set("Block-Dolphin", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("donkey")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Donkey Spawning!");
                                    plugin.getConfig().set("Block-Donkey", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Donkey Spawning!");
                                    plugin.getConfig().set("Block-Donkey", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("fox")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Fox Spawning!");
                                    plugin.getConfig().set("Block-Fox", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Fox Spawning!");
                                    plugin.getConfig().set("Block-Fox", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("glow-squid")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Glow Squid Spawning!");
                                    plugin.getConfig().set("Block-Glow-Squid", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Glow Squid Spawning!");
                                    plugin.getConfig().set("Block-Glow-Squid", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("horse")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Horse Spawning!");
                                    plugin.getConfig().set("Block-Horse", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Horse Spawning!");
                                    plugin.getConfig().set("Block-Horse", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("mooshrom")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Mooshrom Spawning!");
                                    plugin.getConfig().set("Block-Mooshrom", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Mooshrom Spawning!");
                                    plugin.getConfig().set("Block-Mooshrom", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("mule")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Mule Spawning!");
                                    plugin.getConfig().set("Block-Mule", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Mule Spawning!");
                                    plugin.getConfig().set("Block-Mule", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("ocelot")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Ocelot Spawning!");
                                    plugin.getConfig().set("Block-Ocelot", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Ocelot Spawning!");
                                    plugin.getConfig().set("Block-Ocelot", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("parrot")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Parrot Spawning!");
                                    plugin.getConfig().set("Block-Parrot", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Parrot Spawning!");
                                    plugin.getConfig().set("Block-Parrot", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("pig")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Pig Spawning!");
                                    plugin.getConfig().set("Block-Pig", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Pig Spawning!");
                                    plugin.getConfig().set("Block-Pig", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("pufferfish")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Pufferfish Spawning!");
                                    plugin.getConfig().set("Block-Pufferfish", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Pufferfish Spawning!");
                                    plugin.getConfig().set("Block-Pufferfish", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("rabbit")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Rabbit Spawning!");
                                    plugin.getConfig().set("Block-Rabbit", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Rabbit Spawning!");
                                    plugin.getConfig().set("Block-Rabbit", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("salmon")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Salmon Spawning!");
                                    plugin.getConfig().set("Block-Salmon", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Salmon Spawning!");
                                    plugin.getConfig().set("Block-Salmon", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("sheep")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Sheep Spawning!");
                                    plugin.getConfig().set("Block-Sheep", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Sheep Spawning!");
                                    plugin.getConfig().set("Block-Sheep", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("squid")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Squid Spawning!");
                                    plugin.getConfig().set("Block-Squid", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Squid Spawning!");
                                    plugin.getConfig().set("Block-Squid", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("strider")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Strider Spawning!");
                                    plugin.getConfig().set("Block-Strider", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Strider Spawning!");
                                    plugin.getConfig().set("Block-Strider", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("tropicalfish")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Tropical Fish Spawning!");
                                    plugin.getConfig().set("Block-Tropical-Fish", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Tropical Fish Spawning!");
                                    plugin.getConfig().set("Block-Tropical-Fish", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("turtle")){
                                if(args[4].equalsIgnoreCase("true")) {
                                    player.sendMessage("You have disabled Turtle Spawning!");
                                    plugin.getConfig().set("Block-Turtle", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Turtle Spawning!");
                                    plugin.getConfig().set("Block-Turtle", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("villager")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Villager Spawning!");
                                    plugin.getConfig().set("Block-Villager", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Villager Spawning!");
                                    plugin.getConfig().set("Block-Villager", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("wanderingtrader")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Wandering Trader Spawning!");
                                    plugin.getConfig().set("Block-Wandering-Trader", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Wandering Trader Spawning!");
                                    plugin.getConfig().set("Block-Wandering-Trader", false);
                                }
                            }
                        }
                        if(args[2].equalsIgnoreCase("neutral")){
                            if(args[3].equalsIgnoreCase("bee")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Bee Spawning!");
                                    plugin.getConfig().set("Block-Bee", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Bee Spawning!");
                                    plugin.getConfig().set("Block-Bee", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("goat")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Goat Spawning!");
                                    plugin.getConfig().set("Block-Goat", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Goat Spawning!");
                                    plugin.getConfig().set("Block-Goat", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("irongolem")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Iron Golem Spawning!");
                                    plugin.getConfig().set("Block-Iron-Golem", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Iron Golem Spawning!");
                                    plugin.getConfig().set("Block-Iron-Golem", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("llama")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Llama Spawning!");
                                    plugin.getConfig().set("Block-Llama", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Llama Spawning!");
                                    plugin.getConfig().set("Block-Llama", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("panda")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Panada Spawning!");
                                    plugin.getConfig().set("Block-Panda", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Panda Spawning!");
                                    plugin.getConfig().set("Block-Panda", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("polarbear")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disable Polar Bear Spawning!");
                                    plugin.getConfig().set("Block-Polar-Bear", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Polar Bear Spawning!");
                                    plugin.getConfig().set("Block-Polar-Bear", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("traderllama")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Trader Llama Spawning!");
                                    plugin.getConfig().set("Block-Trader-Llama", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Trader Llama Spawning!");
                                    plugin.getConfig().set("Block-Trader-Llama", false);
                                }
                            }
                            if(args[3].equalsIgnoreCase("wolf")){
                                if(args[4].equalsIgnoreCase("true")){
                                    player.sendMessage("You have disabled Wolf Spawning!");
                                    plugin.getConfig().set("Block-Wolf", true);
                                }
                                if(args[4].equalsIgnoreCase("false")){
                                    player.sendMessage("You have enabled Wolf Spawning!");
                                    plugin.getConfig().set("Block-Wolf", false);
                                }
                            }
                        }
                        if(args[2].equalsIgnoreCase("hostile")){

                        }
                        if(args[2].equalsIgnoreCase("all")){
                            if(args[3].equalsIgnoreCase("true")){
                                player.sendMessage(ChatColor.RED + "You have disabled all mobs from spawning!");
                                plugin.getConfig().set("Block-Axolotl", true);
                                plugin.getConfig().set("Block-Bat", true);
                                plugin.getConfig().set("Block-Bee", true);
                                plugin.getConfig().set("Block-Blaze", true);
                                plugin.getConfig().set("Block-Cat", true);
                                plugin.getConfig().set("Block-Cave-Spider", true);
                                plugin.getConfig().set("Block-Chicken", true);
                                plugin.getConfig().set("Block-Cod", true);
                                plugin.getConfig().set("Block-Cow", true);
                                plugin.getConfig().set("Block-Creeper", true);
                                plugin.getConfig().set("Block-Dolphin", true);
                                plugin.getConfig().set("Block-Donkey", true);
                                plugin.getConfig().set("Block-Drowned", true);
                                plugin.getConfig().set("Block-Elder-Guardian", true);
                                plugin.getConfig().set("Block-Enderman", true);
                                plugin.getConfig().set("Block-Endermite", true);
                                plugin.getConfig().set("Block-Evoker", true);
                                plugin.getConfig().set("Block-Fox", true);
                                plugin.getConfig().set("Block-Ghast", true);
                                plugin.getConfig().set("Block-Glow-Squid", true);
                                plugin.getConfig().set("Block-Goat", true);
                                plugin.getConfig().set("Block-Guardian", true);
                                plugin.getConfig().set("Block-Hoglin", true);
                                plugin.getConfig().set("Block-Horse", true);
                                plugin.getConfig().set("Block-Husk", true);
                                plugin.getConfig().set("Block-Llama", true);
                                plugin.getConfig().set("Block-Magma-Cube", true);
                                plugin.getConfig().set("Block-Mooshrom", true);
                                plugin.getConfig().set("Block-Mule", true);
                                plugin.getConfig().set("Block-Ocelot", true);
                                plugin.getConfig().set("Block-Panda", true);
                                plugin.getConfig().set("Block-Parrot", true);
                                plugin.getConfig().set("Block-Phantom", true);
                                plugin.getConfig().set("Block-Pig", true);
                                plugin.getConfig().set("Block-Piglin", true);
                                plugin.getConfig().set("Block-Piglin-Brute", true);
                                plugin.getConfig().set("Block-Pillager", true);
                                plugin.getConfig().set("Block-Polar-Bear", true);
                                plugin.getConfig().set("Block-Pufferfish", true);
                                plugin.getConfig().set("Block-Rabbit", true);
                                plugin.getConfig().set("Block-Ravager", true);
                                plugin.getConfig().set("Block-Salmon", true);
                                plugin.getConfig().set("Block-Sheep", true);
                                plugin.getConfig().set("Block-Shulker", true);
                                plugin.getConfig().set("Block-Silverfish", true);
                                plugin.getConfig().set("Block-Skeleton", true);
                                plugin.getConfig().set("Block-Skeleton-Horse", true);
                                plugin.getConfig().set("Block-Slime", true);
                                plugin.getConfig().set("Block-Spider", true);
                                plugin.getConfig().set("Block-Squid", true);
                                plugin.getConfig().set("Block-Stray", true);
                                plugin.getConfig().set("Block-Strider", true);
                                plugin.getConfig().set("Block-Trader-Llama", true);
                                plugin.getConfig().set("Block-Tropical-Fish", true);
                                plugin.getConfig().set("Block-Turtle", true);
                                plugin.getConfig().set("Block-Vex", true);
                                plugin.getConfig().set("Block-Villager", true);
                                plugin.getConfig().set("Block-Vindicator", true);
                                plugin.getConfig().set("Block-Wandering-Trader", true);
                                plugin.getConfig().set("Blcok-Warden", true);
                                plugin.getConfig().set("Block-Witch", true);
                                plugin.getConfig().set("Block-Wither-Skeleton", true);
                                plugin.getConfig().set("Block-Wolf", true);
                                plugin.getConfig().set("Block-Zoglin", true);
                                plugin.getConfig().set("Block-Zombie", true);
                                plugin.getConfig().set("Block-Zombie-Horse", true);
                                plugin.getConfig().set("Block-Zombie-Villager", true);
                                plugin.getConfig().set("Block-Zombie-Pigman", true);
                            }
                            if(args[3].equalsIgnoreCase("false")){
                                player.sendMessage(ChatColor.RED + "You have enabled all mobs to spawn!");
                                plugin.getConfig().set("Block-Axolotl", false);
                                plugin.getConfig().set("Block-Bat", false);
                                plugin.getConfig().set("Block-Bee", false);
                                plugin.getConfig().set("Block-Blaze", false);
                                plugin.getConfig().set("Block-Cat", false);
                                plugin.getConfig().set("Block-Cave-Spider", false);
                                plugin.getConfig().set("Block-Chicken", false);
                                plugin.getConfig().set("Block-Cod", false);
                                plugin.getConfig().set("Block-Cow", false);
                                plugin.getConfig().set("Block-Creeper", false);
                                plugin.getConfig().set("Block-Dolphin", false);
                                plugin.getConfig().set("Block-Donkey", false);
                                plugin.getConfig().set("Block-Drowned", false);
                                plugin.getConfig().set("Block-Elder-Guardian", false);
                                plugin.getConfig().set("Block-Enderman", false);
                                plugin.getConfig().set("Block-Endermite", false);
                                plugin.getConfig().set("Block-Evoker", false);
                                plugin.getConfig().set("Block-Fox", false);
                                plugin.getConfig().set("Block-Ghast", false);
                                plugin.getConfig().set("Block-Glow-Squid", false);
                                plugin.getConfig().set("Block-Goat", false);
                                plugin.getConfig().set("Block-Guardian", false);
                                plugin.getConfig().set("Block-Hoglin", false);
                                plugin.getConfig().set("Block-Horse", false);
                                plugin.getConfig().set("Block-Husk", false);
                                plugin.getConfig().set("Block-Llama", false);
                                plugin.getConfig().set("Block-Magma-Cube", false);
                                plugin.getConfig().set("Block-Mooshrom", false);
                                plugin.getConfig().set("Block-Mule", false);
                                plugin.getConfig().set("Block-Ocelot", false);
                                plugin.getConfig().set("Block-Panda", false);
                                plugin.getConfig().set("Block-Parrot", false);
                                plugin.getConfig().set("Block-Phantom", false);
                                plugin.getConfig().set("Block-Pig", false);
                                plugin.getConfig().set("Block-Piglin", false);
                                plugin.getConfig().set("Block-Piglin-Brute", false);
                                plugin.getConfig().set("Block-Pillager", false);
                                plugin.getConfig().set("Block-Polar-Bear", false);
                                plugin.getConfig().set("Block-Pufferfish", false);
                                plugin.getConfig().set("Block-Rabbit", false);
                                plugin.getConfig().set("Block-Ravager", false);
                                plugin.getConfig().set("Block-Salmon", false);
                                plugin.getConfig().set("Block-Sheep", false);
                                plugin.getConfig().set("Block-Shulker", false);
                                plugin.getConfig().set("Block-Silverfish", false);
                                plugin.getConfig().set("Block-Skeleton", false);
                                plugin.getConfig().set("Block-Skeleton-Horse", false);
                                plugin.getConfig().set("Block-Slime", false);
                                plugin.getConfig().set("Block-Spider", false);
                                plugin.getConfig().set("Block-Squid", false);
                                plugin.getConfig().set("Block-Stray", false);
                                plugin.getConfig().set("Block-Strider", false);
                                plugin.getConfig().set("Block-Trader-Llama", false);
                                plugin.getConfig().set("Block-Tropical-Fish", false);
                                plugin.getConfig().set("Block-Turtle", false);
                                plugin.getConfig().set("Block-Vex", false);
                                plugin.getConfig().set("Block-Villager", false);
                                plugin.getConfig().set("Block-Vindicator", false);
                                plugin.getConfig().set("Block-Wandering-Trader", false);
                                plugin.getConfig().set("Block-Warden", false);
                                plugin.getConfig().set("Block-Witch", false);
                                plugin.getConfig().set("Block-Wither-Skeleton", false);
                                plugin.getConfig().set("Block-Wolf", false);
                                plugin.getConfig().set("Block-Zoglin", false);
                                plugin.getConfig().set("Block-Zombie", false);
                                plugin.getConfig().set("Block-Zombie-Horse", false);
                                plugin.getConfig().set("Block-Zombie-Villager", false);
                                plugin.getConfig().set("Block-Zombie-Pigman", false);
                            }
                        }
                    }
                }
                if (args[0].equalsIgnoreCase("reload")) {
                    player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                    player.sendMessage(ChatColor.BLACK + "# " + ChatColor.RED + "Doomsday                 " + ChatColor.BLACK + "#");
                    player.sendMessage(ChatColor.BLACK + "#----------------------------#");
                    player.sendMessage(ChatColor.RED + "We have spotte a reload!");
                    player.sendMessage(ChatColor.RED + "If you start experienceing problems attempt to");
                    player.sendMessage(ChatColor.RED + "restart your server!");
                    plugin.reloadConfig();
                    player.sendMessage(ChatColor.GREEN + "Config has reloaded successfully!");
                }
            }
            return true;
        }
    return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = Arrays.asList("reload", "config");
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
