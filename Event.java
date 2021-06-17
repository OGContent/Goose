package com.github.ogcontent;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

// why is this here


public class Event implements Listener {

    @EventHandler
    public void Breed4(EntityBreedEvent e) {
        if (e.getFather().getType().equals(EntityType.CHICKEN)) {
            Entity child = e.getEntity();
            child.setInvulnerable(true);
            child.getLocation().createExplosion(10, false);
            child.setCustomName("Goose");
            if (!child.getLocation().add(0, 5, 0).getBlock().isSolid()) {
                child.teleport(child.getLocation().add(0, 5, 0));
            }
            child.setInvulnerable(false);
        }
    }
}