public class SwitchControl{
    public static void main(String[] args) {

        int dayNumber = 7;
        switch (dayNumber){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("seven");
                break;
        }
        switch (dayNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("working days");
                break;
            case 6:
            case 7:
                System.out.println("this weekend");
                break;
        }
    }
}
