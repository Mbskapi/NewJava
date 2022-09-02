public class AirConditional {
    private boolean isOn;
    private int temperature = 16;

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }
    public void turnOff() {
         isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
         temperature+=1;

    }
}