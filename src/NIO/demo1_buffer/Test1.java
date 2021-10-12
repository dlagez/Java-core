package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test1 {
    public static void main(String[] args) {
        byte[] byteArrays = {1, 2, 3};

        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrays);

        System.out.println("bytebuffer=" + byteBuffer.getClass().getName());

        System.out.println("bytebuffer.capacity=" + byteBuffer.capacity());
    }
}
