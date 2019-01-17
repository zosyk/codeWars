import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FibDigitsTest {
    @Test
    public void FibDigtis_BasicTest1() {
        int n = 10;
        int[][] expectedResult = new int[][]{
                new int[]{2, 5}};
        int[][] result = FibDigits.FibDigits(n);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void FibDigtis_BasicTest2() {
        int n = 10000;
        int[][] expectedResult = new int[][]{
                new int[]{254, 3},
                new int[]{228, 2},
                new int[]{217, 6},
                new int[]{217, 0},
                new int[]{202, 5},
                new int[]{199, 1},
                new int[]{198, 7},
                new int[]{197, 8},
                new int[]{194, 4},
                new int[]{184, 9}
        };
        int[][] result = FibDigits.FibDigits(n);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void FibDigtis_BasicTest3() {
        int n = 100000;
        int[][] expectedResult = new int[][]{
                new int[]{2149, 2},
                new int[]{2135, 1},
                new int[]{2131, 8},
                new int[]{2118, 9},
                new int[]{2109, 0},
                new int[]{2096, 3},
                new int[]{2053, 5},
                new int[]{2051, 6},
                new int[]{2034, 7},
                new int[]{2023, 4},
        };
        int[][] result = FibDigits.FibDigits(n);
        assertArrayEquals(expectedResult, result);
    }
}