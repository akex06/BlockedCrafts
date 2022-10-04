package dev.akex.blockcrafts;

import dev.akex.blockcrafts.commands.Crafts;
import dev.akex.blockcrafts.listeners.OnCraft;
import dev.akex.blockcrafts.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockCrafts extends JavaPlugin {
    public static BlockCrafts instance;

    public static BlockCrafts getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        System.out.println(Data.color("&aPlugin habilitado"));

        loadEvents();
        loadCommands();
    }

    @Override
    public void onDisable() {
        System.out.println(Data.color("&cPlugin deshabilitado :c"));
    }

    public void loadEvents() {
        this.getServer().getPluginManager().registerEvents(new OnCraft(), this);
    }

    public void loadCommands() {
        this.getCommand("crafts").setExecutor(new Crafts());
    }
}
