import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
     Turtles ijapa;

     @BeforeEach
    public void jennyWantsThis() {
         ijapa = new Turtles();
    }

    @Test
    public void thereIsATurtle() {
        assertNotNull(ijapa);
    }

    @Test
    public void testTurtleCanMovePenUp() {
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanTurnRight_WhileFacingEastTest() {
         assertEquals(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurn_WhileFacingSouthTest() {
        ijapa.turnRight();
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
    }

    //todo turn turtle right facing west and north
    @Test
    public void turtleCanTurnLeft_WhileFacingNorthTest() {
        ijapa.turnleft();
        assertEquals(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeft_WhileFacingSouth(){
        ijapa.turnRight();
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_WhileFacingEastTest(){
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertEquals(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertEquals(Direction.SOUTH,ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
}
@Test
    public void  turtleCanMoveWhileFacingEast(){
        assertEquals(new position(0,0), ijapa.getCurrentPosition());
        ijapa.move(3);
        assertEquals(new position(0,3),ijapa.getCurrentPosition());
}
}
