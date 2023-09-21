package day07.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수1: ");
            int n1 = sc.nextInt(); //InputMismatch

            System.out.println("정수 2: ");
            int n2  =sc.nextInt(); //InputMismatch

            int result = n1/n2; //Arithmetic
            System.out.println(" result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("나누기 오류 발생! 숫자를 입력해아죠 ㅡㅡ");
        } catch (ArithmeticException e) {
            System.out.println("0으로는 못나눠요 !");
        } finally {
            System.out.println("이 코드는 항상 실행 됩니다.");
            sc.close();
        }


        System.out.println("프로그램 정상 종료");
    }
}
