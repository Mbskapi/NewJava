public class Car{
    private String name;
    private String model;
    private double price;
    private String year;

    public Car(String name, String model, double price, String year) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

         public void setName(String name){
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }


}



