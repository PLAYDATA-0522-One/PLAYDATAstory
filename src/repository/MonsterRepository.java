package repository;

import character.Monster;
import config.JdbcConnection;
import domain.InventoryDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Map.Field.field.Monsters;

public class MonsterRepository {
    public void checkMonster()  {
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
    public void checkAllMonster(){
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


    public void printAllmonster()
    {
        int n=0;
        for(int i=0;i<Monsters.size();i++){
            int at=Monsters.get(n).getAttackpoint();
            int hp = Monsters.get(n).getHp();
            String name = Monsters.get(n).getName();
            System.out.println(name);
            System.out.println(at);
            System.out.println(hp);
            n++;

        }

    }

    public void inputAllmonster(){
        Connection conn = new JdbcConnection().getJdbc();
//        String sql ="insert into user_id(username, password, job)\n" +
//                "value (?, ?, ?);";
        String sql = "select * from monster_list(name,hp,attackpoint)\n" +
                "value(?,?,?); ";

        String sql2 = "select * from monster_list";
        String name = null;
        Integer hp =null;
        Integer attackpoint=null;
        try {
            PreparedStatement psmt = conn.prepareStatement(sql2);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
                name = resultSet.getString("name");
                hp = (Integer) resultSet.getInt("hp");
                attackpoint = (Integer)resultSet.getInt("attackpoint");
                //System.out.println("현재 캐릭터의 위치는" +weapon2+"의"+gold2+"입니다.");
                Monster monster = new Monster(name,hp,attackpoint);
                Monsters.add(monster);
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