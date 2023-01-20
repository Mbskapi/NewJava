public class Carl {
    private  String model;
    private String year;
    private double price;

    public String getModel() {
        return model;
    }

    public Carl(String model, String year, double price) {
        if (price <= 0) {
            throw new RuntimeException("fuck you");
        } else {
            this.price = price;
        }
        this.model = model;
        this.year = year;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("fuck you");
        } else {
            this.price = price;
        }


    }
}
