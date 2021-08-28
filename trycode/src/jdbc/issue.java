package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class issue extends  JFrame implements ActionListener {
    JLabel head,id_l;
    JTextField id;
    JButton submit,back;
    issue() {
        setComponents();
        issueBook();
        setTitle("Issue Book");
        setSize(500, 500);
        setLayout(null);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    void setComponents() {
        head=new JLabel("Book Issue");
        id_l=new JLabel("Enter Book_id :");
        id=new JTextField();
        submit=new JButton("Submit");
        back=new JButton("Back");

        head.setFont(new Font("Courier New",Font.BOLD,40));
        head.setForeground(Color.blue);
        id_l.setFont(new Font("Courier New",Font.BOLD,27));
        id.setFont(new Font("Courier New",Font.BOLD,25));
        submit.setFont(new Font("Courier New",Font.BOLD,25));
        back.setFont(new Font("Courier New",Font.BOLD,25));

        head.setBounds(130,50,400,50);
        id_l.setBounds(50,150,250,50);
        id.setBounds(310,150,100,50);
        submit.setBounds(50,300,200,50);
        back.setBounds(300,300,100,50);

        add(head);
        add(id_l);
        add(id);
        add(submit);
        add(back);

        submit.addActionListener(this);
        back.addActionListener(this);

    }

    void issueBook() {
     String i=id.getText();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==submit)
      {
          issueBook();
      }
      else {
          con.close();
          this.dispose();
      }

    }
}
