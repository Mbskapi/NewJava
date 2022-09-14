package Cohort12;

import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        String email = "f.oladeji@semicolon.african";
                if(isValidEmailAddress(email)) System.out.println("email is valid");
                else  System.out.println("email is invalid");

        var isValid  = Pattern.matches("[a-z] . [a-z] + @ semicolon . africa",
                "f.oladeji@semicolon.african");
                System.out.println(isValid);
    }

    public static boolean isValidEmailAddress(String email){
        boolean isvalid =
                email.matches("[a-z] . [a-z] + @ semicolon . africa");
                return isvalid;
    }

    //String password =;

}
