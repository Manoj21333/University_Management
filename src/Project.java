import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    Project(){
        setSize(1540,850);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1500,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);//jlabel donot take object of Image class so we have to pass the object of Image class in Imageicon
        add(image);
        JMenuBar menuBar=new JMenuBar();//to create menubar

//information
        JMenu information=new JMenu("Information");//to create menu
        information.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(information);

        JMenuItem facultyinfo=new JMenuItem("Faculty Information");//to create the menu items inside the menu
     //   facultyinfo.setForeground(Color.white);
        facultyinfo.addActionListener(this);
        information.add(facultyinfo);
        JMenuItem studentinfo=new JMenuItem("Student Information");
        studentinfo.addActionListener(this);
        information.add(studentinfo);

        //details
        JMenu details=new JMenu("View Details");//to create menu
        details.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(details);

        JMenuItem facultydetails=new JMenuItem("View Faculty Details");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        details.add(facultydetails);
        JMenuItem studentdetais=new JMenuItem("View Student Details");
        details.add(studentdetais);

        // Leave
        JMenu leave=new JMenu("Apply Leave");//to create menu
        leave.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(leave);

        JMenuItem facultyleave=new JMenuItem(" Faculty Leave");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        leave.add(facultyleave);
        JMenuItem studentleave=new JMenuItem(" Student Leave");
        leave.add(studentleave);
        //leave details
        JMenu leavedetails=new JMenu("View Leave Details");//to create menu
        leavedetails.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(leavedetails);

        JMenuItem facultyleavedetails=new JMenuItem(" Faculty Leave details");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        leavedetails.add(facultyleavedetails);
        JMenuItem studentleavedetails=new JMenuItem(" Student Leave Details");
        leavedetails.add(studentleavedetails);

        //examination
        JMenu exam=new JMenu("Examination");//to create menu
        exam.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(exam);

        JMenuItem result=new JMenuItem(" Result");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        exam.add(result);
        JMenuItem marks=new JMenuItem("  Enter marks");
        exam.add(marks);

        //updateinformation
        JMenu updateinfo=new JMenu("Update Details");//to create menu
        updateinfo.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(updateinfo);

        JMenuItem updatefacultyinfo=new JMenuItem(" Update Faculty Details");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        updateinfo.add(updatefacultyinfo);
        JMenuItem updatestudentinfo=new JMenuItem(" Update Student Details");
        updateinfo.add(updatestudentinfo);

        //fee detais
        JMenu fee=new JMenu("Fees Details");//to create menu
        fee.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(fee);

        JMenuItem feestructure=new JMenuItem(" Fee Structure ");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        fee.add(feestructure);
        JMenuItem feeform=new JMenuItem(" Student Fee Form");
        fee.add(feeform);

        //utility
        JMenu utility=new JMenu("Utiity");//to create menu
        utility.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(utility);

        JMenuItem notepad=new JMenuItem("Notepad");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        notepad.addActionListener(this);
     utility.add(notepad);
        JMenuItem calc=new JMenuItem("Calculator");
        calc.addActionListener(this);
        utility.add(calc);

//exit
        JMenu exit=new JMenu("Exit");//to create menu
        exit.setForeground(Color.BLUE);//to set the color of menu
        menuBar.add(exit);

        JMenuItem ex=new JMenuItem("Exit");//to create the menu items inside the menu
        //   facultyinfo.setForeground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(menuBar);//to set the menubar frame
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {

        String m=e.getActionCommand();
        if (m.equals("Exit")) {
            setVisible(false);
        } else if (m.equals("Calculator")){
            try {
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception a){}

        }
        else if (m.equals("Notepad")){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception a){}

        } else if (m.equals("Faculty Information")) {
            new Addfaculties();
        } else if (m.equals("Student Information")) {
            new AddStudents();
        }
    }
    public static void main(String[] args) {

        new Project();
    }




}
