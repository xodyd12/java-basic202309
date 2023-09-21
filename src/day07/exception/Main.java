package day07.exception;

import util.Utility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("abc123", "1234");

        String id = Utility.input("ID: ");
        String pw = Utility.input("PW: ");

        try {
            String result = user.validate(id, pw);
            System.out.println("result = " + result);
        } catch (LoginFailException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("시발 색스");
        }
    }
}
