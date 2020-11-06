package de.bungee.main;

import de.bungee.commands.Ping;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

    @Override
    public void onEnable() {
        super.onEnable();
        System.out.println("AlphaBungeeSystem online");

        getProxy().getPluginManager().registerCommand(this, new Ping());

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
