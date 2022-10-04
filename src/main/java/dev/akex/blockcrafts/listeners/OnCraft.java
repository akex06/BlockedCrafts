package dev.akex.blockcrafts.listeners;

import dev.akex.blockcrafts.BlockCrafts;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

import java.util.List;

public class OnCraft implements Listener {
    @EventHandler
    public static void onCraft(CraftItemEvent event) {
        FileConfiguration config = BlockCrafts.getInstance().getConfig();
        List<?> blocked = config.getList("blocked_crafts");

        Player player = ((Player) event.getWhoClicked()).getPlayer();
        String item = event.getCurrentItem().getType().toString().toLowerCase();

        if (blocked.contains(item)) {
            event.setCancelled(true);
        }

    }
}
