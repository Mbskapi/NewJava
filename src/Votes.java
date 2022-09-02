import java.util.Arrays;

public class Votes {

//    private int voteUp;
//
//    private int voteDown;
//
//    public int voteCount(){
//        return voteUp()
//
//
//    }


    char[] alphabet = {'A', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public char pickSecondLetter(String letter){
      return letter.charAt(1);
    }

    public char selectNextAlphabet(char userAlphabet) {
        char empty = ' ';
        for (int i = 0; i < alphabet.length; i++){
            if (userAlphabet == alphabet[i]){
                empty = alphabet[i + 1];
            }
        }
        return empty;
    }
}
