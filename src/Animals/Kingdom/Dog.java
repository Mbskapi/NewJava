package Animals.Kingdom;

public class Dog extends Animal {
    private int eye;
    private int legs;
    private int tail;
    private int teeth;


    public Dog(String name,  int size,
               int weight, int eye, int legs, int tail, int teeth) {
        super(name,1,1, size, weight);
                this.eye = eye;
            this.legs = legs;
            this.tail = tail;
            this.teeth = teeth;
        }
        public void shew(){
            System.out.println("bingo is shewing");
        }

    @Override
    public void Eat() {
        System.out.println("Dog.chew() calling");
        shew();
        super.Eat();
    }
    public void walk(){
        System.out.println("the dog walk very slow");
    }
    public void run(){
        System.out.println("roth run so far");
    }

}
//    public int getEye() {
//        return eye;
//    }
//
//    public void setEye(int eye) {
//        this.eye = eye;
//    }
//
//    public int getLegs() {
//        return legs;
//    }
//
//    public void setLegs(int legs) {
//        this.legs = legs;
//    }
//
//    public int getTail() {
//        return tail;
//    }
//
//    public void setTail(int tail) {
//
