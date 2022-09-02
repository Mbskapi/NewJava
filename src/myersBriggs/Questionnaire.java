package myersBriggs;

import java.util.Scanner;

public class Questionnaire {

    public static void main(String[] args) {
        String question;
        int aCount = 0;
        int bCount = 0;
        int aCount1 = 0;
        int bCount1 = 0;
        int aCounter2 = 0;
        int bCounter2 = 0;
        int aCounter3 = 0;
        int bCounter3 = 0;

        String[][] questions = new String[5][8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("select A or B answer the following personality test:");
        System.out.println();
        System.out.printf("%s%n", "Questions 1: \n A. Expend energy, enjoy groups \t B. conserve energy, enjoy one - on one");
        question = scanner.nextLine();
        switch (question) {
            case "A", "a":
                aCount++;
                questions[0][0] = "A";
                break;
            case "B", "b":
                questions[0][1] = "B";
                bCount++;
                break;
        }

        System.out.println();
        System.out.printf("%s%n", "Questions 2: \n A. interpret literally  \t B. look for meaning and possibilities");
        question = scanner.nextLine();
        switch (question) {
            case "A", "a":
                aCount1++;
                questions[0][2] = "A";
                break;
            case "B", "b":
                questions[0][3] = "B";
                bCount1++;
                break;

        }
        System.out.println();
        System.out.printf("%s%n", "Question 3, \n A. organized, orderly, \t B. flexible, adaptable");
        question = scanner.nextLine();
        switch (question) {
            case "A", "a":
                questions[0][6] = "A";
                aCount++;
                break;
            case "B", "b":
                questions[0][7] = "B";
                bCount++;
                break;

        }

        System.out.println();
        System.out.printf("%s%n", "Questions 4: \n A. more out going,think out loud \t B. more reserved, think to yourself");
        question = scanner.nextLine();
        switch (question) {
            case "A", "a":
                aCount++;
                questions[1][0] = "A";
                break;
            case "B", "b":
                questions[1][1] = "B";
                bCount++;
                break;
        }


        System.out.println();
        System.out.printf("%s%n", "Questions 5: \n A. practise, realistic, experiential \t B. imaginative, innovative, theoretical");
        question = scanner.nextLine();
        switch (question) {
            case "A", "a":
                aCount++;
                questions[1][2] = "A";
                break;
            case "B", "b":
                questions[1][3] = "b";
                bCount++;
                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Questions 6: \n A. candid, straight, forward, frank \t B. tactful,kind, encouraging");
        question = scanner.nextLine();
        switch (question) {
            case "A", "a":
                aCount++;
                questions[1][4] = "A";
                break;
            case "B", "b":
                questions[1][5] = "B";
                bCount++;
                break;
        }

            System.out.println();
            System.out.printf("%s%n", "Questions 7: \n A. plan, schedule, \t B. unplanned, spontaneous");
            question = scanner.nextLine();
            switch (question) {
                case "A", "a":
                    aCount++;
                    questions[1][6] = "A";
                    break;
                case "B", "b":
                    questions[1][7] = "B";
                    bCount++;
                    break;

            }


            System.out.println();
            System.out.printf("%s%n", "Questions 8: \n A. seek many tasks, public activities, interaction with others \t B.  seek private, solitary activities with quite to concentrate");
            question = scanner.nextLine();
            switch (question) {
                case "A", "a":
                    aCount++;
                    questions[2][0] = "A";
                    break;
                case "B", "b":
                    questions[2][1] = "B";

                    bCount++;
                    break;
            }

            System.out.println();
            System.out.printf("%s%n", "Questions 9: \n A. look for meaning and possibilities \t B. interpret literally");
            question = scanner.nextLine();
            switch (question) {
                case "A", "a":
                    aCount++;
                    questions[2][02] = "A";
                    break;
                case "B", "b":
                    questions[2][3] = "B";
                    bCount++;
                    break;
            }



                System.out.println();
                System.out.printf("%s%n", "Questions 10: \n A. firm, tend to criticize, hold the line \t B. gentle, tend to appreciate, conciliate");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[2][6] = "A";
                        break;
                    case "B", "b":
                        questions[2][7] = "B";
                        bCount++;
                        break;
                }
                System.out.println();
                System.out.printf("%s%n", "Questions 11: \n A. standard, usual, convention \t B. different, novel, unique");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[3][0] = "A";
                        break;
                    case "B", "b":
                        questions[3][1] = "B";
                        bCount++;
                        break;

                }


                System.out.println();
                System.out.printf("%s%n", "Questions 12: \n A. regulate, structure \t B easygoing, 'live' and 'let live");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[3][2] = "A";
                        break;
                    case "B", "b":
                        questions[3][3] = "B";
                        bCount++;
                        break;
                }

                System.out.println();
                System.out.printf("%s%n", "Questions 13: \n A.external, communicative, express yourself \t B. internal, reticent, keep to yourself");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[3][4] = "A";
                        break;
                    case "B", "b":
                        questions[3][5] = "B";
                        bCount++;
                        break;
                }


                System.out.println();
                System.out.printf("%s%n", "Questions 14: \n A. focus on here- and- now \t B. look to the future, global perspective, big picture ");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[3][6] = "A";
                        break;
                    case "B", "b":
                        questions[3][7] = "B";
                        bCount++;
                        break;
                }

                System.out.println();
                System.out.printf("%s%n", "Questions 15: \n A. tough - minded, just \t B. tender-hearted- merciful");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[4][0] = "A";
                        break;
                    case "B", "b":
                        questions[4][1] = "B";
                        bCount++;
                        break;
                }

                System.out.println();
                System.out.printf("%s%n", "Questions 16: \n A. preparation, plan ahead \t B. go with the flow, adapt as you go");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[4][2] = "A";
                        break;
                    case "B", "b":
                        questions[4][3] = "B";
                        bCount++;
                        break;
                }

                System.out.println();
                System.out.printf("%s%n", "Questions 17: \n active, initiate \t B. reflective, deliberate");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[4][4] = "A";
                        break;
                    case "B", "b":
                        questions[4][5] = "B";
                        bCount++;
                        break;
                }

                System.out.println();
                System.out.printf("%s%n", "Questions 18: \n A. facts, things, 'whats is' \t B. ideas, dreams, 'what could be',philosophical");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[4][6] = "A";
                        break;
                    case "B", "b":
                        questions[4][7] = "B";
                        bCount++;
                        break;
                }


                System.out.println();
                System.out.printf("%s%n", "Questions 19: \n A. matter of facts, issue-oriented \t B. sensitive, people- oriented, compassionate");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[5][0] = "A";
                        break;
                    case "B", "b":
                        questions[5][1] = "B";
                        bCount++;
                }


                System.out.println();
                System.out.printf("%s%n", "Questions 20: \n A. control, govern \t B. latitude, freedom");
                question = scanner.nextLine();
                switch (question) {
                    case "A", "a":
                        aCount++;
                        questions[5][2] = "A";
                        break;
                    case "B", "b":
                        questions[5][3] = "B";
                        bCount++;
                        break;
                }
       //   if("aCount == 1"){
         // question == question +;

          }
    }

