package day05.poly;


import java.util.Objects;
import java.util.Scanner;

class A extends Object{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {

    void text() {
        //다형성: 자식객체가 부모의 타입을 사용할 수 있다.
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        Object scanner = new Scanner(System.in);
    }

}
