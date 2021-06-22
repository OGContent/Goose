package com.github.ogcontent;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;


import org.bukkit.event.player.PlayerMoveEvent;
import ru.beykerykt.lightapi.LightAPI;

import java.util.Objects;

// why is this here


public class Event implements Listener {
    @EventHandler
    public void Breed4(EntityBreedEvent e) {
        if (e.getFather().getType().equals(EntityType.CHICKEN)) {
            Entity child = e.getEntity();
            child.setInvulnerable(true);
            Location exactLoc = child.getLocation();
            Objects.requireNonNull(exactLoc.getWorld()).createExplosion(exactLoc, 10, true);
            child.setCustomName("Goose");
            if (!exactLoc.add(0, 5, 0).getBlock().getType().isSolid()) {
                child.teleport(exactLoc.add(0, 5, 0));
            }
            child.setInvulnerable(false);
        }
    }
}
