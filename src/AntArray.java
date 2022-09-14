public class AntArray {

    public static void main(String[] args) {
        //declaring array of variable,
         //= is assigning and initializing the object.

        int[]arrays = {29, 30, 44, 23, 56, 65, 70, 63, 89, 90};
        System.out.println("%d%8d%n, index,value");

        for(int counter = 0; counter < 10; counter++){
            System.out.printf("%5d%8d%n", counter,arrays[counter]);
        }
    }
}
