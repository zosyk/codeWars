import java.util.Arrays;
import java.util.stream.IntStream;

public class Dinglemouse {
    public static int peakHeight(char[][] mountain) {
        int[][] arr = new int[mountain.length][mountain[0].length];

        for (int i = 0; i < mountain.length; i++)
            for (int j = 0; j < mountain[i].length; j++) {
                int cell = mountain[i][j] == '^' ? 1 : 0;

                if (i == 0 || i == mountain.length - 1 || j == 0 || j == mountain[i].length - 1 || mountain[i][j] == ' ') {
                    arr[i][j] = cell;
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j], arr[i][j - 1]) + cell;

                }
            }
        int max = 0;

        for (int i = arr.length - 2; i > 0; i--) {
            for (int j = arr[i].length - 2; j > 0; j--) {

                arr[i][j] = IntStream.of(arr[i][j], arr[i + 1][j] + 1, arr[i][j + 1] + 1).min().getAsInt();
                max = Math.max(max, arr[i][j]);
            }
        }

        return max;

    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
 }