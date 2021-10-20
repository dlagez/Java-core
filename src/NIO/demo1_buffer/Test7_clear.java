package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test7_clear {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        byteBuffer.position(2);
        byteBuffer.limit(3);
        byteBuffer.mark();

        System.out.println(byteBuffer.capacity());
        System.out.println("pos=" + byteBuffer.position() + " limit=" + byteBuffer.limit());

        byteBuffer.clear();
        System.out.println("pos=" + byteBuffer.position() + " limit=" + byteBuffer.limit());
    }
}
