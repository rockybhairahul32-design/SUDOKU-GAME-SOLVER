# Sudoku Game & Solver

A console-based **Java Sudoku Game & Solver** built using core **Data Structures and Algorithms** concepts such as **2D Array, Backtracking, Stack, and Hashing**.

## Project Details

- **Project Title:** Sudoku Game & Solver
- **Roll No:** RU-25-11083
- **Student Name:** Rahul Kumar Tiwari
- **Subject:** Data Structure and Algorithm
- **Concepts Used:** 2D Array, Backtracking, Stack, Hashing

## Description

This project is a Java-based Sudoku application that allows the user to:

- Display the Sudoku board
- Enter values in the board
- Validate the current board
- Solve the Sudoku puzzle automatically using backtracking
- Work with a clean menu-driven console interface

The project demonstrates how real-world puzzle solving can be implemented using fundamental data structures and algorithms.

## Features

- Console-based menu system
- Sudoku board stored in a **2D array**
- Automatic solving using **Backtracking**
- Board validation using **Hashing**
- Move history support using **Stack**
- Easy-to-understand Java OOP structure
- Beginner-friendly and fully commented code

## Data Structures Used

### 1. 2D Array
Used to store the 9×9 Sudoku board.

### 2. Backtracking
Used in the solver to try numbers from 1 to 9 recursively until the puzzle is solved.

### 3. Stack
Used to store previous moves or history of actions, useful for undo functionality.

### 4. Hashing
Used for fast checking of duplicate values in rows, columns, and 3×3 boxes.

## Project Files

- `Main.java`  
- `GameController.java`  
- `SudokuBoard.java`  
- `SudokuSolver.java`  
- `SudokuValidator.java`  
- `SudokuGenerator.java`  
- `Move.java`

## How to Run

### Requirements
- Java JDK installed
- VS Code / IntelliJ IDEA / Eclipse
- Command prompt or terminal

### Steps
1. Save all Java files inside one folder.
2. Open the folder in your IDE.
3. Compile all files.

```bash
javac *.java
```

4. Run the main file.

```bash
java Main
```

## Sample Menu

```text
========== Sudoku Game ==========
1. Display Board
2. Solve Sudoku
3. Validate Sudoku
4. Enter a Number
5. Exit
```

## Future Enhancements

- GUI using Java Swing or JavaFX
- Random puzzle generation
- Difficulty levels
- Hint system
- Timer
- Undo/Redo feature
- Save and load game
- Better user interaction

## Learning Outcome

This project helped me understand:

- How to apply DSA concepts in a real project
- How backtracking works in solving puzzles
- How to use 2D arrays for board representation
- How hashing improves validation efficiency
- How stack can be used for history and undo operations

## Conclusion

The Sudoku Game & Solver is a simple but effective Java project that demonstrates the practical use of DSA concepts. It is useful for academic learning and can also be extended into a full GUI-based application in the future.