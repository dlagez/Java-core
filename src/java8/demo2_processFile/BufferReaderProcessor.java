package java8.demo2_processFile;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
