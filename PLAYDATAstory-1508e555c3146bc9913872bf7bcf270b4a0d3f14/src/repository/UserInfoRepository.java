package repository;

import Global.Manager;
import character.Human;
import character.Jobclass;
import config.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoRepository {
    public void userInfo(int hp, int attackpoint, String job)  {
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "select * from user_info where hp = ? and attackpoint = ? and job = ?";
        String job2 = null;
        Integer attackpoint2=null;
        Integer hp2=null;
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setInt(1,hp2);
            psmt.setInt(2,attackpoint2);
            psmt.setString(3,job2);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
                hp2 = resultSet.getInt("hp");
                attackpoint2 = resultSet.getInt("attackpoint");
                job2 = resultSet.getString("job");
                //GetJobRepository.getjobList(id2,name,job2);
                Manager.human=new Human(hp2,attackpoint2,job2);
                // tttt
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
