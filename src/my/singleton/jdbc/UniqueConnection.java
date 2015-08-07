package my.singleton.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UniqueConnection {

    private static Connection connection = null;

    private UniqueConnection(String url, String username, String password) {
        try {
            driverLoader();
            String jdbcUrl = urlChecker(url);
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        }
        catch (SQLException e) {
            System.out.println("연결에 실패하였습니다.");
        }
    }

    public static Connection createUniqueConnection(String url, String username, String password) {
        if (connection == null) {
            new UniqueConnection(url, username, password);
        }
        else {
            System.out.println("이미 생성되어 있습니다.");
        }
        return connection;
    }

    private void driverLoader() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("jdbc 드라이버 로드에 실패하였습니다.");
        }
    }

    private String urlChecker(String url) {
        String host = "jdbc:mysql://";
        String fixedUrl;
        if (!url.contains(host)) {
            fixedUrl = host + url;
        }
        else {
            fixedUrl = url;
        }
        return fixedUrl;
    }

    public static void closeConnection() {
        try {
            connection.close();
            connection = null;
        }
        catch (SQLException e) {
            System.out.println("닫는데 문제가 발생하였습니다.");
        }
        catch (NullPointerException e) {
            System.out.println("커넥션이 없습니다.");
        }
    }
}
