import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DinglemouseTest {


    @Test
    public void ex0() {
        char[][] mountain = {
                "^^^^^^        ".toCharArray(),
                " ^^^^^^^^     ".toCharArray(),
                "  ^^^^^^^     ".toCharArray(),
                "  ^^^^^       ".toCharArray(),
                "  ^^^^^^^^^^^ ".toCharArray(),
                "  ^^^^^^      ".toCharArray(),
                "  ^^^^        ".toCharArray()
        };
        assertEquals(3, Dinglemouse.peakHeight(mountain));
    }


    @Test
    public void ex1() {
        char[][] mountain = {
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^".toCharArray()
        };
        assertEquals(11, Dinglemouse.peakHeight(mountain));
    }

    @Test
    public void ex2() {
        char[][] mountain = {
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        ".toCharArray(),
             "      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^     ".toCharArray(),
             "       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^       ".toCharArray(),
             "       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^       ".toCharArray(),
             "       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^     ".toCharArray(),
             "       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^    ".toCharArray(),
             "       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^      ".toCharArray(),
             "        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^       ".toCharArray(),
             "      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^     ".toCharArray(),
             "      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray(),
             "     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  ".toCharArray(),
             "     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray(),
             "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray(),
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^    ".toCharArray(),
             "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^    ".toCharArray(),
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^    ".toCharArray(),
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^     ".toCharArray(),
             "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^       ".toCharArray(),
             "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^      ".toCharArray(),
             "     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^      ".toCharArray(),
             "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^      ".toCharArray(),
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^      ".toCharArray(),
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^     ".toCharArray(),
             "  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^      ".toCharArray(),
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^    ".toCharArray(),
             "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  ".toCharArray(),
             "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray(),
             "     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray(),
             "     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  ".toCharArray(),
             "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  ".toCharArray(),
             "      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  ".toCharArray(),
             "     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray(),
             "      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray(),
             "       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ".toCharArray(),
             "         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ".toCharArray()
        };
        assertEquals(18, Dinglemouse.peakHeight(mountain));
    }

}