package Cohort12;

import java.io.*;
import java.util.Arrays;


public class Intro {
    public static void main(String[] args) {
        DataInputStream dataInputStream=
                new DataInputStream(System.in);
        try {

            byte[] bytes = new byte[10];
            int data = dataInputStream.readNBytes(bytes, 0, 8);
            System.out.println("byte array representation of input::"
                    + Arrays.toString(bytes));

            System.out.println("actual string rep::");
            for (byte b : bytes)
                System.out.println((char) b);
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }

        }
    }

