package IO.base;

import java.io.*;

// 将对象序列化到文件。
//aced 0005 7372 001b 494f 2e62 6173 652e
//6465 6d6f 375f 7365 7269 616c 697a 6162
//6c65 32ff ffd3 7e7d 0d4a 7202 0001 4900
//036e 756d 7870 0000 056e
public class demo7_serializable2 implements Serializable{
    private static final long serialVersionUID = -48934759347598L;
    public int num = 1390;

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Volumes/roczhang/temp/temp.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            demo7_serializable2 serialize = new demo7_serializable2();
            oos.writeObject(serialize);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
