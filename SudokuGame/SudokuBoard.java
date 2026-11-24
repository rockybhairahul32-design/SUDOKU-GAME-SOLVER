public class SudokuBoard {

    private int[][] board = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
    };

    public int[][] getBoard() {
        return board;
    }

    public void setValue(int row, int col, int value) {
        board[row][col] = value;
    }

    public int getValue(int row, int col) {
        return board[row][col];
    }

    public void printBoard() {

        System.out.println();

        for(int i=0;i<9;i++) {

            if(i%3==0)
                System.out.println("-------------------------------");

            for(int j=0;j<9;j++) {

                if(j%3==0)
                    System.out.print("| ");

                if(board[i][j]==0)
                    System.out.print(". ");
                else
                    System.out.print(board[i][j]+" ");
            }

            System.out.println("|");
        }

        System.out.println("-------------------------------");
    }
}