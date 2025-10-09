package jdbcprograms.dao;

import java.sql.*;

public class DBUtli {

    private static Connection con;
    private static final String Driver="com.mysql.cj.jdbc.Driver";
    private static final String USERNAME="root";
    private static final String PASSWORD="Shravya_184_";
    private static final String URL="jdbc:mysql://localhost:3306/teegala";

    public static Connection getConnection()
    {
        try {
            Class.forName(Driver);
            System.out.println("Driver loaded Sucessfully");
            
            con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
}