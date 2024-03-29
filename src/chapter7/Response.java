package chapter7;

public class Response {
    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        for(int answer = 0; answer < responses.length; answer++){
            try {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage()); // invokes toString method
                System.out.printf("responses[%d] = %d%n%n",
                        answer, responses[answer]);
            }

        }
        System.out.printf("%-15s%s%n", "Rating", "Frequency");
        for(int k = 1; k <frequency.length; k++){
            System.out.printf("%-15d%d%n", k , frequency[k]);
        }
    }
}
