package me.noob.minecraft.nodrop;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Nodrop extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.RED + "No Drop has successfully loaded");
        getServer().getPluginManager().registerEvents(new me.noob.minecraft.nodrop.Events.Nodrop(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
