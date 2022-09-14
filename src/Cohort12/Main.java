package Cohort12;

import java.util.Arrays;

public class Main {

    private static String[] nigerianInstitutions = {"unilag", "lasu", "NOUN", "nSUKKA", "unical", "laspotect"};



//        mainCase();
//        SchoolComparator();
        //equall

        //String word = "hello";
        //String secondWord = new String("hello");
        //System.out.println("work-->"+secondWord);
        //System.out.println("second Word-->"+secondWord);
        //System.out.println(word==secondWord);
        //System.out.printf("%s %b\n", "with == operator::", word==secondWord);
        //System.out.println("with equals method in class string::"+word.equals(secondWord));
        // System.out.println("with equalsIgnore method in class string::"+word.equalsIgnoreCase(secondWord));


//
//    public static void mainCase() {
//        System.out.println("A".compareTo("B"));

    // String secondWord = "AC";
//        System.out.println("result of comparison::"+secondWord.compareTo(word));

    public static void main(String[] args) {


        for (int firstIndex = 0; firstIndex < nigerianInstitutions.length; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < nigerianInstitutions.length; secondIndex++) {
                if (nigerianInstitutions[firstIndex].compareTo(nigerianInstitutions[secondIndex]) > 0) {
                    swapElements(firstIndex, secondIndex);
                }

            }

        }
        System.out.println(Arrays.toString(nigerianInstitutions));
    }
    private static void swapElements(int firstIndex,int secondIndex) {

        String temp = nigerianInstitutions[firstIndex];
        nigerianInstitutions[firstIndex] = nigerianInstitutions[secondIndex];
        nigerianInstitutions[secondIndex] = temp;

    }
}