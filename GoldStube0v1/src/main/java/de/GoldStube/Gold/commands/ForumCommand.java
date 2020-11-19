package de.GoldStube.Gold.commands;

import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParameter;
import de.GoldStube.Gold.Main;

public class ForumCommand extends MainCommand {

    public ForumCommand(Main plugin) {
        super(plugin, "forum", "forum command", null, new String[]{});
        setPermission("");
        commandParameters.clear();
        commandParameters.put("default", new CommandParameter[]{
                new CommandParameter("help", true)
        });
    }

    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        commandSender.sendMessage("§6GoldStube §7» http://GoldStube.net/");
        return false;
    }
}

