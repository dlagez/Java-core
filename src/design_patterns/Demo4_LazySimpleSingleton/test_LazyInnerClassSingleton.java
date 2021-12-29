package design_patterns.Demo4_LazySimpleSingleton;

/**
 * 测试最后完美的单例模式
 */
public class test_LazyInnerClassSingleton {
    public static void main(String[] args) {
        LazyInnerClassSingleton instance1 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton instance2 = LazyInnerClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
