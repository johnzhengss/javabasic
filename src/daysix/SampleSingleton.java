package daysix;

import java.math.BigDecimal;
import java.sql.*;


public class SampleSingleton {
    private static Connection conn = null;

    private static volatile SampleSingleton instance = null;
    private SampleSingleton(){

    }

    public static SampleSingleton getInstance(){
        if (instance == null){
                instance = new SampleSingleton();
        }
        return instance;
    }

    public Connection getConn(){
        if (conn == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_blog_db","root","xxxxxx");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return conn;
    }

    public static void main(String[] args) {

        try {
            Connection conn = SampleSingleton.getInstance().getConn();
            Connection conn1 = SampleSingleton.getInstance().getConn();
            if (conn == conn1){
                System.out.println("they are equal");
            }else {
                System.out.println("different");
            }
            PreparedStatement statement = conn.prepareStatement("select * from generator_test");
            ResultSet re = statement.executeQuery();
            while (re.next()){
                System.out.println(re.getInt("id") + " : " + re.getString("test"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
