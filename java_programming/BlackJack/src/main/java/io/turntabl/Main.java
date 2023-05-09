package io.turntabl;

import io.turntabl.dealer.Dealer;
import io.turntabl.game.Game;
import io.turntabl.gameTable.GameTable;

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        GameTable gameTable = new GameTable();
        Game game = new Game(dealer,gameTable);
        game.init();
        game.runGame();
    }
}