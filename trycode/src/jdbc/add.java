package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add  extends JFrame implements ActionListener {
    JLabel title,author,subject,head;
    JPanel content, buttons;
    JTextField title1,author1,subject1;
    JButton add1,add_m,back;
    add()
    {
        setComponents();
        setTitle("ADD BOOK");
        setSize(800, 800);
        setLayout(null);

        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }
    void setComponents()
    {
        title=new JLabel("Title");
        author=new JLabel("Author");
        subject=new JLabel("Subject");
        title1=new JTextField();
        author1=new JTextField();
        subject1=new JTextField();
        head=new JLabel("New Book");
        add1=new JButton("Add");
        add_m=new JButton("Add More");
        back=new JButton("Back");

        head.setBounds(200,70,400,70);
        head.setFont(new Font("MV Boli",Font.BOLD,40));
        head.setForeground(Color.BLACK);

        title.setFont(new Font("Courier New",Font.BOLD,35));
        author.setFont(new Font("Courier New",Font.BOLD,35));
        subject.setFont(new Font("Courier New",Font.BOLD,35));
        title1.setFont(new Font("Courier New",Font.BOLD,25));
        author1.setFont(new Font("Courier New",Font.BOLD,25));
        subject1.setFont(new Font("Courier New",Font.BOLD,25));

        add1.setFont(new Font("Courier New",Font.BOLD,35));
        add_m.setFont(new Font("Courier New",Font.BOLD,25));
        back.setFont(new Font("Courier New",Font.BOLD,35));

        content=new JPanel();
        content.setBackground(Color.cyan);
        content.setBounds(100,200,500,250);
        content.setLayout(new GridLayout(3,2,0,70));
        content.add(title);
        content.add(title1);
        content.add(author);
        content.add(author1);
        content.add(subject);
        content.add(subject1);

        add(head);
        add(content);
        buttons=new JPanel();
        buttons.setBounds(100,600,600,50);
        buttons.setLayout(new GridLayout(1,3,30,0));
        buttons.setBackground(Color.cyan);
        buttons.add(add1);
        buttons.add(add_m);
        buttons.add(back);
        add(buttons);

        add1.addActionListener(this);
        add_m.addActionListener(this);
        back.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back)
        {
            this.dispose();
            new home();
        }
        else if(e.getSource()==add_m)
        {
            this.dispose();
            new add();
        }
        else
        {
            System.out.println("inserted");
            String t=title1.getText();
            String a=author1.getText();
            String s=subject1.getText();
        }

    }
}
