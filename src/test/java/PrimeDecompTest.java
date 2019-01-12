import static org.junit.Assert.*;
import org.junit.*;

public class PrimeDecompTest {
    @Test
    public void testPrimeDecompOne() {
        int lst = 56424380;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimeDecomp.factors(lst));
    }
}