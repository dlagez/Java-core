package NIO.demo3_socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class demo1_client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;

        try {
            socket = new Socket("www.baidu.com", 80);
            System.out.println("socket连接成功！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("连接失败!");
        } finally {
            socket.close();
        }
    }
}
