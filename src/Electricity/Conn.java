package Electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;
    public  Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            Name of database and password
            connection= DriverManager.getConnection("jdbc:mysql:///ebs","root","root");
            statement= connection.createStatement();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
