package ShowaRoom;

public class Television {
    public int getChannel = 1;
    private int volumeLevel = 1;
    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }
    public void stChannel(int newChannel) {
        //if(on && newChannel >= 1 && newChannel <= 120)
          // channel = newChannel;
    }
    public void televisionRemote() {
    }
    public int getChannel() {
        return getChannel+=1;
    }
    public void newChannel() {
    }
    public void newVolumeLevel() {
    }
    public void increaseChannel() {

        //if(on && channel < 120)
            //channe++;
    }
}
