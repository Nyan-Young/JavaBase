package _U13;

import javax.swing.*;
import java.awt.*;

public class AbsolutePosition extends JFrame {
    AbsolutePosition(){
        this.setTitle("本窗体使用绝对布局");
        this.setLayout(null);
        this.setBounds(150,200,300,150);
        Container container=this.getContentPane();
        JButton b1=new JButton("按钮1");
        JButton b2=new JButton("按钮2");
        b1.setBounds(10,30,80,30);
        b2.setBounds(100,30,80,30);
        container.add(b1);
        container.add(b2);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
