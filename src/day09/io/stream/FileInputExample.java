package day09.io.stream;

import java.io.FileInputStream;

public class FileInputExample {

    public static void main(String[] args) {

        String path = "C:/Users/cyci/Desktop/java/java-basic202309/src/day03/member/MemberRepository.java";
        
        try (FileInputStream fis = new FileInputStream(path)){
            int date = 0;
            while(date!= -1){
                date = fis.read();

                //아스키 출력 담당
                System.out.write(date);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
