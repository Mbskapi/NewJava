package Animals.Kingdom;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Puppi",1,1,20,50);
        Fish seasFood = new Fish("coate",1,1,1,10,15,2,4);

        Dog dog = new Dog("puppi",20, 25,2,2,1,20);
        dog.Eat();
        dog.shew();
        dog.run();
        seasFood.Eat();
        System.out.println();
    }
}
