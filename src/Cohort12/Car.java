package Cohort12;

public class Car {
    private int door;
    private int wheel;
    private String engine;
    private String colour;
    private String models;

    public void setModels(String model) {
        String validModel = model.toLowerCase();
        if(model.equals("benz")){
        this.models = models;
    }else{
    this.models = "Unknown";
    }
    }
    public String getModels(){
        return models;
    }
    public String getEngine(String bettel){
        return engine;
    }
    public void setColour( String colour1){
        this.colour = colour1;
    }
    public String getColour(){
        return colour;
    }
}
