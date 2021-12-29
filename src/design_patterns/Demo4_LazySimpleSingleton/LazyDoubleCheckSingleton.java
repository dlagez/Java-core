package design_patterns.Demo4_LazySimpleSingleton;

/**
 * 双重检查锁的单例模式，只是在getInstance方法内部进行锁的检查
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                   //分配内存给这个对象
                   // 初始化对象
                   // 设置lazy指向刚分配的内存地址
                }
            }
        }
        return lazy;
    }
}
