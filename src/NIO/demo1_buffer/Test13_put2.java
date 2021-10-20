package NIO.demo1_buffer;

import java.nio.ByteBuffer;


public class Test13_put2 {
    public static void main(String[] args) {
        // 将缓冲区的数据写入到输出数组中
        byte[] byteArrayIn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayIn);
        byte[] byteArrayOut = new byte[5];
        while (byteBuffer.hasRemaining()) {
            int readLength = Math.min(byteBuffer.remaining(), byteArrayOut.length);
            byteBuffer.get(byteArrayOut, 0, readLength);
            for (int i = 0; i < readLength; i++) {
                System.out.print(byteArrayOut[i] + " ");
            }
            System.out.println();
        }
    }
}
