package com.github.ogcontent;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) { //If you have any suggestion on this file, make a suggestion or a pull request and i'll look into it
        if (args.length == 0) {
            sender.sendMessage(ChatColor.AQUA + "I WILL TAKE OVER THE WORLD, HAHAHAHA" + " oh and you can only do /goose version and /goose spawn for now ");
            return true;
        } else if (args[0].equalsIgnoreCase("version")) {
            sender.sendMessage(ChatColor.GREEN + "Goose version: 1.1");
            return true;
        } else if (args[0].equalsIgnoreCase("spawn")) {
            if (sender.hasPermission("goose.spawn")) {
                if (sender instanceof Player) {
                    Player plr = (Player) sender;
                    plr.setInvulnerable(true);
                    plr.getWorld().createExplosion(plr.getLocation(), 10, false);
                    Entity child = (Entity) plr.getWorld().spawnEntity(plr.getLocation(), EntityType.CHICKEN);
                    child.setInvulnerable(true);
                    child.setCustomName("Goose");
                    child.setInvulnerable(false);
                } else {
                    Bukkit.getLogger().info("Console executing a player command.");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "No perms.");
            }
        }
        return true;
    }

}
