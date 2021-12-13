package java8.demo1_apple_filter;

import java.util.ArrayList;
import java.util.List;

public class demo1_apple {

    public static void main(String[] args) {
        ArrayList<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(20, "green"));
        inventory.add(new Apple(21, "green"));
        inventory.add(new Apple(20, "red"));
        inventory.add(new Apple(20, "blue"));

        List<Apple> apples = filterGreenApple(inventory);
        System.out.println(apples);

        List<Apple> greens = filterAppleByColor(inventory, "green");
        System.out.println(greens);

        // 使用匿名内部类
        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        System.out.println("redApples:" + redApples.toString());
    }

    // 直接在方法中实现功能呢，如果需求改变，编程使用重量来分类，需要把这个类复制，然后修改其中的一些方法。
    public static List<Apple> filterGreenApple(List<Apple> inventory) {
        List<Apple> results = new ArrayList<>();
        for (Apple apple : inventory) {
            if ( "green".equals(apple.getColor())) {
                results.add(apple);
            }
        }
        return results;
    }

    // 将参数传递到方法中，改变需求还是需要复制代码来修改
    public static List<Apple> filterAppleByColor(List<Apple> inventory, String color) {
        List<Apple> results = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                results.add(apple);
            }
        }
        return results;
    }

    // 定义一个比较的接口。在接口中实现比较方法。在筛选苹果的时候只要传递比较方法即可，缺点是需要定义很多种比较方法。
    // 对比上面的方法，优点是将比较方法和筛选方法解耦了。
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    // 使用匿名内部类
    
    
}
