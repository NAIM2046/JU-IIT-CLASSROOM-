import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class creataccountstudent extends JFrame {
    Container c;

    private JLabel username, classroll, password;
    private Font f;
    private ButtonGroup grp;
    private JButton submit, cancel, back;
    private JPasswordField pa;
    Cursor c1;
    private JTextField usen, clarol;

    creataccountstudent() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(420, 50, 600, 600);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        f = new Font("Times New Roman", Font.BOLD, 20);
        c.setLayout(null);
        c.setBackground(Color.pink);
        c1 = new Cursor(Cursor.HAND_CURSOR);
        back = new JButton("Back");
        back.setBackground(Color.green);
        back.setBounds(400, 1, 80, 50);
        back.setFont(f);
        back.setCursor(c1);
        c.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                creataccountMain frame = new creataccountMain();
                frame.setVisible(true);
                dispose();
            }
        });
        username = new JLabel("User Name : ");
        username.setFont(f);
        username.setBounds(10, 20, 200, 50);
        c.add(username);
        usen = new JTextField();
        usen.setFont(f);
        usen.setBounds(120, 20, 200, 50);
        c.add(usen);
        password = new JLabel("password : ");
        password.setFont(f);
        password.setBounds(10, 90, 100, 50);
        c.add(password);
        pa = new JPasswordField();
        pa.setFont(f);
        pa.setBounds(120, 90, 200, 50);
        c.add(pa);
        classroll = new JLabel("Class roll : ");
        classroll.setFont(f);
        classroll.setBounds(10, 160, 200, 50);
        c.add(classroll);
        clarol = new JTextField();
        clarol.setFont(f);
        clarol.setBounds(120, 160, 200, 50);
        c.add(clarol);
        submit = new JButton("Submit");
        submit.setFont(f);
        submit.setBounds(50, 250, 100, 50);
        c.add(submit);
        cancel = new JButton("Cancel");
        cancel.setFont(f);
        cancel.setBounds(200, 250, 100, 50);
        c.add(cancel);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter file = new FileWriter("E:/NAIM2046/projectgoolgeclassroom/studentinfor.txt", true);
                    BufferedWriter bwrite = new BufferedWriter(file);
                    String s = usen.getText();
                    String pass = pa.getText();
                    bwrite.write(s + " " + pass);
                    bwrite.newLine();
                    bwrite.close();
                    file.close();

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                studentloing frame = new studentloing();
                frame.setVisible(true);
                dispose();

                JOptionPane.showMessageDialog(null, "Enter your user name and password plases login  ");
            }
        });

    }

    public static void main(String[] args) {
        creataccountstudent frame = new creataccountstudent();
        frame.setVisible(true);

    }
}
