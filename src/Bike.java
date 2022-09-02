public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;
    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
        gear = 1;
    }
    public void turnOff() {
        isOn = false;
        gear = 0;
        speed =0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
    public void increaseSpeed(){
        if(isOn)accelerate();
    }
    public void accelerate(){
        if(gear == 1) increaseSpeedOnGear();
        else if(gear == 2)increaseSpeedOnGearTwo();
        else if(gear == 3) increaseSpeedOnGearThree();
        else if (gear == 4) speed += 4;
    }
    public void increaseSpeedOnGear(){
        speed++;
        if(speed > 20)gear++;
    }

    public void increaseSpeedOnGearTwo(){
        speed+=2;
        if(speed >= 31)gear++;
    }

    public void increaseSpeedOnGearThree(){
        speed+=3;
        if(speed >= 41)gear++;
    }

    public int getspeed() {
        return  speed;
    }

    public void DecreaseSpeed() {
    }
}