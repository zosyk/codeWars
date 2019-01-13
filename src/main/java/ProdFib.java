public class ProdFib { // must be public for codewars

    public static long[] productFib(long prod) {
        int n = 0;
        int n1 = 1;

        long fib = getFib(n);
        long fib1 = getFib(n1);
        while (fib * fib1 < prod) {
            fib = getFib(++n);
            fib1 = getFib(++n1);
        }
        return new long[]{fib, fib1, fib * fib1 == prod ? 1 : 0};
    }

    private static long getFib(int n) {
        if (n == 0)
            return 0;

        long[] fibs = {0, 1};
        for (int i = 2; i <= n; i++) {
            long prev = fibs[1];
            fibs[1] = fibs[0] + fibs[1];
            fibs[0] = prev;
        }
        return fibs[1];
    }
}