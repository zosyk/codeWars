import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NutFarm2Test {

    @Test
    public void bounceLeft() {
        final char tree[][] = Utils.makeTree(new String[]{
                " o o o  ",
                " /    / ",
                "   /    ",
                "  /  /  ",
                "   ||   ",
                "   ||   ",
                "   ||   "
        });
        Utils.showTree(tree);
        final int[] got = NutFarm2.shakeTree(tree);
        Utils.showNuts(got);
        assertArrayEquals(new int[]{1, 1, 0, 0, 1, 0, 0, 0}, got);
    }

    @Test
    public void rollLeft() {
        final char tree[][] = Utils.makeTree(new String[]{
                " o      ",
                " / o o/ ",
                " ///    ",
                "   ///  ",
                "   ||   ",
                "   ||   ",
                "   ||   "
        });
        Utils.showTree(tree);
        final int[] got = NutFarm2.shakeTree(tree);
        Utils.showNuts(got);
        assertArrayEquals(new int[]{2, 0, 1, 0, 0, 0, 0, 0}, got);
    }

    @Test
    public void bounceRight() {
        final char tree[][] = Utils.makeTree(new String[]{
                " o o o  ",
                " \\    \\ ",
                "   \\    ",
                "  \\  \\  ",
                "   ||   ",
                "   ||   ",
                "   ||   ",

        });
        Utils.showTree(tree);
        final int[] got = NutFarm2.shakeTree(tree);
        Utils.showNuts(got);
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 0, 1, 0}, got);
    }

    @Test
    public void rollRight() {
        final char tree[][] = Utils.makeTree(new String[]{
                " o o  oo  ",
                " \\\\\\   \\\\ ",
                "  o \\o    ",
                "  \\\\  \\   ",
                "    ||    ",
                "    ||    ",
                "    ||    ",

        });
        Utils.showTree(tree);
        final int[] got = NutFarm2.shakeTree(tree);
        Utils.showNuts(got);
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 3, 0, 1, 0, 1}, got);
    }

    @Test
    public void rollRightAndGetStuck() {
        final char tree[][] = Utils.makeTree(new String[]{
                " o o  oo  ",
                " \\\\\\   \\\\ ",
                "  o \\o    ",
                "  \\/  \\   ",
                "    ||    ",
                "    ||    ",
                "    ||    ",

        });
        Utils.showTree(tree);
        final int[] got = NutFarm2.shakeTree(tree);
        Utils.showNuts(got);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 3, 0, 1, 0, 1}, got);
    }

}