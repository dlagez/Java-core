package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test8_remaining {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.limit(3);
        byteBuffer.position(2);

        System.out.println("has = " + byteBuffer.hasRemaining() + " byteBuffer.remaining=" + byteBuffer.remaining());
    }
}
