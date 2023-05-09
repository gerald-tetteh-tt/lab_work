package io.turntabl.gameTable;

import io.turntabl.player.Player;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTableTest {
    private GameTable gameTable;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    StringWriter expectedStringWriter;
    PrintWriter printWriter;

    @BeforeEach
    void setUp() {
        gameTable = new GameTable();
        System.setOut(new PrintStream(outputStreamCaptor));
        expectedStringWriter = new StringWriter();
        printWriter = new PrintWriter(expectedStringWriter);
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void getPlayers() {
        assertEquals(0,gameTable.getPlayers().size());
        gameTable.addPlayer(new Player(85638));
        assertEquals(1,gameTable.getPlayers().size());
    }

    @Test
    void addPlayer() {
      Player player = new Player(4782);
      gameTable.addPlayer(player);
      assertEquals(1,gameTable.getPlayers().size());
      assertEquals(player,gameTable.getPlayers().get(0));
    }

    @Test
    void goBust() {
        Player player = new Player(2196);
        ArrayList<Player> bustPlayers = new ArrayList<>();
        bustPlayers.add(player);
        gameTable.addPlayer(player);
        gameTable.goBust(bustPlayers);
        assertEquals(0,gameTable.getPlayers().size());
        printWriter.println("Player 2196 has gone bust");
        printWriter.println();
        printWriter.close();
        assertEquals(expectedStringWriter.toString().trim(),outputStreamCaptor.toString().trim());
    }
}