

public class MethodSort {

    public static void main(String[] args) {

            int[] arr = new int[] {3,4,191,20, 5, 44, 113, 108, 32, 170, 56, 91, 12, 250, 59, 37 };

            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    int tmp = 0;
                    if (arr[i] > arr[j])
                    {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }


            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
}
