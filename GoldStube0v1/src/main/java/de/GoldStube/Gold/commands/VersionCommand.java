package de.GoldStube.Gold.commands;

import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParameter;
import cn.nukkit.utils.TextFormat;
import de.GoldStube.Gold.Main;

public class VersionCommand extends MainCommand {

    public VersionCommand(Main plugin) {
        super(plugin, "version", "version Command", null, new String[]{});
        setPermission("");
        commandParameters.clear();
        commandParameters.put("default", new CommandParameter[] {
                new CommandParameter("help", true)
        });
    }

    public boolean execute(CommandSender commandSender, String s, String[] strings) {
            getPlugin().getLogger().alert(Main.prefix + commandSender.getName() + " hat /version ausgeführt.");
            commandSender.getServer().broadcast(Main.prefix + TextFormat.YELLOW + "| " + commandSender.getName() + " hat /version ausgeführt...", "");
            commandSender.sendMessage("§6GoldStube §7» Unbekannter Befehl. Gebe /hilfe ein, um eine Übersicht der Befehle zu sehen!");
            return false;
        }
}
