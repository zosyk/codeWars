import java.math.BigInteger;
import static java.math.BigInteger.*;

public class Fibonacci {

    /**
     * https://rybczak.net/2015/11/01/calculation-of-fibonacci-numbers-in-logarithmic-number-of-steps/
     * */
    public static BigInteger fib(BigInteger n) {
        boolean isNegative = n.signum() == -1;

        if(isNegative) n = n.negate();

        BigInteger fib = go(n.intValue(), ZERO, ONE, ZERO, ONE);

        if(isNegative) {
            boolean isOdd = n.intValue() % 2 == 1;
            return isOdd ? fib : fib.negate();
        }
        return fib;
    }

    private static BigInteger go(int k, BigInteger a, BigInteger b, BigInteger p, BigInteger q) {
        if(k == 0) return a;

        if(k % 2 == 1) return go(k -1, (p.multiply(a)).add(q.multiply(b)), (q.multiply(a)).add((p.add(q)).multiply(b)), p, q);

        return go(k /2, a, b, (p.multiply(p)).add(q.multiply(q)), ((p.multiply(BigInteger.valueOf(2))).add(q)).multiply(q));
    }
}