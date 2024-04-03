package Electricity;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BillDetails extends JFrame {
    JTable t1;
    String x[]= {"Meter Number","Month","Units","Total Bill","Status"};
    String y[][]= new String[40][8];
    int i = 0,j=0;

    BillDetails(String meter){
        super("Bill Details");
        setSize(700,650);
        setLocation(600,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        t1 = new JTable(y,x);
        try{
            Conn conn = new Conn();
            String s1 = "select * from bill where meter = "+ meter;
            ResultSet resultSet = conn.statement.executeQuery(s1);
            t1.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        JScrollPane scrollPane = new JScrollPane(t1);
        scrollPane.setBounds(0,0,700,650);
        add(scrollPane);
    }
    public  static  void main(String [] args){
        new BillDetails("").setVisible(true);
    }
}
