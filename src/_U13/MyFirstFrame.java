package _U13;

import javax.swing.*;
import java.awt.*;

public class MyFirstFrame extends JFrame {
    MyFirstFrame(String title){
//        Container container=this.getContentPane();
        JLabel jl=new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
//        container.add(jl);
//        container.setBackground(Color.WHITE);
        this.add(jl);
        this.setBackground(Color.WHITE);
        this.setSize(300,200);
        this.setLocation(200,150);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFirstFrame("创建一个JFrame窗体");
    }
}
