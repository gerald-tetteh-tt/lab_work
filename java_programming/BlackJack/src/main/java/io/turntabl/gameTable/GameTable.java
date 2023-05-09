package io.turntabl.gameTable;

import io.turntabl.player.Player;

import java.util.LinkedList;
import java.util.List;

public class GameTable {
    private final LinkedList<Player> players;

    public GameTable() {
        players = new LinkedList<>();
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    // remove a player from the game
    public void goBust(List<Player> bustPlayers) {
        players.removeAll(bustPlayers);
        for(Player player: bustPlayers) {
            System.out.println("Player " + player.getId() + " has gone bust");
            System.out.println();
        }
    }
}
