package _U13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ExampleFrame_05 extends JFrame {
    public ExampleFrame_05() {
        this.setTitle("创建菜单栏");
        this.setBounds(100,100,500,375);
        JMenuBar menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu menu=new JMenu("菜单名称");
        menu.setMnemonic('F');
        menuBar.add(menu);

        JMenuItem item=new JMenuItem("菜单项名称");
        item.addActionListener(new ItemListener());
        menu.add(item);

        JMenu menu2=new JMenu("菜单名称2");
        menuBar.add(menu2);
        JMenuItem item2=new JMenuItem("菜单项名称2");
        item2.addActionListener(new ItemListener());
        menu.add(item2);

        JMenu sonMenu=new JMenu("子菜单名称");
        menu.add(sonMenu);
        JMenuItem sonItem=new JMenuItem("子菜单项名称");
        sonItem.addActionListener(new ItemListener());
        sonMenu.add(sonItem);

        menu.addSeparator();
        JMenuItem exit=new JMenuItem("退出");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(exit);
        this.setVisible(true);
    }
    private class ItemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem item=(JMenuItem)e.getSource();
            System.out.println("您单击的菜单项是"+item.getText());
        }
    }

    public static void main(String[] args) {
        new ExampleFrame_05();
    }
}
