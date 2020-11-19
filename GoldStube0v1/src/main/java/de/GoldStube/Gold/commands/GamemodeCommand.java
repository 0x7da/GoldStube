package de.GoldStube.Gold.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandEnum;
import cn.nukkit.command.data.CommandParamType;
import cn.nukkit.command.data.CommandParameter;
import de.GoldStube.Gold.Main;

public class GamemodeCommand extends MainCommand {

    public GamemodeCommand(Main plugin) {
        super(plugin, "gamemode", "gamemode command", null, new String[]{});
        this.setPermission("gamemode.use");
        this.commandParameters.clear();
        this.commandParameters.put("default", new CommandParameter[]{CommandParameter.newType("gameMode", CommandParamType.INT), CommandParameter.newType("player", true, CommandParamType.TARGET)});
        this.commandParameters.put("byString", new CommandParameter[]{CommandParameter.newEnum("gameMode", CommandEnum.ENUM_GAMEMODE), CommandParameter.newType("player", true, CommandParamType.TARGET)});
    }

    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§6GoldStube §7» /gamemode");
            return false;
        } else {
            int gameMode = Server.getGamemodeFromString(args[0]);
            if (gameMode == -1) {
                sender.sendMessage("§6GoldStube §7» Unbekannter Befehl");
                return true;
            } else {
                CommandSender target = sender;
                if (args.length > 1) {
                    if (!sender.hasPermission("gamemode.use")) {
                        sender.sendMessage("§6GoldStube §7» Du hast keine Rechte ");
                        return true;
                    }

                    target = sender.getServer().getPlayer(args[1]);
                    if (target == null) {
                        sender.sendMessage("§6GoldStube §7» Spieler wurde nicht gefunden");
                        return true;
                    }
                } else if (!(sender instanceof Player)) {
                    sender.sendMessage("§6GoldStube §7» Benutz /gamemode 0:1:2:3");
                    return true;
                }

                if (gameMode == 0 && !sender.hasPermission("gamemode.use") || gameMode == 1 && !sender.hasPermission("gamemode.use") || gameMode == 2 && !sender.hasPermission("gamemode.use") || gameMode == 3 && !sender.hasPermission("gamemode.use")) {
                    sender.sendMessage(("§6GoldStube §7» Du hast keine Rechte"));
                    return true;
                } else {
                    if (!((Player)target).setGamemode(gameMode)) {
                        sender.sendMessage("§6GoldStube §7» Gamemode Wechselt von " + ((CommandSender)target).getName() + " ist nicht möglich");
                    } else if (target.equals(sender)) {
                        ((CommandSender)target).sendMessage("§6GoldStube §7» Gamemode wurde geändert");
                    }

                    return true;
                }
            }
        }
    }
}
