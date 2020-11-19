package de.GoldStube.Gold.commands;

import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParameter;
import de.GoldStube.Gold.Main;

public class GoldCommand extends MainCommand {

    public GoldCommand(Main plugin) {
        super(plugin, "gold", "gold Command", null, new String[]{});
        setPermission("");
        commandParameters.clear();
        commandParameters.put("default", new CommandParameter[]{
                new CommandParameter("help", true)
        });
    }

    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        commandSender.sendMessage("§eDas Plugin wurde von §aNilsScriptDE §eentwickelt!");
        return false;
    }
}
