package NIO.demo1_buffer;

import java.nio.CharBuffer;

public class Test2_position {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("A capacity()=" + charBuffer.capacity() +
                " limit()=" + charBuffer.limit() +
                " position()=" + charBuffer.position());
        charBuffer.position(2);
        System.out.println("===============================");
        System.out.println("A capacity()=" + charBuffer.capacity() +
                " limit()=" + charBuffer.limit() +
                " position()=" + charBuffer.position());
        charBuffer.put("z");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
