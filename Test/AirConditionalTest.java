import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {

    @Test
    public void AirConditionalCanBeTurnOn(){
        AirConditional ac = new AirConditional();
        ac.turnOn();
        assertTrue(ac.isOn());
    }
    @Test
    public void AirConditionalCanBeTurnOff(){
        AirConditional ac = new AirConditional();
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.turnOff();
        assertFalse(ac.isOn());
    }
    @Test
    public void AirConditionalCanBeIncreaseTest(){
        AirConditional ac = new AirConditional();
        ac.turnOn();
        assertEquals(16, ac.getTemperature());
            ac.increaseTemperature();
        assertEquals(17,ac.getTemperature());
    }

    @Test
    public void AirConditionalCanIncreaseFromSixteenTest(){
        AirConditional ac = new AirConditional();
        ac.turnOn();
        for (int i = 0; i < 6; i++){
            ac.increaseTemperature();
        }
        assertEquals(22, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(23,ac.getTemperature());
    }

    @Test
    public void AirConditionalCanBeIncreaseByOneTest(){
        AirConditional ac = new AirConditional();
        ac.turnOn();
        for(int i = 0;i < 8; i++) {
            ac.increaseTemperature();
        }
        assertEquals(24, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(25,ac.getTemperature());
    }
        @Test
    public void AirConditionalCanIncreaseByOneTest() {
            AirConditional ac = new AirConditional();
            ac.turnOn();
            for (int i = 0; i < 9; i++) {
                ac.increaseTemperature();
            }
        assertEquals(25,ac.getTemperature());
            ac.increaseTemperature();
            assertEquals(26,ac.getTemperature());
    }
    @Test
    public void checkThatAirConditionalIsIncreasingByOneTest() {
        AirConditional ac = new AirConditional();
        ac.turnOn();
        for (int i = 0; i < 10; i++) {
            ac.increaseTemperature();
        }
        assertEquals(26,ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(27,ac.getTemperature());
     }
    @Test
    public void checkAirConditionalCanIncreaseByOneTest() {
        AirConditional ac = new AirConditional();
        ac.turnOn();
        for (int i = 0; i < 11; i++) {
            ac.increaseTemperature();
        }
        assertEquals(27, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(28, ac.getTemperature());
    }

    @Test
    public void checkAirConditionalCanIncreaseByOneTestAgain() {
        AirConditional ac = new AirConditional();
        ac.turnOn();
        for (int i = 0; i < 12; i++) {
            ac.increaseTemperature();
        }
        assertEquals(28, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(29, ac.getTemperature());
    }

    @Test
    public void AirConditionalCanIncreaseOneTest() {
        AirConditional ac = new AirConditional();
        ac.turnOn();
        for (int i = 0; i < 13; i++) {
            ac.increaseTemperature();
        }
        assertEquals(29, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }


}