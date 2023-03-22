package _U13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TestCopy extends JFrame implements ActionListener {
    JButton b_copy, b_clear, b_exit;
    JLabel jb;
    JPanel pn,ps;
    JTextField jf;
    JTextArea ja;

    public TestCopy(){
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

        jb=new JLabel("请输入信息");
        jf=new JTextField(20);
        pn=new JPanel();
        pn.add(jb);
        pn.add(jf);
        this.add("North",pn);

        ja=new JTextArea(10,40);
        ja.setLineWrap(true);
        add("Center",ja);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Append"){
            StringBuilder bf=new StringBuilder(ja.getText());
            bf.append(jf.getText());
            ja.setText(bf.toString());
        }
        else if(e.getActionCommand()=="Clear"){
            jf.setText("");
            ja.setText("");
        }
        else if(e.getActionCommand()=="Exit"){
            System.exit(0);
        }
    }
}

public class TestPanelCopy {
    public static void main(String[] args) {
        new TestCopy();
    }
}
