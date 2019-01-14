import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ByteStreamTest {

    @Test
    public void test_0() throws IOException {
        ByteStream stream = new ByteStream();
        try { stream.write((byte)0); fail("exception expected"); } catch (IOException e) {}
        try { stream.read(); fail("exception expected"); } catch (IOException e) {}

        stream.flip();
        try { stream.read(); fail("exception expected"); } catch (IOException e) {}
        // write nothing

        stream.flip();
        try { stream.write((byte)0); fail("exception expected"); } catch (IOException e) {}
        assertEquals(-1, stream.read());
        assertEquals(-1, stream.read());

        stream.flip();
        try { stream.read(); fail("exception expected"); } catch (IOException e) {}
        stream.write((byte)0);

        stream.flip();
        try { stream.write((byte)0); fail("exception expected"); } catch (IOException e) {}
        assertEquals(0, stream.read());
        assertEquals(-1, stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void test_1() throws IOException {
        ByteStream stream = new ByteStream();

        byte[] input = "Hello World".getBytes();
        int b = input.length;

        stream.flip();
        for (int j = 0; j < b; j++) {
            stream.write(input[j]);
        }

        byte[] output = new byte[b];

        stream.flip();
        for (int j = 0; j < b; j++) {
            int d = stream.read();
            assertTrue("out of read storage", d >= 0);
            output[j] = (byte) d;
        }

        assertEquals(-1, stream.read());
        assertArrayEquals(input, output);

        input = "Good bye".getBytes();
        b = input.length;

        stream.flip();
        for (int j = 0; j < b; j++) {
            stream.write(input[j]);
        }

        output = new byte[b];

        stream.flip();
        for (int j = 0; j < b; j++) {
            int d = stream.read();
            assertTrue("out of read storage", d >= 0);
            output[j] = (byte) d;
        }

        assertEquals(-1, stream.read());
        assertArrayEquals(output, input);
    }

    @Test
    public void test_2_400000() throws IOException {
        ByteStream stream = new ByteStream();

        byte[] input = new byte[10000000];
        int b = input.length;
        for(int i =0; i< b; i++) {
            input[i] = "a".getBytes()[0];
        }
        stream.flip();
        for (int j = 0; j < b; j++) {
            stream.write(input[j]);
        }
        byte[] output = new byte[b];

        stream.flip();
        for (int j = 0; j < b; j++) {
            int d = stream.read();
            assertTrue("out of read storage", d >= 0);
            output[j] = (byte) d;
        }

        assertEquals(-1, stream.read());
        assertArrayEquals(input, output);
    }
}
