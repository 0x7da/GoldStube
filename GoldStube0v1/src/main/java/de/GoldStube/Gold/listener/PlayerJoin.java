package de.GoldStube.Gold.listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.utils.TextFormat;
import de.GoldStube.Gold.Main;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p =  e.getPlayer();


        e.setJoinMessage(Main.prefix + TextFormat.GREEN + p.getName() + " ist nun online!");
        p.sendMessage(Main.prefix + " §eWillkommen auf §6GoldStube§7.net\n§eDu hast Fragen? §7benutze: /hilfe");

    }
}
