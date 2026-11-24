public class Move {

    private int row;
    private int col;
    private int previousValue;
    private int newValue;

    public Move(int row, int col, int previousValue, int newValue) {
        this.row = row;
        this.col = col;
        this.previousValue = previousValue;
        this.newValue = newValue;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getPreviousValue() {
        return previousValue;
    }

    public int getNewValue() {
        return newValue;
    }
}