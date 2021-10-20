package NIO.demo2_FileChannel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class demo1_write {
    public static void main(String[] args) throws IOException {
        // 将buffer的数据写入到文件。
        FileOutputStream fosRef = new FileOutputStream(new File("/Volumes/roczhang/temp/a.txt"));
        FileChannel fileChannel = fosRef.getChannel();
        try {
            ByteBuffer buffer = ByteBuffer.wrap("abcde".getBytes());
            System.out.println("fileChannel.pos=" + fileChannel.position());
            // 返回值好像是写入字节数。
            System.out.println("write 1 返回值" + fileChannel.write(buffer));
            System.out.println("fileChannel.pso=" + fileChannel.position());
            fileChannel.position(2);
            buffer.rewind(); // 还原buffer的position为0
            System.out.println("write 2 返回值" + fileChannel.write(buffer));
            System.out.println("fileChannel.pos=" + fileChannel.position());
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileChannel.close();
        fosRef.close();
    }
}
