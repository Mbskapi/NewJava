package ForestCreature;


public abstract class Animal {

    private int size;

    private String eat;
    private String name;
    private String breed;

    public Animal(String eat,int size,String name, String breed){
        this.eat = eat;
        this.name = name;
        this.breed = breed;
        this.size = size;

    }
    public Animal(){}

    public void eat(){
        System.out.println("i am on a steady walk");
    }

    public void size(){
        System.out.println("my pig is large");
    }
    public void breed(){
        System.out.println("my local igbo brought");
    }
    public void name(){
        System.out.println("the name is full");
    }

}