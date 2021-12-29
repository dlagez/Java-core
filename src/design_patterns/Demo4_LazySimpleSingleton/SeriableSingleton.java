package design_patterns.Demo4_LazySimpleSingleton;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {}

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }
    // 添加一下代码即可防止序列化破坏单例模式
    private Object readResolve() {
        return INSTANCE;
    }
}
