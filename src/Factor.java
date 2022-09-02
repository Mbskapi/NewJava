public class Factor {

    private int number;

    public void getNumber(int number){
        System.out.println("Enter positive integer: ");
        System.out.printf("factor of %d are: ", number);
        for(int i = 1; i <= number; i++ );
        if(number % 1 == 0){
            System.out.printf("%d",1);
        }

    }

}
