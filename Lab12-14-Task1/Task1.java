import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task1{
    JFrame frame;
    JLabel lblName;
    JLabel lblGender;
    JLabel lblFName;
    JLabel lblPass;
    JLabel lblConfirmPass;
    JLabel lblCity;
    JLabel lblEmail;
    JTextField txtName;
    JComboBox cBox;
    JTextField txtFName;
    JPasswordField pass;
    JPasswordField confirmPass;
    JTextField txtCity;
    JTextField txtEmail;
    JButton btnRegister;
    JButton btnReset;


    public Task1(){
        initComponents();
    }

    public void initComponents(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,650,530);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        lblName = new JLabel("Name");
        lblGender = new JLabel("Gender");
        lblFName = new JLabel("Father Name");
        lblPass = new JLabel("Password");
        lblConfirmPass = new JLabel("Confirm Password");
        lblCity = new JLabel("City");
        lblEmail = new JLabel("E-mail");
        txtName = new JTextField();
        String []s = {"--Select--","Male","Female"};
        cBox = new JComboBox(s);
        txtFName = new JTextField();
        pass = new JPasswordField();
        confirmPass = new JPasswordField();
        txtCity = new JTextField();
        txtEmail = new JTextField();
        btnRegister = new JButton("Register");
        btnReset = new JButton("Reset");

        Font f1 = new Font("Arial",Font.PLAIN,20); 
        
        lblName.setBounds(70,50,150,30);
        lblName.setFont(f1);

        lblGender.setBounds(70,100,150,30);
        lblGender.setFont(f1);

        lblFName.setBounds(70,150,150,30);
        lblFName.setFont(f1);

        lblPass.setBounds(70,200,150,30);
        lblPass.setFont(f1);

        lblConfirmPass.setBounds(70,250,170,30);
        lblConfirmPass.setFont(f1);

        lblCity.setBounds(70,300,150,30);
        lblCity.setFont(f1);

        lblEmail.setBounds(70,350,150,30);
        lblEmail.setFont(f1);

        txtName.setBounds(280,50,300,30);
        txtName.setFont(f1);

        cBox.setBounds(280,100,300,30);
        cBox.setFont(f1);

        txtFName.setBounds(280,150,300,30);
        txtFName.setFont(f1);

        pass.setBounds(280,200,300,30);
        pass.setFont(f1);

        confirmPass.setBounds(280,250,300,30);
        confirmPass.setFont(f1);

        txtCity.setBounds(280,300,300,30);
        txtCity.setFont(f1);

        txtEmail.setBounds(280,350,300,30);
        txtEmail.setFont(f1);

        btnRegister.setBounds(150,400,170,50);
        btnReset.setBounds(340,400,170,50);

        btnRegister.setFont(new Font("Arial",Font.BOLD,26));
        btnReset.setFont(new Font("Arial",Font.BOLD,26));

        c.add(lblName);
        c.add(lblGender);
        c.add(lblFName);
        c.add(lblPass);
        c.add(lblConfirmPass);
        c.add(lblCity);
        c.add(lblEmail);
        c.add(txtName);
        c.add(cBox);
        c.add(txtFName);
        c.add(pass);
        c.add(confirmPass);
        c.add(txtCity);
        c.add(txtEmail);
        c.add(btnRegister);
        c.add(btnReset);
    }

    public static void main(String[]args)
    {
        new Task1();
    }
}