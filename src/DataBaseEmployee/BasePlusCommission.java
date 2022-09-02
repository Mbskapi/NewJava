package DataBaseEmployee;

public class BasePlusCommission extends CommissionsEmployee {
    private String baseSalary;


    public BasePlusCommission(String firstName, String lastName, double grossSales, double commissionRate, String socialSecurityNumber) {
        super(firstName, lastName, grossSales, commissionRate, socialSecurityNumber);
    }
}

