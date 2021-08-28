package jdbc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class login_page extends JFrame implements ActionListener{
	JLabel login;
	 JLabel username;
	 JLabel password;
	 JTextField user;
	 JPasswordField pass;
    ImageIcon icon;
    JButton submit;
    JLabel temp;
	login_page()
	 {
	     icon=new ImageIcon("lib_logo.png");
         setIconImage(icon.getImage());

         username=new JLabel("Username :");
        password =new JLabel("Password :");
        user=new JTextField();
        pass=new JPasswordField();
        submit=new JButton("SUBMIT");
        login =new JLabel("WELCOME");
        temp=new JLabel("Incorrect Credentials..");

         login.setBounds(100,70,400,100);
         username.setBounds(70,200,200,50);
         password.setBounds(70,300,200,50);
        user.setBounds(70,250,200,30);
        pass.setBounds(70,350,200,30);
        submit.setBounds(150,450,200,50);
        temp.setBounds(20,550,400,30);


        login.setFont(new Font("MV Boli",Font.BOLD,70));
        username.setFont(new Font("Consolas",Font.PLAIN,30));
        password.setFont(new Font("Consolas",Font.PLAIN,30));

         user.setFont(new Font("Courier New",Font.BOLD,25));
         pass.setFont(new Font("Courier New",Font.BOLD,25));
         submit.setFont(new Font("Consolas",Font.PLAIN,30));
         temp.setFont(new Font("Consolas",Font.PLAIN,30));
         temp.setVisible(false);
         submit.addActionListener(this);
         add(username);
         add(password);
        add(login);
         add(user);
         add(pass);
         add(submit);
         add(temp);
         setTitle("Library Management System");
         setSize(800,800);
         setLayout(null);
         getContentPane().setBackground(Color.ORANGE);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         setResizable(false);


     }
	   
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String u="vaibhav";
		String p="1465";
		String u1=user.getText();
		String p1=pass.getText();
		if(u.equals(u1) && p.equals(p1))
        {
            this.dispose();
            new home();
        }
		else
        {
            temp.setVisible(true);
        }

	}

}
