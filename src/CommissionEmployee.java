public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {

        if (grossSales <= 0.0) {
            throw new IllegalArgumentException("gross sales must be >= 0.0");


        }
        if (commissionRate < 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("commission rate must be > 0.0 || commission < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales(double grossSales) {
        return grossSales;
    }

    public double getCommissionRate(double commissionRate) {
        return commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSales;

    }


    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("gross sales must be >= 0.0");

        }
        this.grossSales = grossSales;

    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("commission rate must be > 0.0 and commission < 1.0");

        }
        this.commissionRate = commissionRate;


    }

        @Override
    public String toString(){
       return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%n: %.2f",
               "commission employee", firstName, lastName,
               "social security number", socialSecurityNumber,
               "gross sales", grossSales,
               "commission rate", commissionRate);
    }
}


