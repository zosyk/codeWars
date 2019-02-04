import static org.junit.Assert.assertEquals;
import java.math.BigInteger;
import org.junit.Test;

public class AnagramsTest {
    @Test
    public void testKnownInputs() {
        Anagrams anagram = new Anagrams();

        assertEquals("Position for 'A' incorrect", BigInteger.ONE, anagram.listPosition("A"));
        assertEquals("Position for 'ABAB' incorrect", BigInteger.valueOf(2), anagram.listPosition("ABAB"));
        assertEquals("Position for 'ABAB' incorrect", BigInteger.valueOf(11), anagram.listPosition("CABA"));
        assertEquals("Position for 'ABAB' incorrect", BigInteger.valueOf(9), anagram.listPosition("BCAD"));
        assertEquals("Position for 'AAAB' incorrect", BigInteger.ONE, anagram.listPosition("AAAB"));
        assertEquals("Position for 'BAAA' incorrect", BigInteger.valueOf(4), anagram.listPosition("BAAA"));
        assertEquals("Position for 'QUESTION' incorrect", BigInteger.valueOf(24572), anagram.listPosition("QUESTION"));
        assertEquals("Position for 'BOOKKEEPER' incorrect", BigInteger.valueOf(10743), anagram.listPosition("BOOKKEEPER"));
    }
}
