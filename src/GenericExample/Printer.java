package GenericExample;

import Animals.Kingdom.Animal;

import java.io.Serializable;

public class Printer <T extends Animal & Serializable  > {
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        thingToPrint.Eat();
        System.out.println(thingToPrint);
    }

    public void something() {

    }

}
