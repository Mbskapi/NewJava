public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("mathew","bush","39782",
                6000.00,12.80);
        employee.getFirstName();
        System.out.printf("%s%n the first name is franklin",
        employee.getLastName());
        System.out.printf("%s%n the first name", employee.getLastName());
        System.out.println();
        System.out.println();
        employee.getCommissionRate(12.80);
        employee.getGrossSales(6000.00);
    }
}
