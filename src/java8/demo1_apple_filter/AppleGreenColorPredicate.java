package java8.demo1_apple_filter;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
