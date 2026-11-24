import java.util.Scanner;

public class GameController {

    private SudokuBoard board;
    private SudokuSolver solver;
    private SudokuValidator validator;

    public GameController() {
        board = new SudokuBoard();
        solver = new SudokuSolver();
        validator = new SudokuValidator();
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== Sudoku Game ==========");
            System.out.println("1. Display Board");
            System.out.println("2. Solve Sudoku");
            System.out.println("3. Validate Sudoku");
            System.out.println("4. Enter a Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    board.printBoard();
                    break;

                case 2:

                    if (solver.solve(board.getBoard())) {

                        System.out.println("\nSudoku Solved Successfully!\n");
                        board.printBoard();

                    } else {

                        System.out.println("No Solution Exists.");
                    }

                    break;

                case 3:

                    if (validator.isValid(board.getBoard())) {

                        System.out.println("Current Board is Valid.");

                    } else {

                        System.out.println("Current Board is Invalid.");
                    }

                    break;

                case 4:

                    System.out.print("Row (1-9): ");
                    int row = sc.nextInt() - 1;

                    System.out.print("Column (1-9): ");
                    int col = sc.nextInt() - 1;

                    System.out.print("Value (1-9): ");
                    int value = sc.nextInt();

                    if (row >= 0 && row < 9 &&
                        col >= 0 && col < 9 &&
                        value >= 1 && value <= 9) {

                        board.setValue(row, col, value);

                        System.out.println("Value Updated.");

                    } else {

                        System.out.println("Invalid Input.");
                    }

                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}