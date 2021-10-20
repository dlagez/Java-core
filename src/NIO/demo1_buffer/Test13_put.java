package NIO.demo1_buffer;

import java.nio.ByteBuffer;

public class Test13_put {
    public static void main(String[] args) {
        byte[] byteArrayIn1 = {1, 2, 3, 4, 5, 6, 7, 8};
        byte[] byteArrayIn2 = {55, 66, 77, 88};

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        byteBuffer.put(byteArrayIn1);

        byteBuffer.position(2);
        // 这里的偏移量是byteArrayIn2的偏移量,偏移一个，就是从第二个索引开始
        byteBuffer.put(byteArrayIn2, 1, 3);
        System.out.print("A=");
        byte[] getByte = byteBuffer.array();
        for (int i = 0; i < getByte.length; i++) {
            System.out.print(getByte[i] + " ");
        }
        System.out.println();

        byteBuffer.position(1);
        // 创建数组存储缓冲区的数据
        byte[] byteArrayOut = new byte[byteBuffer.capacity()];
        // byteArrayOut 偏移3个，从第四个索引开始。
        byteBuffer.get(byteArrayOut, 3, 4);
        System.out.print("B=");
        for (int i = 0; i < byteArrayOut.length; i++) {
            System.out.print(byteArrayOut[i] + " ");
        }
    }
}
