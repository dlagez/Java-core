package NIO.demo1_buffer;

import java.nio.CharBuffer;

public class Test5_flip {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(20);
        System.out.println("A position=" + charBuffer.position() + " limit=" + charBuffer.limit());
        charBuffer.put("我是RocZhang");
        System.out.println("A position=" + charBuffer.position() + " limit=" + charBuffer.limit());

        charBuffer.position(0);

        System.out.println("A position=" + charBuffer.position() + " limit=" + charBuffer.limit());
        // 打印前需要设置limit的位置
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }

        System.out.println();

        System.out.println("A position=" + charBuffer.position() + " limit=" + charBuffer.limit());
        charBuffer.clear();
        System.out.println("A position=" + charBuffer.position() + " limit=" + charBuffer.limit());
        charBuffer.put("我是美国人");
        System.out.println("A position=" + charBuffer.position() + " limit=" + charBuffer.limit());

        charBuffer.limit(charBuffer.position());
        charBuffer.position(0);
        System.out.println("A position=" + charBuffer.position() + " limit=" + charBuffer.limit());

        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }
    }
}
