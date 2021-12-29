package design_patterns.Demo4_LazySimpleSingleton;

public class HungrySingleton {
    // 先静态后动态
    // 先属性后方法
    // 先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
