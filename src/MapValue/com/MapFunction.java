package MapValue.com;


import java.util.Comparator;

public class MapFunction {
    public static void main(String[] args) {

        Comparator<String> StringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);

            }
        };
        int comparison = StringComparator.compare("hello", "world");
        System.out.println(comparison);

        Comparator<String> StringLambda =
                (String o1, String o2) -> {
                    return o1.compareTo(o2);

                };


    }
}






