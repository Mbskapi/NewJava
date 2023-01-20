




public class CheckAndUncheck {
    public static void main(String[] args) throws NullPointerException{

        String name = null;
        printLenght(name);

    }
    private static void printLenght(String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e){
            System.out.println("Hey this object doesnt exit");

        }

    }

}