package creaturedata;

import creature.Monster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;
public class MonsterData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("명령어) ");
        String cmd = sc.nextLine();
        try {
            // 데이터베이스 Connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/monster_db", "monster_db", "1q2w3e4r");
            // select 쿼리
            // 테이블 불러오기
            String qu = "select * from monster"; //string을 통해서 사용할 명령어문을 입력
            // java statement 생성
            Statement st = con.createStatement();
            // 쿼리 execute , 객체형성
            ResultSet rs = st.executeQuery(qu);
            System.out.println("start");
            // article list 입력을 받으면 실행
            if (cmd.equals("start")) { //입력하는 string이 start이면 밑의 부분이 실행됨
                System.out.println("== 몬스터 정보 ==");
                System.out.println("id, name, hp, attackpoint");
                // 각 열을 반복적으로 나타내줌
                while (rs.next()) {
                    //Monster n_monster=new Monster();
                    int id = rs.getInt("id");
                    String name = rs.getString("name"); // 자바로 넘어 오면서 String으로 변환
                    int hp = rs.getInt("hp");
                    int ap = rs.getInt("attackpoint");
                    // 결과값 도출 (%s당 id 같은 정보를 출력해줌)
                    System.out.format("%d / %s / %d / %d\n", id, name, hp, ap);
                }
                // 닫아줌
                st.close();
            }
            // 캐치
        } catch (Exception e) { //오류 부분
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}