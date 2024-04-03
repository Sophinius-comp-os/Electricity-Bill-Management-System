package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    JPanel p1,p2,p3,p4;
    Choice choice;

Login(){
    super("Login Page");
    setLayout(null);
    getContentPane().setBackground(Color.white);

    l1= new JLabel("Username");
    l1.setBounds(300,20,100,20);
    add(l1);
    l2= new JLabel("Password");
    l2.setBounds(300,60,100,20);
    add(l2);

    tf1 = new JTextField(15);
    tf1.setBounds(300,60,100,20);
    add(tf1);
    pf2 = new JPasswordField(15);
    pf2.setBounds(400,60,150,20);
    add(pf2);


    l4= new JLabel("Logging in as");
    l4.setBounds(300,100,100,20);
    add(l4);
    choice= new Choice();
    choice.add("ADMIN");
    choice.add("CUSTOMER");
    choice.setBounds(400,100,150,20);
    add(choice);

    ImageIcon imgCon = new ImageIcon( ClassLoader.getSystemResource("icon/login.png"));
    Image image1 = imgCon.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
    b1 = new JButton("Login", new ImageIcon(image1));

    b1.setBounds(330,160,100,20);
    add(b1);
    ImageIcon imgCon2 = new ImageIcon( ClassLoader.getSystemResource("icon/cancel.jpg"));
    Image image2 = imgCon2.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
    b2 = new JButton("Cancel", new ImageIcon(image2));

    b2.setBounds(450,160,100,20);
    add(b2);

    ImageIcon imgCon3 = new ImageIcon( ClassLoader.getSystemResource("icon/signup.png"));
    Image image3 = imgCon3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
    b3 = new JButton("Sign Up", new ImageIcon(image3));

    b3.setBounds(380,200,130,20);
    add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    ImageIcon imgCon4 = new ImageIcon( ClassLoader.getSystemResource("icon/second.jpg"));
    Image image4 = imgCon4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
    ImageIcon icc4 = new ImageIcon(image4);
    l3 = new JLabel(icc4);
    l3.setBounds(0,0,250,250);
    add(l3);

    setLayout(new BorderLayout());


    setSize(640,300);
    setSize(600,300);
    setVisible(true);




}


    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==b1){
        try {
            Conn c = new Conn();
            String a = tf1.getText();
            String b = pf2.getText();
            String user = choice.getSelectedItem();
            String q = "select * from login where username = '"+a+"' and password = '"+b+"' and user ='"+user+"' ";
            ResultSet resultSet = c.statement.executeQuery(q);
            System.out.println(resultSet.getString(0));
            if(resultSet.next()){
                String meter = resultSet.getString("meter_no");
                new Project(meter, user).setVisible(true);
                JOptionPane.showMessageDialog(null,"Login Successful");
                this.setVisible(false);

            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid login");
                tf1.setText("");
                pf2.setText("");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);

        }

    }else if (ae.getSource() == b2){
        this.setVisible(false);
    }else if(ae.getSource() ==b3){
        this.setVisible(false);
      new Signup().setVisible(true);
    }

    }
    public  static  void  main(String [] args){
    new Login().setVisible(true);
    }

}
