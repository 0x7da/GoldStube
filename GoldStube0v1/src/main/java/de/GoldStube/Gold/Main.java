package de.GoldStube.Gold;

import cn.nukkit.command.SimpleCommandMap;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import cn.nukkit.utils.TextFormat;
import de.GoldStube.Gold.commands.*;
import de.GoldStube.Gold.listener.PlayerJoin;
import de.GoldStube.Gold.listener.PlayerQuit;


public class Main extends PluginBase {


    public static final String prefix = TextFormat.RED + "GoldStube " + TextFormat.GRAY + "» ";
    public static final String skincloud = TextFormat.GREEN + "» SkinCloud ";
    public static final String error = TextFormat.BOLD + "» ERROR";


    public void onEnable() {

        super.onEnable();

        this.registerCommands();
        this.registerListener();

        this.getLogger().info(TextFormat.GOLD + "GoldStube System wurde aktiviert!");

        getServer().getCommandMap().getCommands().remove("me");
        getServer().getCommandMap().getCommands().remove("say");
        getServer().getCommandMap().getCommands().remove("reload");
        getServer().getCommandMap().getCommands().remove("ban");
        getServer().getCommandMap().getCommands().remove("ban-ip");
        getServer().getCommandMap().getCommands().remove("pardon");
        getServer().getCommandMap().getCommands().remove("pardon-ip");
    }

    public void onDisable() {
        this.getLogger().info(TextFormat.RED + "Das Plugin wurde deaktiviert!");
    }

    public void registerCommands() {
        SimpleCommandMap map = getServer().getCommandMap();

        map.register("gold", new GoldCommand(this));
        map.register("version", new VersionCommand(this));
        map.register("hilfe", new HilfeCommand(this));
        map.register("discord", new DiscordCommand(this));
        map.register("forum", new ForumCommand(this));
        map.register("vote", new VoteCommand(this));
        map.register("help", new HelpCommand(this));
        map.register("gamemode",new GamemodeCommand(this));

    }

    public void registerListener() {
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new PlayerJoin(), this);
        pm.registerEvents(new PlayerQuit(), this);
    }
}
