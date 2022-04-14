package vista;

import java.sql.*;
public class conectar {

 Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/personas","root","");
            System.out.print("se ha conectado");
            
        } catch (Exception e) {
            System.out.print("Error: "+e.getMessage());
        }
        return conectar;
    }    
}
