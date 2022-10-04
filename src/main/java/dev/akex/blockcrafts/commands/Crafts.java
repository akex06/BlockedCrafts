package dev.akex.blockcrafts.commands;

import dev.akex.blockcrafts.BlockCrafts;
import dev.akex.blockcrafts.utils.Data;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Crafts implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(Data.color("&aSubcomandos disponibles: reload"));
        } else if (args[0].equals("reload")) {
            BlockCrafts.getInstance().reloadConfig();
            sender.sendMessage(Data.color("&aLa configuracion se ha recargado"));
        }

        return true;
    }
}
