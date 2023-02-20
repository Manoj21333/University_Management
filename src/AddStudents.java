import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class AddStudents extends JFrame implements ActionListener {
    JTextField tfname, tffathername,tfaddress,tfphoneno,tfemail,tfclassX,tfxii,tfadhaar;//for input fields
    JLabel jlrollno;
    JDateChooser jdob;//for calender date
    JComboBox cbcourse,cbbranch;//this class is used fot dropdown
    JButton submit,cancel;
    Random random = new Random();//for random numbers
    long num = Math.abs(random.nextLong() % 9000L) + 1000L;

    AddStudents() {
        setSize(900, 700);
        setLocation(200, 25);

        setLayout(null);
//heading
        JLabel heading = new JLabel("Student Details");
        heading.setBounds(300, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        //name
        JLabel name = new JLabel("Name");
        name.setBounds(70, 150, 100, 30);
        name.setFont(new Font("serif", Font.BOLD, 20));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        JLabel fathername = new JLabel("Father's Name");
        fathername.setBounds(400, 150, 200, 30);
        fathername.setFont(new Font("serif", Font.BOLD, 20));
        add(fathername);

        tffathername = new JTextField();
        tffathername.setBounds(600, 150, 150, 30);
        add(tffathername);


        JLabel rollno = new JLabel("Roll No");
        rollno.setBounds(70, 200, 100, 30);
        rollno.setFont(new Font("serif", Font.BOLD, 20));
        add(rollno);


        jlrollno = new JLabel("1583" + num);
        jlrollno.setBounds(200, 200, 100, 30);

        jlrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(jlrollno);


        JLabel jlDob=new JLabel("Date Of Birth");
        jlDob.setBounds(400,200,200,30);
        jlDob.setFont(new Font("serif",Font.BOLD,20));
        add(jlDob);

        jdob=new JDateChooser();
        jdob.setBounds(600,200,150,30);
        add(jdob);

        JLabel lbaddress = new JLabel("Address");
        lbaddress.setBounds(70, 250, 100, 30);
        lbaddress.setFont(new Font("serif", Font.BOLD, 20));
        add(lbaddress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel lbphone = new JLabel("Phone No");
        lbphone.setBounds(400, 250, 200, 30);
        lbphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lbphone);

        tfphoneno = new JTextField();
        tfphoneno.setBounds(600, 250, 150, 30);
        add(tfphoneno);

        JLabel lbemail = new JLabel("Email Id");
        lbemail.setBounds(70, 300, 100, 30);
        lbemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lbemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel lbclassX = new JLabel("Class X %");
        lbclassX.setBounds(400, 300, 200, 30);
        lbclassX.setFont(new Font("serif", Font.BOLD, 20));
        add(lbclassX);

        tfclassX = new JTextField();
        tfclassX.setBounds(600, 300, 150, 30);
        add(tfclassX);

        JLabel lbxii = new JLabel("Class XII %");
        lbxii.setBounds(70, 350, 100, 30);
        lbxii.setFont(new Font("serif", Font.BOLD, 20));
        add(lbxii);

        tfxii = new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);

        JLabel ldadhaar = new JLabel("Adhaar No");
        ldadhaar.setBounds(400, 350, 200, 30);
        ldadhaar.setFont(new Font("serif", Font.BOLD, 20));
        add(ldadhaar);

        tfadhaar = new JTextField();
        tfadhaar.setBounds(600, 350, 150, 30);
        add(tfadhaar);

        JLabel lbcourse = new JLabel("Course");
        lbcourse.setBounds(70, 400, 100, 30);
        lbcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(lbcourse);

        String course[]={"B.Tech","B.sc","M.sc","M.Tech","B.A","M.A","B.Com","M.Com"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200, 400, 150, 30);
        add(cbcourse);

        JLabel lbbranch = new JLabel("Branch ");
        lbbranch.setBounds(400, 400, 200, 30);
        lbbranch.setFont(new Font("serif", Font.BOLD, 20));
        add(lbbranch);

        String branch[]={"Mechanical","Computer Science","IT","Electrical","Civil","Electronics","Physics","Chemistry"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600, 400, 150, 30);
        add(cbbranch);

        submit=new JButton("Submit");
        submit.setBounds(70,500,100,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,13));
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(250,500,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,13));
        add(cancel);




        setVisible(true);

    }


    public static void main(String[] args) {

        new AddStudents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name=tfname.getText();
            String fname=tffathername.getText();
            String rollno=jlrollno.getText();
            String dob=((JTextField)jdob.getDateEditor().getUiComponent()).getText();
            String address=tfaddress.getText();
            String phone=tfphoneno.getText();
            String emailid=tfemail.getText();
            String classx=tfclassX.getText();
            String classxii=tfxii.getText();
            String adhaar=tfadhaar.getText();
            String course=(String) cbcourse.getSelectedItem();
            String branch=(String) cbbranch.getSelectedItem();

            try{
                String query ="insert into students values ('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+emailid+"','"+classx+"', '"+classxii+"', '"+adhaar+"', '"+course+"', '"+branch+"')";

                JdbcConnectivity c=new JdbcConnectivity();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"student details submitted sucessfully");
                setVisible(false);

            }catch (Exception ae){
                ae.printStackTrace();
            }

        }
    }
}
