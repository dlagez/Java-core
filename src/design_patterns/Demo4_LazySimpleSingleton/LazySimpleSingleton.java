package design_patterns.Demo4_LazySimpleSingleton;

public class LazySimpleSingleton {
    private LazySimpleSingleton() {};

    private static LazySimpleSingleton lazy = null;

    // 这里在多线程的时候会出现问题
    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
