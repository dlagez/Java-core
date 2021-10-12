package IO.base;

import java.io.FileInputStream;
import java.io.IOException;

public class demo3_InputStream {
    public static void main(String[] args) throws IOException {
        readFile2();
    }
    // 一次读取一个字节
    public void readFile() throws IOException {
        try (FileInputStream input = new FileInputStream("/Users/roczhang/Downloads/2016/陕西.txt")) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        }
    }

    public static void readFile2() throws IOException {
        try (FileInputStream input = new FileInputStream("/Users/roczhang/Downloads/2016/陕西.txt")) {
            byte[] buffer = new byte[1000];
            int n;
            // read()方法的返回值不再是字节的int值，而是返回实际读取了多少个字节
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read " + n + " bytes");
                System.out.println(new String(buffer, 0, buffer.length));
            }
        }
    }
}
