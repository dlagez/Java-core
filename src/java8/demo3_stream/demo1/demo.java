package java8.demo3_stream.demo1;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class demo {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("park", false, 300, "aaa"),
                new Dish("pork1", false, 200, "aaa"),
                new Dish("pork2", false, 900, "aaa"),
                new Dish("pork3", false, 800, "aaa"),
                new Dish("pork4", false, 700, "aaa"),
                new Dish("pork5", false, 100, "aaa"),
                new Dish("pork6", false, 40, "aaa")
        );

        List<Dish> low = new ArrayList<>();

        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                low.add(dish);
            }
        }

        Collections.sort(low, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        List<String> lowNames = new ArrayList<>();
        for (Dish dish : low) {
            lowNames.add(dish.getName());
        }

        System.out.println(lowNames);

        List<String> names = menu.stream().filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
        System.out.println(names);

    }
}
