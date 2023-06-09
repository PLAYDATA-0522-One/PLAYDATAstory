package repository;

import config.JdbcConnection;
import domain.SignupDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    public boolean login(String id, String password)  {
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "select * from user_id where username = ? and password = ?";
        String username = null;
        String job = null;
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,id);
            psmt.setString(2,password);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
                username = resultSet.getString("username");
                job = resultSet.getString("job");
                System.out.println(username +" "+job+" 환영해요");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("conn 닫기 실패");;
        }
        return username != null;
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
