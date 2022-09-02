package DataBaseEmployee;

public class CommissionsEmployee {
    private static String firstName;
    private String lastName;
    private double grossSales;

    private double commissionRate;
    private String socialSecurityNumber;


    public CommissionsEmployee(String firstName, String lastName, double grossSales, double commissionRate, String socialSecurityNumber) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("gross sales must");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1) {
            throw new IllegalArgumentException(
                    "commission rate must be > 0.0 and < 1.0");
        }
    }

    public static String getFirstName() {
        return firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return getCommissionRate() * getCommissionRate();
    }


    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());

    }




        }
