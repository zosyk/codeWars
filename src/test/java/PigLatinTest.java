import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("Oay emporatay oay oresmay !", PigLatin.pigIt("O tempora o mores !"));
    }
}