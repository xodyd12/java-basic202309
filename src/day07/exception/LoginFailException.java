package day07.exception;

public class LoginFailException extends Exception{
    //커스텀에러 클래스는
    //기본생성자와 에러메세지를 감는 생성자를 구현 합니다.


    public LoginFailException() {
    }

    public LoginFailException(String message) {
        super(message);
    }
}