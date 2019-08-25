import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm{

    JFrame frame;
    JLabel lblName;
    JLabel lblPhone;
    JLabel lblEmail;
    JLabel lblCity;
    JLabel lblGender;
    JTextField txtName;
    JTextField txtPhone;
    JTextField txtEmail;
    JComboBox cBox;
    JRadioButton rbtnMale;
    JRadioButton rbtnFemale;
    ButtonGroup group;
    JButton btnSubmit;
    JButton btnClear;


    public RegistrationForm(){
        initComponents();
    }

    public void initComponents(){
        frame = new JFrame("Registration Form");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,800,600);

        Container c = frame.getContentPane(); 
        c.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        lblName = new JLabel("Name");
        lblPhone = new JLabel("Phone No");
        lblEmail = new JLabel("Email");
        lblCity = new JLabel("City");
        lblGender = new JLabel("Gender");
        txtName = new JTextField();
        txtPhone = new JTextField();
        txtEmail = new JTextField();
        rbtnMale = new JRadioButton("Male");
        rbtnFemale = new JRadioButton("Female");
        group = new ButtonGroup();
        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear");

        Font f = new Font("Arial",Font.PLAIN,26);
        lblName.setFont(f);
        lblPhone.setFont(f);
        lblEmail.setFont(f);
        lblCity.setFont(f);
        lblGender.setFont(f);
        txtName.setFont(f);
        txtPhone.setFont(f);
        txtEmail.setFont(f);
        String []s = {"--Select--","Karachi","Hyderabad","Larkana"};
        cBox = new JComboBox(s);
        cBox.setFont(f);
        rbtnMale.setFont(f);
        rbtnFemale.setFont(f);
        group.add(rbtnMale);
        group.add(rbtnFemale);
        btnSubmit.setFont(f);
        btnClear.setFont(f);


        //gbc.insets = new Insets(spacing to top,spacing to left,spacing to bottom,spacing to right)
        gbc.insets = new Insets(20,20,20,40);

        gbc.gridx = 0;
        gbc.gridy = 0;
        c.add(lblName,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        c.add(lblPhone,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        c.add(lblEmail,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        c.add(lblCity,gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        c.add(lblGender,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 4;
        gbc.gridx = 1;
        gbc.gridy = 0;
        c.add(txtName,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        c.add(txtPhone,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        c.add(txtEmail,gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.gridy = 3;
        c.add(cBox,gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        c.add(rbtnMale,gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        c.add(rbtnFemale,gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        c.add(btnSubmit,gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        c.add(btnClear,gbc);

        btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                txtName.setText("");
                txtPhone.setText("");
                txtEmail.setText("");
                cBox.setSelectedIndex(0);
                rbtnMale.setSelected(false);
                rbtnFemale.setSelected(false);
            }
        });
        btnSubmit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if( !(txtName.getText().isEmpty()) && !(txtPhone.getText().isEmpty()) && 
                    !(txtEmail.getText().isEmpty()) && (rbtnMale.isSelected() || rbtnFemale.isSelected())  && 
                    cBox.getSelectedIndex()>0 ){
                        JOptionPane.showMessageDialog(null,"Form Submitted","Registration Form",
                                                        JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please! fill all the fields","Registration Form",
                                                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


    }

    public static void main(String[]args)
    {
        new RegistrationForm();
    }
}