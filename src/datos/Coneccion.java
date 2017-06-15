package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Skylo
 */
public class Coneccion {
    
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    
   
    static String bd="XE";
    static String login="CESFAM";
    static String password="cesfam";
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection Enlace()throws SQLException    {
        try {
            if(conn == null){
                Class.forName("oracle.jdbc.OracleDriver");
                conn=DriverManager.getConnection(url, login, password);
            }
        }
        catch(ClassNotFoundException e )
        {
            System.out.print("Clase no encontrada");
        }
        return conn;
    }
    
    public static Statement sta(Statement st)throws SQLException    {
        conn=Enlace();
        st=conn.createStatement();
        return st;
    }
   

    
}

