package NIO.demo2_FileChannel;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// 使用多线程测试channel的写操作是线程安全的。
public class demo2_write_tb {
    private static FileOutputStream fosRef;
    private static FileChannel fileChannel;
    public static void main(String[] args) throws IOException, InterruptedException {
        // 将buffer的数据写入到文件。
        fosRef = new FileOutputStream(new File("/Volumes/roczhang/temp/a.txt"));
        fileChannel = fosRef.getChannel();

        for (int i = 0; i < 10; i++) {
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    try {
                        ByteBuffer buffer = ByteBuffer.wrap("abcde\r\n".getBytes());
                        fileChannel.write(buffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    try {
                        ByteBuffer buffer = ByteBuffer.wrap("我是中国人\r\n".getBytes());
                        fileChannel.write(buffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread1.start();
            thread2.start();
        }
        Thread.sleep(3000);
        fileChannel.close();
        fosRef.close();
    }
}
