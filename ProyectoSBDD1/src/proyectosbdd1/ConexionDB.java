/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosbdd1;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrés
 */
public class ConexionDB {
    
    public Connection conectar(String server){
        Connection cn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://"+server+";integratedSecurity=true");
        }catch(Exception ex){
            System.out.println("error: " +ex);
        }
        return cn;
    }
    
    public Connection conectarBase(String server,String base){
        Connection cn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://"+server+";"
                    + "databaseName="+base+";integratedSecurity=true");
        }catch(Exception ex){
            System.out.println("error: " +ex);
        }
        return cn;
    }
    
}
