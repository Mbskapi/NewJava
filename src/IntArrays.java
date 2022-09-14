public class IntArrays {
//    public static void main(String[] args) {
//
//        int[] arrays = {67, 90, 96, 87, 75, 83, 69, 100, 88, 70};
//        int total = 0;
//
//
//
//        for (int counter = 0; counter < arrays.length; ++counter) {
//            total += arrays[counter];           // arrays[counter] = 2 + 2 * counter;
//        }
//        System.out.printf("total of array element %d%n", total);
//

//
//    }

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10; //declare constant
        int[] arrays = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < arrays.length; counter++)
            arrays[counter] = 2 + 2 * counter;

            System.out.printf("%s%8s%n", "index", "value");

            for (int counter = 0; counter < arrays.length; counter++) {
                System.out.printf("%5d%8d%n", counter, arrays[counter]);

            }

        }
    }
