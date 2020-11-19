package de.GoldStube.Gold.commands;

import cn.nukkit.command.data.CommandParameter;
import cn.nukkit.command.CommandSender;
import de.GoldStube.Gold.Main;

public class DiscordCommand extends MainCommand {

    public DiscordCommand(Main plugin) {
        super(plugin, "discord", "discord command", null, new String[]{});
        setPermission("");
        commandParameters.clear();
        commandParameters.put("default", new CommandParameter[]{
                new CommandParameter("help", true)
        });
    }

    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        commandSender.sendMessage("§6GoldStube §7» https://discord.gg/sUqztfjpq4");
        return false;
    }
}

