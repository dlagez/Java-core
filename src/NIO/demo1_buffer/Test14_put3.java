package NIO.demo1_buffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Test14_put3 {
    public static void main(String[] args) {
        // 将一个数组的数据写入到缓存中
        byte[] byteArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(4);
        int byteArrayCurrentIndex = 0;
        int byteArrayRemaining = 0;
        // byteArrayCurrentIndex记录byteArray1写入到了哪，由于byteArray1是分段写入的，所以需要记录。
        // 当byteArray1 == byteArrayCurrentIndex时， 说明这个数组已经写入完了。
        while (byteArrayCurrentIndex < byteArray1.length) {
            // 计算byteArray1还剩多少数据。
            byteArrayRemaining = byteArray1.length - byteArrayCurrentIndex;
            // 如果byteArray1剩余的数据比较多，就将读取数据的长度设置为缓冲区的长度。因为缓冲区只有这么长，一次只能读取它长度的数据
            int readLength = Math.min(byteArrayRemaining, byteBuffer1.remaining());
            // 将byteArray1的要读取的索引区间的数据取出来。
            byte[] newByteArray = Arrays.copyOfRange(byteArray1, byteArrayCurrentIndex, byteArrayCurrentIndex + readLength);
            // 将取出来的数据写入缓冲区
            byteBuffer1.put(newByteArray);
            byteBuffer1.flip();  // 读取数据时用到flip，他会将limit设置到最后一个存入的数据索引上。
            byte[] getByte = byteBuffer1.array();
            for (int i = 0; i < byteBuffer1.limit(); i++) {
                System.out.println(getByte[i] + " ");
            }
            System.out.println();
            byteArrayCurrentIndex = byteArrayCurrentIndex + readLength;
            byteBuffer1.clear();  // 将缓冲区的位置和限制设置到初始位置，方便下一次读取。

        }
    }
}
