/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis David
 */
public class Conexion {

    public static final String url = "jdbc:mysql://127.0.0.1:3306/test?useTimezone=true&serverTimezone=UTC";
    public static final String usuario = "root";
    public static final String contrasena = "";

    public static Connection getConnection() {
        Connection conexion = null;

        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion =(Connection) DriverManager.getConnection(url, usuario, contrasena);
           System.out.println("Conexion exitosa");
           
           
      
        } catch (Exception ex)
        {
            
            System.err.println("error al hacer la conexion: "+ex);
        }
        return conexion;
    }
    
    public static ResultSet getTabla(String consulta){
        Connection cn= getConnection();
        Statement st;
        ResultSet datos=null;
        
        try{
        st=cn.createStatement();
        datos=st.executeQuery(consulta);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return datos;
    }
}