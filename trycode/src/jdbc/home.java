package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class home extends JFrame implements ActionListener {
    JLabel head;
    JButton add;
    JButton view;
    JButton isue;
    JButton v_isue;
    JButton r_book;
    JButton Logout;
    JPanel Buttons;
    home() {
        setComponents();

        setTitle("Hello, Vaibhav");
        setSize(800, 800);
        setLayout(null);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);


    }
    void setComponents()
    {
        head=new JLabel("Library Database");
        head.setFont(new Font("MV Boli",Font.BOLD,40));
        head.setForeground(Color.blue);
        head.setBounds(250,40,400,50);
        add=new JButton("Add Books");
        view=new JButton("View Books");
        isue=new JButton("Issue Books");
        v_isue=new JButton("View Issued Books");
        r_book=new JButton("Return Book");
        Logout=new JButton("Logout");
        Buttons =new JPanel();

        Buttons.setBounds(100,120,600,600);
        Buttons.setLayout(new GridLayout(6,1,0,20));
       Buttons.setBackground(Color.cyan);

       add.setFont(new Font("Comic Sans",Font.BOLD,25));
       view.setFont(new Font("Comic Sans",Font.BOLD,25));
       isue.setFont(new Font("Comic Sans",Font.BOLD,25));
       v_isue.setFont(new Font("Comic Sans",Font.BOLD,25));
       r_book.setFont(new Font("Comic Sans",Font.BOLD,25));
       Logout.setFont(new Font("Comic Sans",Font.BOLD,25));
       view.addActionListener(this);
       add.addActionListener(this);
       Logout.addActionListener(this);




        add(Buttons);
        add(head);
        Buttons.add(add);
        Buttons.add(view);
        Buttons.add(isue);
        Buttons.add(v_isue);
        Buttons.add(r_book);
        Buttons.add(Logout);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Logout)
        {
            this.dispose();
            new login_page();
        }
        else if(e.getSource()==add)
        {
            this.dispose();
            new add();
        }
    }
}
