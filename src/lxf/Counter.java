package lxf;

public class Counter {

    public static void main(String[] args) {
        add(-5);
    }

    private static int count = 0;


    public static synchronized void add(int n) {
        if (n < 0) {
            dec(-n);
        } else {
            count += n;
        }
    }

    public static synchronized void dec(int n) {
        count += n;
    }
}
