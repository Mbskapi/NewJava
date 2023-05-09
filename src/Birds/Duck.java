package Birds;

public class Duck {
    private String QuackBehaviour;
    private String FlyBehaviour;
    private String DisplaceBehaviour;
    private String swimBehaviour;
    private String eatBehaviour;


    public Duck(String quackBehaviour, String flyBehaviour, String displaceBehaviour, String swimBehaviour, String eatBehaviour) {
        QuackBehaviour = quackBehaviour;
        FlyBehaviour = flyBehaviour;
        DisplaceBehaviour = displaceBehaviour;
        this.swimBehaviour = swimBehaviour;
        this.eatBehaviour = eatBehaviour;
    }


    public String getQuackBehaviour() {
        System.out.println("quacking slow, dont like disturbance");
        return QuackBehaviour;
    }

    public String getFlyBehaviour() {
        System.out.println("waiting time to prepare myself to fry");
        return FlyBehaviour;
    }



    public String getDisplaceBehaviour() {
        System.out.println(" special style for gladling on the wind difference");
        return DisplaceBehaviour;
    }


    public String getSwimBehaviour() {
        System.out.println("i on floating on water like i own it");
        return swimBehaviour;
    }


    public String getEatBehaviour() {
        System.out.println(" the dock pattern of eating pipipiiii");
        return eatBehaviour;
    }

}