package repository;

import character.Human;
import character.Humaninfo;
import config.JdbcConnection;
import domain.InformationDto;
import domain.SignupDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    //여기서 클래스 생성
    public boolean login(String id, String password)  {
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "select * from user_id where username = ? and password = ?";
<<<<<<< HEAD
        String username = null;
        String job = null;
=======
        String name = null;
        String job2 = null;
        Integer id2=null;
>>>>>>> taeyeol
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,id);
            psmt.setString(2,password);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
<<<<<<< HEAD
                username = resultSet.getString("username");
                job = resultSet.getString("job");
                System.out.println(username +" "+job+" 환영해요");
=======
                id2 = resultSet.getInt("id");
                name = resultSet.getString("username");
                job2 = resultSet.getString("job");
                GetJobRepository.getjobList(id2,name,job2);
                System.out.println(name +"님 "+" 환영해요");
                System.out.println("현재 캐릭터는 입니다.");
                // tttt
>>>>>>> taeyeol
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("conn 닫기 실패");;
        }
<<<<<<< HEAD
        return username != null;
=======
        return name != null;
>>>>>>> taeyeol
    }

    public void insertUsers(SignupDto dto) {
        Connection conn = new JdbcConnection().getJdbc();
        String sql ="insert into user_id(username, password, job)\n" +
                "value (?, ?, ?);";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,dto.getUsername());
            psmt.setString(2, dto.getPassword());
            psmt.setString(3, dto.getjob());
            if (psmt.executeUpdate() == 0) {
                System.out.println("insertUsers err");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("conn 닫기 실패");;
        }
    }

}