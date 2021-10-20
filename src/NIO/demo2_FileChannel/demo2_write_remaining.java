package NIO.demo2_FileChannel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class demo2_write_remaining {
    public static void main(String[] args) throws IOException {
        // 将buffer的数据写入到文件。
        FileOutputStream fosRef = new FileOutputStream(new File("/Volumes/roczhang/temp/a.txt"));
        FileChannel fileChannel = fosRef.getChannel();
        try {
            ByteBuffer buffer1 = ByteBuffer.wrap("abcde".getBytes());
            ByteBuffer buffer2 = ByteBuffer.wrap("12345".getBytes());
            fileChannel.write(buffer1);
            // 限制读取
            buffer2.position(1);
            buffer2.limit(3);
            fileChannel.position(2);
            // 直接写入的是pos-limit之间的数据
            fileChannel.write(buffer2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileChannel.close();
        fosRef.close();
    }
}
