public class BarChart {
    public static void main(String[] args) {

        int [] array = {0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4};
        System.out.println("grade distribution");
    //for each array element, output a bar of chart.
        for(int counter = 0; counter < array.length; counter++){
        //output bar label ("00 - 09", ..., "90 - 99:", "100:");
        if(counter == 10){
            System.out.printf("%5d:  ", 100);
        }
        else {
            System.out.printf("%02d - %02d",
            counter * 10, counter * 10 + 9);
        }
        //print bar of astesrisk
        for(int star = 0; star < array[counter]; star++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
