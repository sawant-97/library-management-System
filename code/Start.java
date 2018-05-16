import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Start extends JFrame implements ActionListener,KeyListener

 {
   JLabel title,title1,title2,line,image;

   JButton admin,exit;

   JPanel p;

   int key;

   String b;

   public Start()

    {

      setLayout(null);

      setTitle("Start");

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      title=new JLabel("WELCOME TO HCMS");

      title.setFont(new Font("arial",Font.BOLD,60));

      title.setForeground(Color.red);

      title.setBounds(200,50,1000,70);

      title1=new JLabel("   MNIT");

      title1.setFont(new Font("arial",Font.BOLD,60));

      title1.setForeground(Color.red);

      title1.setBounds(350,100,500,70);

      title2=new JLabel("    JAIPUR");

      title2.setFont(new Font("arial",Font.BOLD,50));

      title2.setForeground(Color.red);

      title2.setBounds(340,150,500,60);

      line=new JLabel("--------------");

      line.setFont(new Font("arial",Font.BOLD,45));

      line.setForeground(Color.blue);

      line.setBounds(350,200,1000,30);

      getContentPane().add(title);

      getContentPane().add(title1);

      getContentPane().add(title2);

      getContentPane().add(line);

      p=new JPanel();

      p.setLayout(new GridLayout(1,3));

      p.setBounds(330,650,350,30);

      admin=new JButton("Admin");

      admin.setMnemonic(KeyEvent.VK_A);

      admin.setToolTipText("Press it and Enter Password to become Administrator");

      admin.setFont(new Font("arial",Font.BOLD,20));

      admin.addActionListener(this);

      exit=new JButton("Exit");

      exit.setMnemonic(KeyEvent.VK_E);

      exit.setFont(new Font("arial",Font.BOLD,20));

      exit.setToolTipText("Press it to go to Back");

      exit.addActionListener(this);

      p.add(admin);

//      p.add(stud);

      p.add(exit);

      getContentPane().add(p);

      admin.addKeyListener(this);

      exit.addKeyListener(this);

      image=new JLabel(new ImageIcon("mnit.png"));

      image.setBounds(100,230,800,400);

      getContentPane().add(image);

      setSize(1020,1000);

      setVisible(true);
    }

   public void actionPerformed(ActionEvent ae)

    {

      if(ae.getActionCommand().equals("Admin"))

       {

         AdminPwd ap=new AdminPwd(this);

       }

  
      else if(ae.getActionCommand().equals("Exit"))

       {

         dispose();

       }
    }

   public void keyPressed(KeyEvent ke)

    {

      key=ke.getKeyCode();

       if(key==KeyEvent.VK_A)

        {

          AdminPwd ap=new AdminPwd(this);

        }

       

      else if(key==KeyEvent.VK_E)

       {

          dispose();

       }

    }

   public void keyTyped(KeyEvent ke){}

   public void keyReleased(KeyEvent ke){}

   public static void main(String args[])
     {

      Start sf=new Start();

    }

  }








  


