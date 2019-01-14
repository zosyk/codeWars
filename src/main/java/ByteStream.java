import java.io.IOException;

public class ByteStream {

    private Boolean isWrite;
    private byte[] buf;
    protected int count;
    protected int pos;

    public ByteStream() {
        buf = new byte[1100000000];
    }

    public void flip() throws IOException {
        if(isWrite == null)
            isWrite = true;
        else
            isWrite = !isWrite;
    }

    public void write(byte b) throws IOException {
        if(isWrite == null || !isWrite)
            throw new IOException();
        buf[count] = b;
        count += 1;
    }

    public int read() throws IOException {
        if(isWrite == null || isWrite)
            throw new IOException();
        return (pos < count) ? (buf[pos++] & 0xff) : -1;
    }
}
