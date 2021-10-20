package NIO.demo1_buffer;

import java.nio.CharBuffer;

public class Test2_limit {
    public static void main(String[] args) {
        char[] charArray= {'a', 'b', 'c', 'd', 'e'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("A capacity() =" + charBuffer.capacity() + " limit()=" + charBuffer.limit());
        charBuffer.limit(3);
        System.out.println();

        System.out.println("A capacity() =" + charBuffer.capacity() + " limit()=" + charBuffer.limit());

        charBuffer.put(0, 'o');
        charBuffer.put(1, 'p');
        charBuffer.put(2, 'q');
        charBuffer.put(3, 'r');
        charBuffer.put(4, 's');
        charBuffer.put(5, 't');
        charBuffer.put(6, 'u');

    }
}
