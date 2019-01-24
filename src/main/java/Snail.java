public class Snail {

    public static int[] snail(int[][] array) {
        int[] tail = new int[array.length * array[0].length];
        boolean[][] visitedMap = new boolean[array.length][array.length];
        if(array[0].length > 0)
            moveRight(0, 0, array, tail, 0, visitedMap);

        return tail;
    }

    private static void moveRight(int i, int j, int[][] array, int[] tail, int nextIndex, boolean[][] visitedMap) {
        tail[nextIndex++] = array[i][j];
        visitedMap[i][j] = true;

        if (j < array[0].length - 1 && !visitedMap[i][j + 1])
            moveRight(i, j + 1, array, tail, nextIndex, visitedMap);
        else if (i < array.length - 1 && !visitedMap[i + 1][j])
            moveBottom(i + 1, j, array, tail, nextIndex, visitedMap);
    }

    private static void moveBottom(int i, int j, int[][] array, int[] tail, int nextIndex, boolean[][] visitedMap) {
        tail[nextIndex++] = array[i][j];
        visitedMap[i][j] = true;

        if (i < array.length - 1 && !visitedMap[i + 1][j])
            moveBottom(i + 1, j, array, tail, nextIndex, visitedMap);
        else if (j > 0 && !visitedMap[i][j - 1])
            moveLeft(i, j - 1, array, tail, nextIndex, visitedMap);
    }

    private static void moveLeft(int i, int j, int[][] array, int[] tail, int nextIndex, boolean[][] visitedMap) {
        tail[nextIndex++] = array[i][j];
        visitedMap[i][j] = true;

        if (j > 0 && !visitedMap[i][j - 1])
            moveLeft(i, j - 1, array, tail, nextIndex, visitedMap);
        else if (i > 0 && !visitedMap[i - 1][j])
            moveTop(i - 1, j, array, tail, nextIndex, visitedMap);
    }

    private static void moveTop(int i, int j, int[][] array, int[] tail, int nextIndex, boolean[][] visitedMap) {
        tail[nextIndex++] = array[i][j];
        visitedMap[i][j] = true;

        if (i > 0 && !visitedMap[i - 1][j])
            moveTop(i - 1, j, array, tail, nextIndex, visitedMap);
        else if (j < array[0].length - 1 && !visitedMap[i][j + 1])
            moveRight(i, j + 1, array, tail, nextIndex, visitedMap);
    }
}