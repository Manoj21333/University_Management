import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {//actonlister interface is used when we need an action on any click or event
    JButton login,cancel;//globally declared
    JTextField jfusername,jfpassword;
    Login(){
        getContentPane().setBackground(Color.white);//it will set the background colour
        setLayout(null);//will set the layout null we can set it manually now
        JLabel usname=new JLabel("USERNAME");
        usname.setBounds(40,40,100,20);
        add(usname);

        jfusername=new JTextField();//to get the input
        jfusername.setBounds(150,40,150,20);
        add(jfusername);

        JLabel password=new JLabel("PASSWORD");
        password.setBounds(40,100,100,20);
        add(password);

        jfpassword=new JPasswordField();
        jfpassword.setBounds(150,100,150,20);
        add(jfpassword);

        login =new JButton("LOGIN");
        login.setBounds(40,160,100,30);
        login.setBackground(Color.BLACK );
        login.setForeground(Color.white);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma",Font.BOLD,13));
        add(login);

        cancel =new JButton("CANCEL");
        cancel.setBounds(180,160,100,30);
        cancel.setBackground(Color.BLACK );
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);//it will recognise the click of cancel button
        cancel.setFont(new Font("Tahoma",Font.BOLD,13));
        add(cancel);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);//jlabel donot take object of Image class so we have to pass the object of Image class in Imageicon
        image.setBounds(350,0,200,200);
        add(image);

        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {//it is called when addactionlistener is called
        if (ae.getSource()==login){
            String username=jfusername.getText();
            String password=jfpassword.getText();

            String query="select * from login where username ='"+username+"' and password ='"+password+"'";
            try{
                JdbcConnectivity jdbc=new JdbcConnectivity();
                  ResultSet resultSet =jdbc.s.executeQuery(query);//execution mysql query 4th step

                  if (resultSet.next()){
                      setVisible(false);
                      new Project();
                  } else {
                      JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                  }
                  jdbc.s.close();//5th close the cconnections
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()==cancel){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }



}
