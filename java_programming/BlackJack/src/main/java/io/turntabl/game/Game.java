package io.turntabl.game;

import io.turntabl.dealer.Dealer;
import io.turntabl.gameTable.GameTable;
import io.turntabl.player.Player;

import java.util.*;

public class Game {
    private final Dealer dealer;
    private final GameTable gameTable;
    private int numberOfPlayers = 3;
    private static final int WINNING_VALUE = 21;

    public Game(Dealer dealer, GameTable gameTable) {
        this.dealer = dealer;
        this.gameTable = gameTable;
    }

    public void init() {
        dealer.generateCards();
        dealer.shuffle();
        generatePlayers();
    }

    public void runGame() {
        giveInitialCards();
        gameLoop();
        Player winner = checkWinner();
        System.out.println("Player " + winner.getId() + " wins");
        System.out.println("With a total of " + winner.getTotalValue());
        System.out.println();
    }

    public void gameLoop() {
        int previousDeckSize;
        ArrayList<Player> playersGoneBust = new ArrayList<>();
        do {
            previousDeckSize = dealer.getDeck().size();
            playersGoneBust.clear();
            for(Player player: gameTable.getPlayers()) {
                // make player play based on value and
                // strategy
                if(player.getTotalValue() < 17) {
                    player.hit(dealer.deal());
                } else if (player.getTotalValue() >= 17) {
                    player.stick();
                }
                PlayerStatus status = checkPlayerStatus(player);
                if(status == PlayerStatus.HAS_WON) {
                    return; // games ends
                }
                if(status == PlayerStatus.GONE_BUST) {
                    playersGoneBust.add(player);
                }
            }
            gameTable.goBust(playersGoneBust);
        } while (checkGameEnd(previousDeckSize));
    }

    public boolean checkGameEnd(int previousDeckSize) {
        if(gameTable.getPlayers().size() < 2) {
            return false;
        }
        return previousDeckSize != dealer.getDeck().size();
    }

    public Player checkWinner() {
        if(gameTable.getPlayers().size() == 1) {
            return gameTable.getPlayers().get(0);
        }
//        Optional<Player> winner = gameTable.getPlayers()
//                .stream()
//                .filter((player) -> player.getTotalValue() <= 21)
//                .max(Comparator.comparingInt(Player::getTotalValue));
        List<Player> filteredPlayers = new ArrayList<>();
        Player winner = null;
        int maxValue = 0;
        for(Player player: gameTable.getPlayers()) {
            if(player.getTotalValue() <= 21) {
                filteredPlayers.add(player);
            }
        }
        for(Player player: filteredPlayers) {
            if(player.getTotalValue() > maxValue) {
                winner = player;
                maxValue = player.getTotalValue();
            }
        }
//        return winner.orElse(null);
        return winner;
    }

    public PlayerStatus checkPlayerStatus(Player player) {
        if(player.getTotalValue() == WINNING_VALUE) {
            return PlayerStatus.HAS_WON;
        }
        if(player.getTotalValue() > 21) {
            return PlayerStatus.GONE_BUST;
        }
        return PlayerStatus.NONE;
    }

    public void giveInitialCards() {
        LinkedList<Player> players = gameTable.getPlayers();
        for(int i = 0; i < numberOfPlayers; i++) {
            players.get(i).addInitCards(dealer.deal(), dealer.deal());
        }
    }

    public void generatePlayers() {
        for(int i = 1; i <= numberOfPlayers; i++) {
            gameTable.addPlayer(new Player(i));
        }
    }
}
