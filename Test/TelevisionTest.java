import ShowaRoom.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void checkTelevisionIsOn() {
        Television tv = new Television();
        tv.turnOn();
        assertTrue(tv.isOn());
    }

    @Test
    public void checkTelevisionWillTurnOff() {
        Television tv = new Television();
        tv.turnOn();
        assertTrue(tv.isOn());
        tv.turnOff();
        assertFalse(tv.isOn());
    }

    @Test
    public void checkTelevisionChannelWorkPerfectWellTest(){
        Television tv = new Television();
        tv.turnOn();
        assertTrue(tv.isOn());
        tv.newChannel();
    }

    @Test
    public void checkTelevisionChannelCanBeChangeByOneTest(){
        Television tv = new Television();
        tv.isOn();
        assertEquals(1,tv.getChannel);
        tv.increaseChannel();
        assertEquals(2,tv.getChannel);
    }

    @Test
    public void TelevisionChangeChannelFromOneToTwoTest() {
        Television tv = new Television();
        tv.isOn();
        for (int i = 0; i < 2; i++) {
            tv.increaseChannel();
        }
        assertEquals(3, tv.getChannel);
        tv.newChannel();
        assertEquals(4, tv.getChannel);
    }

    @Test
    public void TelevisionRemoteWorkPerfectTest(){
        Television tv = new Television();
        tv.isOn();
        assertFalse(tv.isOn());
        tv.televisionRemote();
    }
    @Test
    public void checkThatTelevisionIsWorkFine(){
        Television tv = new Television();
        tv.isOn();
        assertFalse(tv.isOn());
        tv.newVolumeLevel();
    }
}

