import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("shutdown -s -t 0");
        System.exit(0);
    }
}