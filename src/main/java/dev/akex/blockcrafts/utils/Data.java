package dev.akex.blockcrafts.utils;

import dev.akex.blockcrafts.BlockCrafts;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class Data {
    public static String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static FileConfiguration getConfig() {
        FileConfiguration config = BlockCrafts.getInstance().getConfig();
        return config;
    }
}
