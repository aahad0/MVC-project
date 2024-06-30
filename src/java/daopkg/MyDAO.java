/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daopkg;
import  java.sql.*;
/**
 *
 * @author abdul
 */
public class MyDAO {
  Connection con=null;
    public Statement toConnect(String driver,String url,String un,String pass) throws ClassNotFoundException,SQLException{
        Class.forName(driver);
        con= DriverManager.getConnection(url,un,pass);
        return con.createStatement();
    }
    public boolean toStore(Statement st,String query) throws SQLException{
        return st.execute(query);
    }
    public ResultSet toFetch(Statement st,String query) throws SQLException{
        return st.executeQuery(query);
    }
}