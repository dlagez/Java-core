package IO.base;

import java.io.*;

public class demo5_copyFile {
    public static void main(String[] args) throws IOException {
        File input = new File("/Volumes/roczhang/temp/temp.txt");
        File output = new File("/Volumes/roczhang/temp/temp2.txt");
        copyFile(input, output);
    }

    public static void copyFile(File source, File target) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(source); FileOutputStream outputStream = new FileOutputStream(target)) {
            byte[] bytes = new byte[1000];
            int byteRead;
            while ((byteRead = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, byteRead);
            }
        }
    }
}
