import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFib0() {
        testFib("0", 0);
    }

    @Test
    public void testFib1() {
        testFib("1", 1);
    }

    @Test
    public void testFib2() {
        testFib("1", 2);
    }

    @Test
    public void testFib3() {
        testFib("2", 3);
    }

    @Test
    public void testFib4() {
        testFib("3", 4);
    }

    @Test
    public void testFib5() {
        testFib("5", 5);
    }

    @Test
    public void testFib6() {
        testFib("-8", -6);
    }

    @Test
    public void testFib7() {
        testFib("-144", -12);
    }

    @Test
    public void testFib8() {
        testFib("-2584", -18);
    }

    @Test
    public void testFib9() {
        testFib("-102334155", -40);
    }

    @Test
    public void testFib10() {
        testFib("9227465", -35);
    }

    @Test
    public void testFib11() {
        testFib(11, "89");
    }


    private static void testFib(long input, String expected) {
        testFib(expected, input);
    }

    private static void testFib(String expected, long input) {
        BigInteger found;
        try {
            found = Fibonacci.fib(BigInteger.valueOf(input));
        }
        catch (Throwable e) {
            // see https://github.com/Codewars/codewars.com/issues/21
            throw new AssertionError("exception during test: "+e, e);
        }
        assertEquals(expected, found.toString());
    }

}