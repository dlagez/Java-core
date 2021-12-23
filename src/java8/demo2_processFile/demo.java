package java8.demo2_processFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        System.out.println(processFile());

        String s = processFile2((BufferedReader br) -> br.readLine());
        System.out.println("s: " + s);


        String s2 = processFile2((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println("s: " + s2);
    }

    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Volumes/roczhang/temp/a.txt"));) {
            return br.readLine();
        }
    }

    public static String processFile2(BufferReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Volumes/roczhang/temp/a.txt"));) {
            return p.process(br);
        }
    }
}
