package day03.player;

public class Main {
    public static void main(String[] args) {
       Player parking =  new Player("주차왕파킹");
       Player fucking =  new Player("욕설왕파킹");

       parking.attack(fucking);
        System.out.println("parking = " + parking);
        System.out.println("fucking = " + fucking);
    }
}
