/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.online;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class koneksi {
    
    private static Connection koneksi;
    private static Statement st;
    
    
    public static Connection GetConnection()throws SQLException{
        if (koneksi==null){
            new Driver();
            
            koneksi=DriverManager.getConnection("jdbc:MySql://localhost:parkir online","root","");
                    
        }
        return koneksi;
    }

    static void setModel(DefaultTableModel tabmode) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
        

    void config() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
