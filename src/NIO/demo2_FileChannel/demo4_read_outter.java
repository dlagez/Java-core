package NIO.demo2_FileChannel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//读取文件中的数据到缓冲区中
public class demo4_read_outter {
    private static FileInputStream fisRef;
    private static FileChannel fileChannel;

    public static void main(String[] args) throws IOException {
        fisRef = new FileInputStream(new File("/Volumes/roczhang/temp/a.txt"));
        fileChannel = fisRef.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        System.out.println("fileChannel.position()" + fileChannel.position());
        System.out.println("byteBuffer.position()" + byteBuffer.position());
        fileChannel.read(byteBuffer);
        System.out.println("fileChannel.position()" + fileChannel.position());
        System.out.println("byteBuffer.position()" + byteBuffer.position());



        fileChannel.close();
        fisRef.close();
        // 通道“重新写入或获取”的操作之前调用此方法。
        byteBuffer.rewind();
        for (int i = 0; i < byteBuffer.limit(); i++) {
            System.out.print((char) byteBuffer.get());
        }
    }
}
