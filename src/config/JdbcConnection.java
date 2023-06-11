package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private final String url = "jdbc:mysql://localhost:3306/test2" + "?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    // 시간 맞춰주고, 유니코드 맞춰준다.
    private final String root= "root"; // root 가 유저에게 권한을 부여해야함. 그래야 사용할 수 있음. 자세한것은 sql 참고.
    private final String password = "1q2w3e4r";

    public Connection getJdbc() {
        Connection conn;
        try {
            conn = DriverManager.getConnection(url,root,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
