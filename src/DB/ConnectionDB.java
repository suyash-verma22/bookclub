package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    public Connection getConnection(String db_name){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/classicmodels/" + db_name;
            String user = "root";
            String password = "suyash060598";
            con = DriverManager.getConnection(url,user,password);
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
