public class NutFarm2 {

    public static int[] shakeTree(final char[][] tree) {
        int[][] nuts = new int[tree.length][];

        for (int i = 0; i < tree.length; i++) {
            char[] tRow = tree[i];
            nuts[i] = new int[tRow.length];
            for (int j = 0; j < tRow.length; j++) {
                if (tRow[j] == 'o')
                    nuts[i][j] = 1;
            }
        }

        for (int i = 0; i < nuts.length - 1; i++) {
            int[] row = nuts[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] != 0) {
                    fall(nuts, tree, i, j);
                }
            }
        }

        return nuts[nuts.length - 1];
    }

    private static void fall(int[][] nuts, char[][] tree, int i, int j) {
        nuts[i + 1][j] = nuts[i + 1][j] + nuts[i][j];
        nuts[i][j] = 0;

        checkOnBranches(nuts, tree, i + 1, j);
    }

    private static void checkOnBranches(int[][] nuts, char[][] tree, int i, int j) {
        if (tree[i][j] == '/') {
            bounceLeft(nuts, tree, i, j);
        } else if (tree[i][j] == '\\') {
            bounceRight(nuts, tree, i, j);
        }
    }

    private static void bounceRight(int[][] nuts, char[][] tree, int i, int j) {
        if(tree[i][j +1] == '/') {
            //stuck
            nuts[i][j] = 0;
            return;
        }
        nuts[i][j + 1] = nuts[i][j + 1] + nuts[i][j];
        nuts[i][j] = 0;
        checkOnBranches(nuts, tree, i, j + 1);
    }

    private static void bounceLeft(int[][] nuts, char[][] tree, int i, int j) {
        if(tree[i][j -1] == '\\') {
            //stuck
            nuts[i][j] = 0;
            return;
        }

        nuts[i][j - 1] = nuts[i][j - 1] + nuts[i][j];
        nuts[i][j] = 0;
        checkOnBranches(nuts, tree, i, j - 1);
    }
}
