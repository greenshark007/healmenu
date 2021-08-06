package me.itz_jeboydijk.voteplugin2;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuiCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Bukkit.getServer().getPluginManager().callEvent(new GuiEvent((Player) sender));
            return true;
        }else{
            Bukkit.getLogger().info("you must be a player to run this command");
        }

        return false;
    }
}
