import java.util.HashSet;

public class SudokuValidator {

    public boolean isValid(int[][] board) {

        for (int i = 0; i < 9; i++) {

            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> col = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] != 0) {

                    if (row.contains(board[i][j]))
                        return false;

                    row.add(board[i][j]);
                }

                if (board[j][i] != 0) {

                    if (col.contains(board[j][i]))
                        return false;

                    col.add(board[j][i]);
                }
            }
        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {

            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Integer> box = new HashSet<>();

                for (int i = boxRow; i < boxRow + 3; i++) {

                    for (int j = boxCol; j < boxCol + 3; j++) {

                        if (board[i][j] != 0) {

                            if (box.contains(board[i][j]))
                                return false;

                            box.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}