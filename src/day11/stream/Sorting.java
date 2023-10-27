package day11.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day11.stream.Menu.menuList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Sorting {

    //음식 목록중 칼로리가 낮은 순으로 정렬
    public static void main(String[] args) {
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        //칼로리 내림차 정렬(높은 순)
        System.out.println("================================================");
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);
        System.out.println("=================================================");
        //500칼로리 보다 큰 요리 중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories()<500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);
    }

}
