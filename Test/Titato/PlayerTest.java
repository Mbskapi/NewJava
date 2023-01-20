package Titato;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Titato.Mark.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player1;
    private Player player2;
    private Board board;

    @BeforeEach
    void setUp() {
         player1 = new Player(X);
         player2 = new Player(O);
         board = new Board();
    }
    @Test
    void testThatBoardCellAreEmpty(){
        var  boardSurface = board.getBoardSurface();
        assertEquals(E, boardSurface[0][0]);

    }
    @Test
    void testThatBoardSurfaceCanBeDisplay(){
        board.displayBoardSurface();
    }
    @Test
    void testThatXShouldAppearPositionThatPlayer1(){
        player1.playerGame(4, board);
        var boardSurface = board.getBoardSurface();
        assertEquals(X,boardSurface[1][0]);

    }

    @Test
    void testThatOShouldAppearPositionThatPlayer1() {
        var boardSurface = board.getBoardSurface();
        for (int i = 1; i < 10; i++) {
            player2.playerGame(i, board);

        }
        assertEquals(O, boardSurface[1][2]);
    }
    @Test
    void testThatTwoPlayerCanPlayTheSamePosition(){


    }
}
