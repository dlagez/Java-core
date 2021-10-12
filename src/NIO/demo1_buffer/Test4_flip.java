package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test4_flip {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        byteBuffer.position(2);
        byteBuffer.mark();

        // 会清楚mark信息。
        byteBuffer.flip();

        System.out.println("byteBuffer.position=" + byteBuffer.position());

        System.out.println();

        System.out.println("byteBuffer.limit=" + byteBuffer.limit());
        System.out.println();

        try {
            byteBuffer.reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
