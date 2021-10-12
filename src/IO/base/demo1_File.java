package IO.base;

import java.io.File;
import java.io.IOException;

// 参考：https://www.liaoxuefeng.com/wiki/1252599548343744/1298069154955297
public class demo1_File {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/roczhang/Downloads/2016/陕西.txt");
//        System.out.println(file);
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalPath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        // 判断权限
        System.out.println("-------------判断权限--------------");
        System.out.println("file.canRead(): " + file.canRead());
        System.out.println("file.canWrite(): " + file.canWrite());
        System.out.println("file.canExecute(): " + file.canExecute());
    }
}
