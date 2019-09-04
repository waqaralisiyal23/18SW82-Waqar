import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task2{
    JFrame frame;
    JPanel panel;
    JButton btn;

    public Task2(){
        initComponents();
    }

    public void initComponents(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,600,500);

        Container c = frame.getContentPane();
        c.setLayout(new BorderLayout());

        panel = new JPanel();
        btn = new JButton("Button");

        c.add(panel, BorderLayout.SOUTH);
        panel.add(btn);

        
    }

    public static void main(String[]args)
    {
        new Task2();
    }
}