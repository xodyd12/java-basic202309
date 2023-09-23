package day09.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);

//        Calendar calender = Calendar.getInstance();

        //현재 날짜 정보 얻기 (연 월 일)
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        
        //현재 시간 정보 얻기 (시 분 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        //원하는 정보 추출
        int year = nowDateTime.getYear();
        Month month= nowDateTime.getMonth();
        System.out.println("month = " + month);
        int dayOfMonth = nowDateTime.getDayOfMonth();
        
        //원하는 날짜 만들기
        LocalDateTime targetTime = LocalDateTime.of(2023, 11, 25, 00, 00, 0);
        System.out.println("targetTime = " + targetTime);
    
        //날짜 연산
        //도서대여 시스템
        //대출날짜 오늘 -> 반납날짜는 17일뒤
        LocalDateTime rentalDate = LocalDateTime.now();
        LocalDateTime returnDate = rentalDate.plusDays(17);
        System.out.println("returnDate = " + returnDate);

        LocalDateTime localDateTime = returnDate.plusYears(1);
        localDateTime.plusMonths(6).plusDays(28);
        System.out.println("localDateTime = " + localDateTime);
        
        //사이 날짜 구하기
        LocalDate b = LocalDate.of(2019,9,28);
        LocalDate d = LocalDate.of(2023,9,22);



        long between = ChronoUnit.DAYS.between(b, d);
        System.out.println("between = " + between);
        
        //날짜 포맷 바꾸기
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");

        String dateString = nowDateTime.format(pattern);
        System.out.println("dateString = " + dateString);
    }
}
