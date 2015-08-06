package my.singleton.jdbc;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url ="your database url";
        String username = "your database username";
        String password = "your database password";
        Connection conn = UniqueConnection.createUniqueConnection(url, username, password);

        try {
            Statement stmt = conn.createStatement();

            String query = "SELECT barcode, title FROM eval_book";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("barcode") + " || " + rs.getString("title"));
            }

            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            System.out.println("fail");
        }

        UniqueConnection.closeConnection();
    }
}
