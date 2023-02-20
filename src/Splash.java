import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {  //Jframe class used to make frames
    Thread t;
    Splash(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);//jlabel donot take object of Image class so we have to pass the object of Image class in Imageicon
        add(image);
        setVisible(true);
        t=new Thread(this);
        t.start();
        int x=1;
     for (int i=2;i<=600;i+=4,x++) {

         setLocation(600-((i+x)/2), 350-(i/2));
         setSize(i+3*x, i+x/2);

         try{
             Thread.sleep(10);
         }catch (Exception e){}

     }
    }
    public static void main(String[] args) {
      new Splash();
    }

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch (Exception e){}

    }
}