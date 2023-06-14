package repository;

import Global.Manager;
import character.Human;
import config.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoRepository {
    public void userInfo(String name)  {
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "select * from user_info where name = ?";
        String name2 = null;

        try {
            int hp=0;
            int attackpoint = 0;
            String job = null;
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,name);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
                hp = resultSet.getInt("hp");
                attackpoint = resultSet.getInt("attackpoint");
                job = resultSet.getString("job");
                //GetJobRepository.getjobList(id2,name,job2);
                // tttt
            }
            Manager.human = new Human(hp,attackpoint,job);
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