package Cohort12;

public class RegMatches {
    public static void main(String[] args) {
        String firstWord = "there are unicorns in cohort twelve";
        System.out.println(firstWord.regionMatches(10,"unicorns",0, 7));
        System.out.println(firstWord.regionMatches(true, 10, "unicorns",1,7));
    }
}
