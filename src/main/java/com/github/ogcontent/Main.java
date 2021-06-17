package com.github.ogcontent;


import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {
    private static Main instance;
    public static Main getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new Event(), this);
        Objects.requireNonNull(getCommand("goose")).setExecutor(new VersionCommand());
    }
    @Override
    public void onDisable() {
        instance = null;
    }
}
