import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SudokuValidatorTest {
    @Test
    public void exampleTestRows
            () {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        assertEquals(true, SudokuValidator.check(sudoku));

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        assertEquals(false, SudokuValidator.check(sudoku));

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        assertEquals(false, SudokuValidator.check(sudoku));
    }

    @Test
    public void exampleTestColumns() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {1, 5, 9, 7, 6, 8, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        assertEquals(false, SudokuValidator.check(sudoku));
    }

    @Test
    public void exampleTest3x3Blocks() {
        int[][] sudoku = {
                {3, 4, 9, 2, 8, 5, 6, 1, 7},
                {6, 7, 3, 5, 2, 8, 9, 4, 1},
                {9, 1, 6, 8, 5, 2, 3, 7, 4},
                {5, 6, 2, 4, 1, 7, 8, 3, 9},
                {4, 5, 1, 3, 9, 6, 7, 2, 8},
                {2, 3, 8, 1, 7, 4, 5, 9, 6},
                {8, 9, 5, 7, 4, 1, 2, 6, 3},
                {7, 8, 4, 6, 3, 9, 1, 5, 2},
                {1, 2, 7, 9, 6, 3, 4, 8, 5},
        };
        assertEquals(false, SudokuValidator.check(sudoku));
    }
}