package design_patterns.Demo3_LazySimpleSingleton;

public class Demo2_test {
    public static void main(String[] args) {
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
