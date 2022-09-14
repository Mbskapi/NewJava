package Chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamSample {
    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        try(BufferedReader bufferedReader1 = new BufferedReader(reader);
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = bufferedReader.readLine();
                int number = Integer.decode(line);
            System.out.println("The number is ::" + number);
            }
        catch(IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
