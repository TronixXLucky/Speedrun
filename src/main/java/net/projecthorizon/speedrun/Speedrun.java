package net.projecthorizon.speedrun;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Speedrun extends JavaPlugin {

    public static String prefix = "§7[§8Speedrun§7] ";

    private static PluginManager pm;

    @Override
    public void onEnable() {

        pm = Bukkit.getPluginManager();

    }

    @Override
    public void onDisable() {
    }
}
