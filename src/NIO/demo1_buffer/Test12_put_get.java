package NIO.demo1_buffer;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import sun.util.resources.cldr.ebu.CurrencyNames_ebu;

import java.nio.ByteBuffer;

public class Test12_put_get {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        byteBuffer.put((byte) 125);
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        byteBuffer.put((byte) 126);
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        byteBuffer.put((byte) 127);
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        byteBuffer.rewind();
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        System.out.println(byteBuffer.get());
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        System.out.println(byteBuffer.get());
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        System.out.println(byteBuffer.get());
        System.out.println("cap=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit() + "pos=" + byteBuffer.position());
        System.out.println(byteBuffer.get());
        System.out.println("--------------------------------------------");
        byte[] getByteArray = byteBuffer.array();
        System.out.println("getByteArray.length = " + getByteArray.length);
        for (int i = 0; i < getByteArray.length; i++) {
            System.out.print(getByteArray[i] + " - ");
        }
    }
}
