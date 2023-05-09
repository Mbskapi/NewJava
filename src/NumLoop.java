public class NumLoop {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            for (int j = 1; j < 6; j++){
                if(i == 3 || j == 2){
                    continue;
                }
                System.out.println("i=" + i + "l" + "j="+j);
            }
        }
    }
}
