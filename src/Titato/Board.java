package Titato;

import static Titato.Mark.*;

public class Board {
    private Mark [][] boardSurface = {{E, E, E},{E, E, E},{E,E,E}};


    public Mark[][] getBoardSurface() {
        return boardSurface;
    }
    public void displayBoardSurface(){
        for(int i =0; i <3;i++){
            System.out.print("| ");
            for(int j = 0; j<3; j++){
                System.out.print(boardSurface[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }

    }


}
