package Animals.Kingdom;

public class Fish extends Animal{
    private int fins;
    private int eye;
    private int gills;

    public Fish(String name, int brain, int body, int size, int weight, int fins, int eye, int gills) {
        super(name, brain, body, size, weight);
        this.fins = fins;
        this.eye = eye;
        this.gills = gills;
    }
    private void rest(){
        System.out.println("creature that reside in water");
    }
    private void moveMuscle(){

    }
    private  void moveBackFins(){
        System.out.println("fish swim only in water");

    }

    private void swim(){
        moveMuscle();
        moveBackFins();
        super.move();
        System.out.println();

    }
}
