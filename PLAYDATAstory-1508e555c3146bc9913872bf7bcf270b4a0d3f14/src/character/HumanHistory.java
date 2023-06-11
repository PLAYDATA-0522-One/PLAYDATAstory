
package character;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HumanHistory {
    public static void main(String[] args) {
        Date now = new Date();

        // 현재 날짜/시간 출력
        System.out.println(now); // Thu May 03 14:43:32 KST 2022

        // 포맷팅 정의
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");

        // 포맷팅 적용
        String formatedNow = formatter.format(now);

        // 포맷팅 현재 날짜/시간 출력
        System.out.println(formatedNow);

    }
    // set
    // 올


}
