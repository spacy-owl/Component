import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int n = read();

        System.out.print(n);
    }

    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 47 && c < 58) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}
