package me.bigtallahasee.doomsday;

import jdk.jpackage.internal.Log;
import me.bigtallahasee.doomsday.commands.AdminCommands;
import me.bigtallahasee.doomsday.commands.RegCommands;
import me.bigtallahasee.doomsday.events.*;
import me.bigtallahasee.doomsday.mobevents.BlacklistMobs;
import me.bigtallahasee.doomsday.utils.Settings;
import me.bigtallahasee.doomsday.utils.UpdateChecker;
import me.bigtallahasee.doomsday.zombieevents.DisableZombieExp;
import me.bigtallahasee.doomsday.zombieevents.ZombieCombustion;
import me.bigtallahasee.doomsday.zombieevents.ZombieDeathReward;
import me.bigtallahasee.doomsday.zombieevents.ZombieStats;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import me.bigtallahasee.doomsday.utils.Logger;




public final class Doomsday extends JavaPlugin {

    public static Economy econ = null;
    private String author = "BigTallahasee";
    private String title = "Doomsday";
    private String version = "1.1.0";

    private String month = "7";
    private String day = "6";
    private String year = "2021";
    private String dateCreated = month + "/" + day + "/" + year;


    @Override
    public void onEnable() {
        Logger.log(Logger.LogLevel.SUCCESS,"Attempting to locate "+  title + " " + version + " created by " + author);
        Logger.log(Logger.LogLevel.SUCCESS, "Located " +title + " " + version);


        getServer().getPluginManager().registerEvents(new LeaveBed(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerDeathReward(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new DeathMessage(), this);
        getServer().getPluginManager().registerEvents(new ZombieCombustion(), this);
        getServer().getPluginManager().registerEvents(new ZombieStats(), this);
        getServer().getPluginManager().registerEvents(new ZombieDeathReward(), this);
        getServer().getPluginManager().registerEvents(new DisableZombieExp(), this);
        getServer().getPluginManager().registerEvents(new BlacklistMobs(), this);


        getCommand("dday").setExecutor(new RegCommands());
        getCommand("dday").setTabCompleter(new RegCommands());
        getCommand("ddayadmin").setExecutor(new AdminCommands());
        getCommand("ddayadmin").setTabCompleter(new AdminCommands());

        Logger.log(Logger.LogLevel.SUCCESS, "Loading up config.yml! Please Wait!!!");

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Update Checker
        new UpdateChecker(this, 96701).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                Logger.log(Logger.LogLevel.SUCCESS, ("Doomsday is up to date!"));
            } else {
                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
                Logger.log(Logger.LogLevel.WARNING, ("Doomsday is outdated!"));
                Logger.log(Logger.LogLevel.WARNING, ("Newest version: " + version));
                Logger.log(Logger.LogLevel.WARNING, ("Your version: " + Settings.VERSION));
                Logger.log(Logger.LogLevel.WARNING, ("Please Update Here: " + Settings.PLUGIN_URL + UpdateChecker.resourceId));
                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
            }
        });

        if (!setupEconomy() ) {
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        Logger.log(Logger.LogLevel.SUCCESS, title + " " + version + " created by " + author );
        Logger.log(Logger.LogLevel.SUCCESS, "Created on " + dateCreated + " has been Enabled!");
        Logger.log(Logger.LogLevel.SUCCESS, "Thank you all and let me know what you all think :D");
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;

    }
}
