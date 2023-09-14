package day05.poly.car;

import util.Utility;

public class Main {

    public static void main(String[] args) {


        int a = 10;
        double b  = a;

        Avante avante = new Avante();
        Car cc = avante;
        Car avante2 = new Avante();
        Mustang mustang = new Mustang();
        Car stinger = new Stinger();
        mustang.exhaust();
        Car[] cars = {avante, avante2, mustang, stinger};
        for (Car c : cars) {
            c.accelerate();
        }

        Object[] arr = {"hello", "안녕", 10, false};

        Utility.makeLine();

        Driver park = new Driver();
        park.drive(new Stinger());

        CarShop shop = new CarShop();
        Utility.makeLine();
        Mustang myCar =  (Mustang) shop.exportCar(6000);
        myCar.accelerate();
        myCar.exhaust();

        //r객체의 다운캐스팅은 전제조건이 있음
        //한번 업캐스티이 된 자식객체만 다시 다운캐스팅 가능
        Utility.makeLine();


     Car myStinger = new Stinger();
     Stinger ss = (Stinger) myStinger;
     Car car = new Car();
     Avante aaa = (Avante) car;
    }
}
