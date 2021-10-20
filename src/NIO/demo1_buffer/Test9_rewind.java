package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test9_rewind {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3, 4, 5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        System.out.println("cap=" + byteBuffer.capacity() + " limit=" + byteBuffer.limit() + " pos=" + byteBuffer.position());
        byteBuffer.position(1);
        byteBuffer.limit(3);
        byteBuffer.mark();
        System.out.println("cap=" + byteBuffer.capacity() + " limit=" + byteBuffer.limit() + " pos=" + byteBuffer.position());

        byteBuffer.rewind();
        System.out.println("cap=" + byteBuffer.capacity() + " limit=" + byteBuffer.limit() + " pos=" + byteBuffer.position());
        byteBuffer.reset();
    }
}
