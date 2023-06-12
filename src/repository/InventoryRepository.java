package repository;

import config.JdbcConnection;
import domain.ConditonDto;
import domain.InventoryDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventoryRepository {
    public void checkUserInventory()  {
        Connection conn = new JdbcConnection().getJdbc();
        // 계정에 따라서 확인 후 보여줌, 시간 가장 최근
        String sql = "select * from user_inventory where id=?";
        String weapon = null;
        Integer gold =null;
        Integer x=null;
        Integer y=null;
        String map_name = null;
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
                //weapon2 = resultSet.getString("weapon");
                //gold2 = resultSet.getInt("gold");
                //System.out.println("현재 캐릭터의 위치는" +weapon2+"의"+gold2+"입니다.");
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
    public void changeUserInventory(InventoryDto dto) {
        Connection conn = new JdbcConnection().getJdbc();
//        String sql ="insert into user_id(username, password, job)\n" +
//                "value (?, ?, ?);";
        String sql = "select * from user_condition where map_x = ? and map_y = ? and map_name = ?";
        //변경
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            //psmt.setString(1,dto.getX());
            //psmt.setString(2, dto.getY());
            //psmt.setString(3, dto.getMap_name());
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