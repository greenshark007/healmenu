package me.itz_jeboydijk.voteplugin2;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Gui(), this);
        getServer().getPluginCommand("heal").setExecutor(new GuiCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
