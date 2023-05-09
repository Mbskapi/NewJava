package GenericExample;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        List<Integer> intList =new ArrayList<>();
        intList.add(3);
        PrintList(intList);

        List<Cat> CatList = new ArrayList<>();
        CatList.add(new Cat());
        PrintList(CatList);

//        Printer<Integer> Printer1 = new Printer<>(23);
//        Printer1.print();
//        Printer<Double> doublePrinter = new Printer<>(33.55);
//        doublePrinter.print();
//        ArrayList<Cat> cats = new ArrayList<Cat>(new  Cat);
//       // DoublePrinter copy = new DoublePrinter(34.00);
//        System.out.println(23);
        //copy.ToPrint();
       // System.out.println(24.00);
    }

    private static void PrintList(List<? > intList) {
        System.out.println();
    }
}
