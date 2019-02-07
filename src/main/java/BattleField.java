public class BattleField {

    public static boolean fieldValidator(int[][] field) {
        int[] ships = new int[4];
        boolean[][] visited = new boolean[10][10];

        try{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (!visited[i][j]) {
                        visited[i][j] = true;

                        if (field[i][j] == 1) { //ship is detected!
                            int bottomLength = getBottomLength(field, visited, i, j);
                            int rightLength = getRightLength(field, visited, i, j);
                            addShip(ships, 1 + bottomLength + rightLength);
                        }

                    }
                }
            }
            validateShips(ships);
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }

    private static void validateShips(int[] ships) {
        for(int i = 0; i< ships.length; i++) {
            if(ships[i] != ships.length - i) throw new IllegalArgumentException();
        }
    }

    private static void addShip(int[] ships, int i) {
        if(i > 4) throw new IllegalArgumentException();

        ships[i -1] += 1;
    }

    private static int getRightLength(int[][] field, boolean[][] visited, int i, int j) {
        j++;
        if (j == field.length) return 0;

        visited[i][j] = true;
        if (field[i][j] == 1) {
            check(field, visited, i + 1, j - 2);
            check(field, visited, i + 1, j - 1);
            check(field, visited, i + 1, j);
            check(field, visited, i + 1, j+1);

            return 1 + getRightLength(field, visited, i, j);
        }

        return 0;
    }

    private static int getBottomLength(int[][] field, boolean[][] visited, int i, int j) {
        i++;
        if (i == field.length) return 0;

        visited[i][j] = true;
        if (field[i][j] == 1) {
            check(field, visited, i - 2, j + 1);
            check(field, visited, i - 1, j + 1);
            check(field, visited, i, j + 1);
            check(field, visited, i + 1, j + 1);

            return 1 + getBottomLength(field, visited, i, j);
        }
        return 0;
    }

    private static void check(int[][] field, boolean[][] visited, int i, int j) {
        if (j < 0 || i < 0 || j == field.length || i == field.length || visited[i][j]) return;

        visited[i][j] = true;
        if (field[i][j] == 1) throw new IllegalArgumentException();
    }
}