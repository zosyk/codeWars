import org.junit.Test;

import static org.junit.Assert.*;

public class NextBiggerNumberTest {

    @Test
    public void basicTests() {
        assertEquals(21, NextBiggerNumber.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumber.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumber.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumber.nextBiggerNumber(414));
        assertEquals(414, NextBiggerNumber.nextBiggerNumber(144));
        assertEquals(-1, NextBiggerNumber.nextBiggerNumber(531));
        assertEquals(-1, NextBiggerNumber.nextBiggerNumber(9));
        assertEquals(-1, NextBiggerNumber.nextBiggerNumber(111));
        assertEquals(1234567908, NextBiggerNumber.nextBiggerNumber(1234567890));
        assertEquals(1141532428, NextBiggerNumber.nextBiggerNumber(1141532284));
    }

}