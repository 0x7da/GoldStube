package de.GoldStube.Gold.commands;

import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParameter;
import de.GoldStube.Gold.Main;

public class HelpCommand extends MainCommand {

    public HelpCommand(Main plugin) {
        super(plugin, "help", "help command", null, new String[]{});
        setPermission("");
        commandParameters.clear();
        commandParameters.put("default", new CommandParameter[]{
                new CommandParameter("help", true)
        });
    }

    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        commandSender.sendMessage("§6GoldStube §7» Unbekannter Befehl. Gebe /hilfe ein, um eine Übersicht der Befehle zu sehen!");
        return false;
    }
}
