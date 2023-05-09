public class AscendingOrder {
    public static void main(String[] args) {
    int Array[] = {27, 48, 57, 58, 21, 12, 5, 17, 10, 94, 88, 60};
    int temp = 0;
        for (int i = 0; i< Array.length ; i++){
        for (int j = i+1; j < Array.length; j++){
            if(Array[i] < Array[j]){
                temp = Array [i];
                Array[i]=Array[j];
                Array[j]=temp;
            }
        }
        System.out.println("asc " +Array[i]);
    }
}
}
