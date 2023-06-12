
package character;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HumanHistory {
    public static void main(String[] args) {
        Date now = new Date();

        // 포맷팅 정의
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println("게임을 시작하였습니다.");

        // 포맷팅 적용
        String formatedNow = formatter.format(now);

        // 포맷팅 현재 날짜/시간 출력
        System.out.println(formatedNow);

    }
    // set
    // 올


}
