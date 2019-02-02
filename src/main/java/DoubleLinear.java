class DoubleLinear {

    public static int dblLinear(int n) {
        int[] u = new int[n + 1];

        u[0] = 1;
        int i = 0, j = 0, k = 1;
        while (k < u.length) {
            int y = u[i] * 2 + 1;
            int z = u[j] * 3 + 1;
            if (y < z) {
                u[k++] = y;
                i++;
            } else if (z < y) {
                u[k++] = z;
                j++;
            } else {
                u[k++] = z;
                i++;
                j++;
            }
        }
        return u[n];
    }
}