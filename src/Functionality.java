import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functionality {
    public static void main(String[] args) {
        List<String> sign = new ArrayList<>();
        sign.add("farmland");
        sign.add("garden");
        sign.add("eggFarm");
        sign.remove(0);
        sign.add("farmland");
        sign.add("poletryfarm");
        System.out.println(sign);
        System.out.println(sign.size());
        System.out.println(sign.indexOf(3));
        for (int i = 0; i< 6; i++){
            for (int j = 1; j<i +1; j++ )
             System.out.println(sign);
        }
        for (String calm: sign){
            System.out.println(calm);
        }


    }
}
