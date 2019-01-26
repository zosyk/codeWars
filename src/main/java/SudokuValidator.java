public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        int[][] check1 = new int[10][10];
        int[][] check2 = new int[10][10];
        int[][] check3 = new int[10][10];

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n1 = sudoku[i][j]; // check row
                if(n1 == 0) return false;
                if(check1[i][n1] != 0) return false;
                check1[i][n1] = n1;

                int n2 = sudoku[j][i]; // check column
                if(check2[n2][i] != 0) return false;
                check2[n2][i] = n2;

                int n3 = sudoku[(i/3*3 + j/3) % 9][(i * 3 +j % 3) % 9]; //check box
                if(check3[i][n3] != 0) return false;
                check3[i][n3] = n3;
            }
        }
        return true;
    }
}