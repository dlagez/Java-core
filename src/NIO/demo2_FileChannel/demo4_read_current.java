package NIO.demo2_FileChannel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//读取文件中的数据到缓冲区中
public class demo4_read_current {
    private static FileInputStream fisRef;
    private static FileChannel fileChannel;

    public static void main(String[] args) throws IOException {
        fisRef = new FileInputStream(new File("/Volumes/roczhang/temp/a.txt"));
        fileChannel = fisRef.getChannel();
        // 文件的第三个字符开始
        fileChannel.position(2);

        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        // 缓冲区的第四个字符开始, 前三个为空格。
        byteBuffer.position(3);

        fileChannel.read(byteBuffer);

        byte[] array = byteBuffer.array();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("空格");
            } else {
                System.out.println((char) array[i]);
            }
        }

        fileChannel.close();
        fisRef.close();
    }
}
