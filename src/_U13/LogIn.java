package _U13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainWindow extends JFrame implements ActionListener {
    JButton b_copy, b_clear, b_exit;
    JLabel jb1, jb2;
    JPanel pn1, pn2, ps;
    JTextField jf1, jf2;
    JTextArea ja;

    public MainWindow(){
        this.setTitle("TestCopy");
        this.setSize(400,300);
        this.setLocation(100,100);
        this.setLayout(new BorderLayout());
        b_copy=new JButton("Append");
        b_clear=new JButton("Clear");
        b_exit=new JButton("Exit");
        b_copy.addActionListener(this);
        b_clear.addActionListener(this);
        b_exit.addActionListener(this);

        ps=new JPanel();
        ps.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        ps.add(b_copy);
        ps.add(b_clear);
        ps.add(b_exit);
        this.add(BorderLayout.SOUTH,ps);

        jb1=new JLabel("账号：", JLabel.RIGHT);
        jf1=new JTextField(20);
        pn1=new JPanel();
        pn1.add(jb1);
        pn1.add(jf1);
        this.add("North",pn1);

        jb2=new JLabel("密码：");
        jf2=new JTextField(20);
        pn2=new JPanel();
        pn2.add(jb2);
        pn2.add(jf2);
        this.add("South",pn2);

        ja=new JTextArea(10,40);
        ja.setLineWrap(true);
        add("Center",ja);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Append"){
            StringBuilder bf=new StringBuilder(ja.getText());
            bf.append(jf1.getText());
            ja.setText(bf.toString());
        }
        else if(e.getActionCommand()=="Clear"){
            jf1.setText("");
            ja.setText("");
        }
        else if(e.getActionCommand()=="Exit"){
            System.exit(0);
        }
    }
}

public class LogIn {
    public static void main(String[] args) {
        new MainWindow();
    }
}
