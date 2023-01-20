public class loops {
    public static void main(String[] args) {
      int[] arr = {2, 1, 4, 5, 6, 8};

                for(int i = 0; i < arr.length; i++){
                    for(int j = i+1; j < arr.length; j++){
                        if(arr[i] + arr[j] == 7){
                            System.out.println(arr[i]);
                            System.out.println(arr[j]);
                        }
                    }
                }
    }
}
