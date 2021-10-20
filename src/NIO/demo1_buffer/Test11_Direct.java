package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test11_Direct {
    public static void main(String[] args) {
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(100);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(100);
    }
}
