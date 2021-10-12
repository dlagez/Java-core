package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test3_mark {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("byteBuffer.capacity=" + byteBuffer.capacity());
        System.out.println();

        byteBuffer.position(1);
        byteBuffer.mark();

        System.out.println("byteBuffer.position=" + byteBuffer.position());

        byteBuffer.position(2);
        System.out.println("byteBuffer.position=" + byteBuffer.position());

        byteBuffer.reset();

        System.out.println();

        System.out.println("byteBuffer.position=" + byteBuffer.position());
    }
}
