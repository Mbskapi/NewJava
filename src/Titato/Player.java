package Titato;

public class Player {
    private Mark mark;


    public Player(Mark mark){
        this.mark = mark;
    }
    public void playerGame(int Position, Board board) {
        var boardSurface = board.getBoardSurface();
        int row = 0;
        int col = Position - 1;

        if (Position > 3) {
            row = 1;
            col = Position - 4;

        }
        if (Position > 6){
            row = 1;
            col = Position - 7;
        }
        boardSurface[row][col]= mark;


    }
}
