package me.noob.minecraft.nodrop.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Nodrop implements Listener {

    @EventHandler
    public void onJump(PlayerDropItemEvent e){
        e.getPlayer().damage(200);
    }

}