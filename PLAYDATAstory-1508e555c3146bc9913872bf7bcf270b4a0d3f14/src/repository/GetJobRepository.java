package repository;

import character.Humaninfo;
import config.JdbcConnection;
import domain.InformationDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Map.Field.field.Humaninfoes;
import static Map.Field.field.Monsters;

public class GetJobRepository {
    public static boolean getjobList(int id, String name, String job)  {
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "select * from job_info where job = ?";
        String username = null;
        String job2 = null;
        Integer hp =null;
        Integer attackpoint = null;
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,job);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
                hp = resultSet.getInt("hp");
                attackpoint = resultSet.getInt("attackpoint");
                System.out.println(hp);
                System.out.println(attackpoint);
                InformationDto dto = new InformationDto(hp,attackpoint,id,name,job);
                insertUserInfo(dto);
                Humaninfo humaninfo = new Humaninfo(id,job,name,hp,attackpoint);
                Humaninfoes.add(humaninfo);
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
    public static void insertUserInfo(InformationDto dto) {
        Connection conn = new JdbcConnection().getJdbc();
        String sql ="insert into user_info(id,name,job,hp,attackpoint)\n" +
                "value (?, ?, ?,?,?);";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setInt(1,dto.getId());
            psmt.setInt(5,dto.getAttackpoint());
            psmt.setInt(4,dto.getHp());
            psmt.setString(2,dto.getName());
            psmt.setString(3,dto.getJob());
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
