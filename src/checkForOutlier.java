public class checkForOutlier {
    private int result;

    public int getResult() {
        return result;
    }
    public void checkOutlier(int[] arr){
        int oddCounter = 0;
        int evenCounter = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                arr[oddCounter] = arr[i];
                oddCounter++;
            }
            if(arr[i] % 2 == 0){
                arr[evenCounter] = arr[i];
                evenCounter++;
            }
        }

        if(oddCounter < evenCounter) result = arr[0];
        if(evenCounter < oddCounter) result = arr[0];
    }
}
