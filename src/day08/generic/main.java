package day08.generic;

import util.Utility;

public class main {

    public static void main(String[] args) {

        Apple a1 = new Apple(10);
        System.out.println(a1.toString());

        AppleBasket ab = new AppleBasket();
        ab.setApple(a1);
        Apple apple = ab.getApple();

        Banana b1 = new Banana();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(b1);

        Basket<Apple> appleBasket = new Basket<Apple>();
        appleBasket.setFruit(new Apple(7));
        Apple app = appleBasket.getFruit();

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setFruit(new Banana());
        Banana banana = bananaBasket.getFruit();

        Basket<Peach> peachBasket = new Basket<>();

        Utility.makeLine();
        GenericList<String> sList = new GenericList<>();
        sList.push("볶음밥");
        sList.push("치킨");
        sList.push("피자");
        sList.pop();

        sList.printArray();

    }
}
