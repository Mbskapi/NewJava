public class MaxAndMin {
    public static void main(String[] args) {
       int arra[] = {3,67,54,21,90,564,104,609,4};
       int max = arra[0];
       int min = arra[0];

       for (int i = 0; i < arra.length; i++){
           if (arra[i] > max){
               max = arra[i];
           }
           if (arra[i] < min){
               min = arra[i];
           }
       }
        System.out.println(" minimum  " + min + " maximum " + max);
    }
}
