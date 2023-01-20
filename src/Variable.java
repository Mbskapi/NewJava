public class Variable {
    public static void main(String[] args) {
        int[]excellent = {7, 2, 4, 2, 1, 3, 6, 5, 4, 1, 3, 7, 3, 5, 7, 16};
        int[]response = new int[8];

        for (int count = 0; count < excellent.length; count++) {
            try {
                ++response[excellent[count]];
            }
            catch (ArrayIndexOutOfBoundsException  g){
                System.out.printf(g.getMessage());
                System.out.printf("excellent[%d] = %d%n%n",count,excellent[count]);
            }
          }
        System.out.printf("%-10s%s%n", "rating", "excellent");
            for (int scale = 0; scale < response.length; scale++){
            System.out.printf("%-10d%d%n", scale, response[scale]);
           }
  }

}


