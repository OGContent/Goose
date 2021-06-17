package com.github.ogcontent;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class VersionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) { //If you have any suggestion on this file, make a suggestion or a pull request and i'll look into it
        if (args.length == 0) {
            sender.sendMessage(ChatColor.AQUA + "I WILL TAKE OVER THE WORLD, HAHAHAHA" + " oh and you can only do /goose version for now ");
            return true;
        } else if (args[0].equalsIgnoreCase("version")) {
            sender.sendMessage(ChatColor.GREEN + "Goose version: 1.1");
            return true;
        }
        return true;
    }
}
