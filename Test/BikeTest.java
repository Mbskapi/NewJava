import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void bikeCanBeTurnedOnTest() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeCanBeTurnedOffTest() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void bikeCanBeAcceleratedOnGearOneTest() {
        Bike bike = new Bike();
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(1, bike.getSpeed());

    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.increaseSpeed();
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearTwoTest() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.increaseSpeed();
        }
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getspeed());

    bike.increaseSpeed();
    assertEquals(23, bike.getSpeed());
    assertEquals(2,bike.getGear());

}
    @Test
    public void bikeCanChangeFromGearToGearThree() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(2,bike.getGear());
        assertEquals(29,bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(31,bike.getspeed());
        assertEquals(3,bike.getGear());
    }
    @Test
    public void bikeSpeedCanBeFromTest(){
        Bike bike = new Bike();
        bike.turnOn();
        for(int i = 0; i < 10; i++) {
            bike.increaseSpeed();
        }
        assertEquals(10,bike.getSpeed());
        assertEquals(1,bike.getGear());
    }
    @Test
    public void bikeCanAccelerateFromThreeToFourTest(){
        Bike bike = new Bike();
        bike.turnOn();
        assertEquals(1, bike.getGear());

        for(int i = 0; i < 24; i++) {
            bike.increaseSpeed();
        }
        assertEquals(27, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.increaseSpeed();

        assertEquals(2,bike.getGear());
        assertEquals(29,bike.getspeed());
    }
    @Test
    public void bikeCanAccelerateFromGearThreeToGearFour(){
        Bike bike = new Bike();
        bike.turnOn();

        for(int i = 0; i < 26; i++) {
            bike.increaseSpeed();
        }
        assertEquals(31,bike.getSpeed());
        assertEquals(3,bike.getGear());
    }
}