package design_patterns.Demo4_LazySimpleSingleton;

public class test_hungrySingleton {
    public static void main(String[] args) {
        HungrySingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton = HungryStaticSingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton2 = HungryStaticSingleton.getInstance();
        System.out.println(hungryStaticSingleton2 == hungryStaticSingleton);
    }
}
