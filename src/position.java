public class position {
    private int row;
    private int column;

    public position(int row, int column) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int newColumn) {
        column = newColumn;
    }
  @Override
    public boolean equals(Object obj) {
        position comparedPosition = (position) obj;
        boolean rowsAreEqual = comparedPosition.row == this.row;
        boolean columnAreEqual = comparedPosition.column == this.column;
        return columnAreEqual == rowsAreEqual;
    }
    @Override
    public String toString(){
        return "position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
