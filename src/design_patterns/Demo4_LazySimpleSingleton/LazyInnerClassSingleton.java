package design_patterns.Demo4_LazySimpleSingleton;

/**
 * 一旦出现多次重复创建，则抛出异常
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    // 默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
