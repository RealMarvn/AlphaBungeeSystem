package de.bungee.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Ping extends Command {

    public Ping() {
     super("getip");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
    if (sender instanceof ProxiedPlayer){
        ProxiedPlayer player = (ProxiedPlayer) sender;
        int ping = player.getPing();

            player.sendMessage(ChatColor.GREEN + "Dein ping: " + ping);

    }
    }
}
