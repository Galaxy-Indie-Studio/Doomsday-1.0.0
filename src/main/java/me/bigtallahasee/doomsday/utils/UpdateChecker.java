package me.bigtallahasee.doomsday.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import org.bukkit.Bukkit;
import org.bukkit.util.Consumer;

import me.bigtallahasee.doomsday.Doomsday;

public class UpdateChecker {
    public static int resourceId;
    private Doomsday plugin;

    public UpdateChecker(Doomsday plugin, int resourceId) {
        this.plugin = plugin;
        UpdateChecker.resourceId = resourceId;
    }

    public void getLatestVersion(Consumer<String> consumer) {
        Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
            try (InputStream inputStream = new URL("https://api.spigotmc.org/legacy/update.php?resource=" + UpdateChecker.resourceId).openStream(); Scanner scanner = new Scanner(inputStream)) {
                if (scanner.hasNext()) {
                    consumer.accept(scanner.next());
                }
            } catch (IOException exception) {
                this.plugin.getLogger().info("Cannot look for updates: " + exception.getMessage());
            }
        });
    }
}
