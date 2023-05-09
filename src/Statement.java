public class Statement {
    public static void main(String[] args) {

        int studentMark = 100;
        if (studentMark > 90) {
            System.out.println("student  had A in the exam..");

        } else if (studentMark < 80 && studentMark < 70) {
            System.out.println("student had B in exam");

        } else if (studentMark > 80 && studentMark < 70) {
            System.out.println("second position class-B");
        } else if (studentMark > 70 && studentMark < 60) {
            System.out.println("student had C in exam ");
        } else if (studentMark > 60 && studentMark < 50) {
            System.out.println("student had D in exam");

    } else if (studentMark > 40 && studentMark > 30){
            System.out.println("student had fail the exam");

        }

    }

}
