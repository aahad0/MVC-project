/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import daopkg.MyDAO;
import java.sql.*;
/**
 *
 * @author abdul
 */
public class MyClass {
    public static void main(String[] args){
        try{
           String driver="com.mysql.cj.jdbc.Driver";
           String url="jdbc:mysql://localhost:3306/mydb";
           String un="root";
           String pass="Ahad1@local";
           int id=4;
           String name="Zaheer Abbas";
           int age=34;
           MyDAO dao=new MyDAO();
           Statement s=dao.toConnect(driver,url,un,pass);
           String query="INSERT INTO employees(emp_id,emp_full_name,emp_age)VALUES ('"+id+"','"+name+"','"+age+"')";
           dao.toStore(s,query);
        }catch(ClassNotFoundException | SQLException sqle){
            sqle.printStackTrace();
        } 
    }
}