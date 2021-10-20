package NIO.demo2_FileChannel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//读取文件中的数据到缓冲区中
public class demo6_read_batch {
    private static FileInputStream fisRef;
    private static FileChannel fileChannel;

    public static void main(String[] args) throws IOException {
        fisRef = new FileInputStream(new File("/Volumes/roczhang/temp/a.txt"));
        fileChannel = fisRef.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(5);

        int readLength = fileChannel.read(byteBuffer);
        System.out.println(readLength);

//        System.out.println(byteBuffer);

        readLength = fileChannel.read(byteBuffer);
        System.out.println(readLength);  // 0 因为没有remianing空间了

        byteBuffer.clear();

        readLength = fileChannel.read(byteBuffer);
        System.out.println(readLength);
        // 想把缓冲区的数据打印出来，但是好像打印出来的是乱码
//        byte[] array = byteBuffer.array();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print((char)array[i]);
//        }

        byteBuffer.clear();
        fileChannel.close();
        fisRef.close();
    }
}
