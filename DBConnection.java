/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcbyteposfinal;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Haron
 */
public class DBConnection {

    public static Connection connect() {
        try{
            String url = "jdbc:mysql://localhost:3306/pcbyte_db";
            String user = "root";
            String pass = "";
            return DriverManager.getConnection(url, user, pass);
        }catch  (Exception e) {
            System.out.println("Connection Failed:"+ e.getMessage());
            return null;
        }
    }
}