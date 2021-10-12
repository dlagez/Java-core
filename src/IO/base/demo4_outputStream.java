package IO.base;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo4_outputStream {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("/Volumes/roczhang/temp/temp.txt")) {
//            output.write(72); // H
//            output.write(101); // e
//            output.write(108); // l
//            output.write(108); // l
//            output.write(111); // o
            output.write("Hello".getBytes(StandardCharsets.UTF_8));
        }
    }
}
