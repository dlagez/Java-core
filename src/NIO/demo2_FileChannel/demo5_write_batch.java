package NIO.demo2_FileChannel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// 将批量的缓冲区数据写入文件,注意，写入文件会将文件本身的内容清空
public class demo5_write_batch {
    public static void main(String[] args) throws IOException {
        // 将buffer的数据写入到文件。
        FileOutputStream fosRef = new FileOutputStream(new File("/Volumes/roczhang/temp/a.txt"));
        FileChannel fileChannel = fosRef.getChannel();

        fileChannel.write(ByteBuffer.wrap("123456".getBytes()));
        fileChannel.position(3);

        ByteBuffer buffer1 = ByteBuffer.wrap("oooooo1".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap("oooooo2".getBytes());
        ByteBuffer[] bufferArray = {buffer1, buffer2};
        fileChannel.write(bufferArray);

        fileChannel.close();
        fosRef.close();
    }
}
