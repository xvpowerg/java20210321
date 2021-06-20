/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_16_jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch13_16 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        DriverManager 產生 Connection
        Connection 產生 Statement
        Statement 產生 ResultSet
        */
        Random r1 = new Random();
        String account = "qwer";
        String password = "12345";
        String url = "jdbc:derby://localhost:1527/myuser";
        try(Connection conn = DriverManager.getConnection(url,account,password);
             Statement stem = conn.createStatement();){
            int count = stem.executeUpdate("INSERT INTO myuser(id,name,score) "
                    + " VALUES("+r1.nextInt(Integer.MAX_VALUE)+",'Vivin',85.6)");     
            System.out.println(count);
            ResultSet  result =  stem.executeQuery("SELECT * FROM myuser");
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString("name");
                float score = result.getFloat(3);
                System.out.println(id+":"+name+":"+score);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
