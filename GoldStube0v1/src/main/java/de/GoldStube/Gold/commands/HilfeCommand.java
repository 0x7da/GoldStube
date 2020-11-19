package de.GoldStube.Gold.commands;

import cn.nukkit.command.data.CommandParameter;
import cn.nukkit.command.CommandSender;
import de.GoldStube.Gold.Main;

public class HilfeCommand extends MainCommand {

    public HilfeCommand(Main plugin) {
        super(plugin, "hilfe", "hilfe command", null, new String[]{});
        setPermission("");
        commandParameters.clear();
        commandParameters.put("default", new CommandParameter[]{
                new CommandParameter("help", true)
        });
    }

    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        commandSender.sendMessage("§7============ §eGoldStube §fHilfe §7=================");
        commandSender.sendMessage("§7/plot auto §esuch ein freies Plot");
        commandSender.sendMessage("§7/plot trust §eadde ein Helfer auf dein Plot");
        commandSender.sendMessage("§7/plot middle §egelang in die Mitte");
        commandSender.sendMessage("§7/plot deny §eban ein  Spieler vom Plot");
        commandSender.sendMessage("§7/plot clear §elösch dein Plot");
        commandSender.sendMessage("§7/plot kick §eschmeiß ein Spieler vom Plot");
        commandSender.sendMessage("§7/plot help §eSieh alle Plot Commands");
        commandSender.sendMessage("§7/plot give §egib ein Spieler dein Plot");
        commandSender.sendMessage("§7/plot reset §eresetet das Plot");
        commandSender.sendMessage("§7/plot add §eFüg ein Helfer hinzu");
        commandSender.sendMessage("§7/plot home §e[name] gelange zum Spieler Plot");
        commandSender.sendMessage("§7/plot home §egelang zu dein Plot");
        commandSender.sendMessage("§7/plot claim §ebeanspruch ein Plot");
        commandSender.sendMessage("§7/plot remove §eentfernt ein Trust Spieler");
        commandSender.sendMessage("§7/plot merge §everbinde deine Plots");
        commandSender.sendMessage("§7/plot unmerge §eunmerge deine Plots");
        commandSender.sendMessage("§7/plot flag §everwalte deine Plot flags");
        commandSender.sendMessage("§7/plot sethome §esetz dein Plot Spawn");
        commandSender.sendMessage("§7============ §eGoldStube §fHilfe §7=================");
        return false;
    }
}

