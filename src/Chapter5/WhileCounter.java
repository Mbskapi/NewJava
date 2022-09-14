package Chapter5;

public class WhileCounter {
    public static void main(String[] args) {
    solve();
    sum();
    BreakFest();
        int counter = 1;

        while (counter < 10){
            //System.out.print(counter);
            counter++;
        }
        System.out.println();
    }

    public static void solve(){
        for(int i = 0; i <= 99; i+=11){
            //System.out.printf(i + " , ");
        }
        System.out.println();
    }

    public static void sum(){
    int total = 20;
        for (int i = 2; i <= 20; i += 2){
           // System.out.println(i);
            total  += 20 + i;//explain
        }
       // System.out.printf("sum total %d%n", total);
    }

    public static void BreakFest(){
        int count;
        for(count = 0; count <= 100; count++){
            if (count == 50){
                break; // terminate loop if count is 5
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%n Broke out of loop at count = %d%n",count);
    }

}
