public class NutFarm2 {

    public static int[] shakeTree(final char[][] tree) {
        int[] nuts = new int[tree[0].length];

        for(char[] line: tree) {
            for(int i = 0; i< nuts.length; i++) { // bouncing right
                if(line[i] == '\\') {
                    if(line[i+1] != '/')
                        nuts[i+1] +=nuts[i];
                    nuts[i] = 0;
                }
            }

            for(int i = nuts.length - 1; i >=0; i--) { // bouncing left, and create new nuts
                if(line[i] == '/') {
                    if(line[i-1] != '\\')
                        nuts[i-1] += nuts[i];
                    nuts[i] = 0;
                } else if (line[i] == 'o')
                    nuts[i] += 1;
            }
        }
        return nuts;
    }
}
