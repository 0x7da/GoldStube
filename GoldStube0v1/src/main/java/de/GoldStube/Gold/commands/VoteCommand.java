package de.GoldStube.Gold.commands;

import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParameter;
import de.GoldStube.Gold.Main;

public class VoteCommand extends MainCommand{

    public VoteCommand(Main plugin) {
        super(plugin, "vote", "vote command", null, new String[]{});
        setPermission("");
        commandParameters.clear();
        commandParameters.put("default", new CommandParameter[]{
                new CommandParameter("help", true)
            });
        }

        public boolean execute(CommandSender commandSender, String s, String[] strings) {
            commandSender.sendMessage("§6GoldStube §7» http://GoldStube.net/vote");
            return false;
        }
    }
