public class Utils {
    public static char[][] makeTree(String[] strings) {
        char[][] tree = new char[strings.length][];

        for(int i = 0; i< tree.length; i++) {
            tree[i] = strings[i].toCharArray();
        }

        return tree;
    }

    public static void showTree(char[][] tree) {

    }

    public static void showNuts(int[] got) {

    }
}
