package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Project extends JFrame implements ActionListener {
    String meter;
    Project(String meter, String person){

        super("Electricity Billing System");
        this.meter = meter;
        setSize(1920,1030);
//        Background Image
        ImageIcon imageIcon = new ImageIcon( ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image image3 = imageIcon.getImage().getScaledInstance(1900,950, Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon( image3);
        JLabel  label1 = new JLabel(imageIcon3);
        add(label1);
//        Column one
        JMenuBar menuBar = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem item1 = new JMenuItem("New Customer");
        JMenuItem item2 = new JMenuItem("Customer Details");
        JMenuItem item3 = new JMenuItem("Debit  Details");
        JMenuItem item4 = new JMenuItem("Calculate Bill");
        master.setForeground(Color.BLUE);
//        Details of the customer
        item1.setFont(new Font("monospaced", Font.PLAIN,12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        item1.setIcon(new ImageIcon(image1));

        item1.setMnemonic('D');
        item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        item1.setBackground(Color.white);

//        Meter Information

        item2.setFont(new Font("monspaced", Font.PLAIN,12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
item2.setIcon(new ImageIcon(image2));
item2.setMnemonic('M');
item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
item2.setBackground(Color.white);
//Deposit information
        item3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image im3 = icon3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        item3.setIcon(new ImageIcon(im3));
        item3.setMnemonic('N');
        item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        item3.setBackground(Color.white);
//        Bill Info

        item4.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image im4 = icon4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        item4.setIcon(new ImageIcon(im3));
        item4.setMnemonic('B');
        item4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        item4.setBackground(Color.white);

item1.addActionListener(this);
item2.addActionListener(this);
item3.addActionListener(this);
item4.addActionListener(this);


//Column 2

        JMenu info = new JMenu("Information");
        JMenuItem info1 = new JMenuItem("Update Information");
        JMenuItem info2 = new JMenuItem("View Information");

        info.setForeground(Color.red);

//        Bill Payments
        info1.setFont(new Font("monospaced", Font.PLAIN,12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5 = icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        info1.setIcon(new ImageIcon(image5));
        info1.setMnemonic('P');
        info1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        info1.setBackground(Color.white);

//        Previous Bill
        info2.setFont(new Font("monspaced",Font.PLAIN,12));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        info2.setIcon(new ImageIcon(image6));
        info2.setMnemonic('L');
        info1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        info2.setBackground(Color.white);

        info1.addActionListener(this);
        info2.addActionListener(this);
//Column 2
        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay Bill");

        JMenuItem u3 = new JMenuItem("Bill Details");
        user.setForeground(Color.RED);

        /* ---- Pay Bill ---- */
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon41 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image41 = icon41.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image41));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);

        /* ---- Last Bill ----*/
        u3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon61 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image61 = icon61.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image61));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);

        u1.addActionListener(this);
        u3.addActionListener(this);

//        Column 3
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.BLUE);

        /* ---- Report ---- */
        r1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);

        r1.addActionListener(this);
//        Fourth Column
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);
//        Calendar
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
//        Calculator

        ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
//Web Browser
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);


        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
//        Column Five
        JMenu exit = new JMenu("Logout");
        JMenuItem ex = new JMenuItem("Logout");
        exit.setForeground(Color.BLUE);
//        Exit
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);
        master.add(item1);
        master.add(item2);
        master.add(item3);
        master.add(item4);

        info.add(info1);
        info.add(info2);

        user.add(u1);
        user.add(u3);

        report.add(r1);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        exit.add(ex);
        if(person.equals("Admin")){
            menuBar.add(master);
        }else{
            menuBar.add(info);
            menuBar.add(user);
            menuBar.add(report);
        }
        menuBar.add(utility);
        menuBar.add(exit);

        setJMenuBar(menuBar);

        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public  void  actionPerformed(ActionEvent actionEvent){
        String message = actionEvent.getActionCommand();
        if(message.equals("Customer Details"))
        {
//            new CustomerDetails().setVisible(true);
            System.out.println("Customer Details");
        }
        else if(message.equals("New Customer")){
//            new NewCustomer.setVisible(true);

            System.out.println("New Customer");
        }
        else  if(message.equals("Calculate Bill")){

            System.out.println("Calculate bill");
//            new CalculateBill().setVisible()
        }
        else if(message.equals("Pay Bill")){
//            new PayBill(meter).setVisible(true);

        }else if(message.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(message.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }else if(message.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
            }catch(Exception e){ }
        }else if(message.equals("Logout")){
            this.setVisible(false);
            new Login().setVisible(true);
        }else if(message.equals("Generate Bill")){
//            new GenerateBill(meter).setVisible(true);

        }else if(message.equals("Deposit Details")){
//            new DepositDetails().setVisible(true);
        }else if(message.equals("View Information")){
//            new ViewInformation(meter).setVisible(true);
        }else if(message.equals("Update Information")){
//            new UpdateInformation(meter).setVisible(true);
        }else if(message.equals("Bill Details")){
            new BillDetails(meter).setVisible(true);
        }

    }
    public static void main(String[] args){
        new Project("", "").setVisible(true);
    }

}
