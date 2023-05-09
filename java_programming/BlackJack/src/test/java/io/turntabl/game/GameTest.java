package io.turntabl.game;

import io.turntabl.card.Card;
import io.turntabl.card.CardSuit;
import io.turntabl.card.CardValue;
import io.turntabl.dealer.Dealer;
import io.turntabl.gameTable.GameTable;
import io.turntabl.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GameTest {
    @Mock
    private GameTable gameTable;
    @Mock
    private Dealer dealer;
    @Mock
    private Player player;

    private Game game;

    @BeforeEach
    void setUp(){
        game = new Game(dealer,gameTable);
    }

    @Test
    void generatePlayers() {
        game.generatePlayers();
        verify(gameTable, atLeast(3)).addPlayer(any(Player.class));
    }

    @Test
    void init(){
        game.init();
        verify(dealer, times(1)).generateCards();
        verify(dealer, times(1)).shuffle();
        verify(gameTable, atLeast(3)).addPlayer(any(Player.class));
    }

    @Test
    void giveInitialCards() {
        LinkedList<Player> players = new LinkedList<>();
        Card card = new Card(CardSuit.HEARTS, CardValue.ACE);
        players.add(new Player(1));
        players.add(new Player(2));
        players.add(new Player(3));
        when(gameTable.getPlayers()).thenReturn(players);
        when(dealer.deal()).thenReturn(card);
        game.giveInitialCards();
        verify(gameTable, times(1)).getPlayers();
        verify(dealer, times(6)).deal();
    }

    @Test
    void checkPlayerStatusWin() {
        when(player.getTotalValue()).thenReturn(21);
        var result = game.checkPlayerStatus(player);
        assertEquals(PlayerStatus.HAS_WON,result);
        verify(player,times(1)).getTotalValue();
    }

    @Test
    void checkPlayerStatusGoBust() {
        when(player.getTotalValue()).thenReturn(25);
        var result = game.checkPlayerStatus(player);
        assertEquals(PlayerStatus.GONE_BUST,result);
        verify(player,times(2)).getTotalValue();
    }

    @Test
    void checkPlayerStatusNone() {
        when(player.getTotalValue()).thenReturn(4);
        var result = game.checkPlayerStatus(player);
        assertEquals(PlayerStatus.NONE,result);
        verify(player,times(2)).getTotalValue();
    }
}