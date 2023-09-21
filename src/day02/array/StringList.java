package day02.array;

import java.util.Arrays;

public class StringList {

    //스트링 배열을 필드로 등록
    String[] sArr;//{ "짜장면", "짬뽕", "탕수육" }
    //생성자를 통해 배열을 초기화
    public StringList(){
        sArr = new String[0];
    }
    StringList(String... initData){
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }
    public void push(String item){
        String[] temp = new String[sArr.length+1]; //{"", "", "", ""}
        for (int i = 0; i <sArr.length ; i++) {
            temp[i] = sArr[i];//{"짜장면", "짬뽕", "탕수육", ""}
        }
        temp[sArr.length] = item;//{"짜장면", "짬뽕", "탕수육", item}
        sArr = temp;
    }

    void pop(){
        if(sArr.length < 1){
            return;
        }
        String[]temp = new String[sArr.length -1];
        for (int i = 0; i <temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }

    void insert(int index, String item){
//        sArr: {"제육볶음", "김치찌개", "짜장면, "볶음밥", "탕수육"}
//        temp: {"","","닭도리탕","","",""}
        String[] temp = new String[sArr.length +1];
        temp[index] = item;
        for (int i = index+1; i < temp.length; i++) {
            temp[i] = sArr[i-1];
        }
        for (int i = 0; i <index; i++) {
            temp[i] = sArr[i];
        }
        sArr =temp;
    }

    void printArray(){
        System.out.println(Arrays.toString(sArr));
    }

    public String[] getsArr() {
        return sArr;
    }
}
