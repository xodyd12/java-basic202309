package day01;

public class Casting {
    public static void main(String[] args) {
        
        byte a = 100; //1바이트
        int b = a; //4바이트

        System.out.println("b = " + b);
        
        int c = 1000; //4바이트
        byte d = (byte) c; //int를 byte로 바꾸니깐 잘려서 나옴
        System.out.println("d = " + d);//1바이트
        
        double n = 3.5;
        int m = (int) n;
        //다운 캐스팅은 데이터 소실이 일어날 수 있음
        System.out.println("m = " + m);

        //연산시 일어나는 자동 캐스팅
        int k = 100;
        double j = 5.6;

        double result = k + j;
        //데이터 크기가 다른 데이터 끼리의 연산은
        //작은 쪽을 큰 쪽으로 자동 변환 후 연산을 진행

        char x = 'A';
        int y = 3;

        int result2 =x + y;
        System.out.println(result2);

        // int 보다 작은 데이터 (byte, short, char)
        //의 연산은 결과가 자동으로 int로 처리된다.
        byte b1 = 100;
        byte b2 = 120;

        int result3 = b1 + b2;

        System.out.println('A' + 'C');

        int g = 24;
        double r = (double)g /5;
        System.out.println("r = " + r);
    }
}
