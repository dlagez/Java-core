package IO.base;

import java.io.File;

public class demo2_traverse_files {
    public static void main(String[] args) {
        File file = new File("/Volumes/roczhang/book");
//        File[] files1 = file.listFiles();  // 列出所有文件和子目录
//        printFiles(files1);
        printFiles(file);
    }

    // 打印目录下所有的文件（不包括目录的目录里的文件）
    static void printFiles(File[] files) {
        System.out.println("==============");
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }
        System.out.println("==============");
    }

    static void printFiles(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                System.out.println("======begin======="+f+"========begin========");
                printFiles(f);  // 若是目录，递归打印该目录下的文件
                System.out.println("======end======="+f+"========end========");
            }
            if (f.isFile())
                System.out.println(f);  // 若是文件，直接打印
        }
    }


}
