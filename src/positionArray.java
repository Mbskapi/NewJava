public class positionArray {
    public static void main(String[] args) {
        String[][] array = {{"x", "0", "x",},
                            {"0", "x", "0"},
                            {"x", "x", "0"}};


        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.print(array[row][column]);
                if(column < array.length -1){
                    System.out.print("|");
                }
            }
            System.out.println();
        }


    }

}
