package de.GoldStube.Gold.listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.utils.TextFormat;
import de.GoldStube.Gold.Main;

public class PlayerQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p =  e.getPlayer();

        p.setGamemode(0);
        p.setHealth(0);
        e.setQuitMessage(Main.prefix + TextFormat.RED + p.getName() + " ist nun offline!");
    }
}

