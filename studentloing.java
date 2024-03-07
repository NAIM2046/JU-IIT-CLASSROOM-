import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.*;

public class studentloing extends JFrame {
    Container c;
    private Font f, f1;
    private JLabel label, username, pass, seleted;
    private JTextField test1;
    private JPasswordField passt2;
    private JButton enterb1, clearb2, back;
    private Cursor c1;
    private JComboBox box1;
    private String[] semister = { "1st year 1st semister", "1st year 2nd semister", "2nd year 1st semister",
            "2nd year 2nd semister", "3nd year 1st semister", "3nd year 2nd semister", "4th year 1st semister",
            "4th year 2nd semister" };

    studentloing() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 50, 500, 600);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        c1 = new Cursor(Cursor.HAND_CURSOR);
        f = new Font("Times New Roman", Font.BOLD, 20);
        f1 = new Font("Times New Roman", Font.BOLD, 25);
        label = new JLabel("Student login");
        label.setForeground(Color.green);
        label.setFont(f);
        back = new JButton("Back");
        back.setBackground(Color.green);
        back.setBounds(1, 1, 80, 50);
        back.setFont(f);
        back.setCursor(c1);
        c.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main frame = new Main();
                frame.setVisible(true);
                dispose();
            }
        });
        label.setBounds(100, 20, 200, 50);
        c.add(label);
        username = new JLabel("Student username:");
        username.setFont(f);
        username.setBounds(20, 100, 200, 50);
        username.setForeground(Color.green);
        c.add(username);
        test1 = new JTextField();
        test1.setFont(f);
        test1.setBounds(200, 100, 150, 50);
        c.add(test1);
        pass = new JLabel("Student password :");

        pass.setFont(f);
        pass.setForeground(Color.green);
        pass.setBounds(20, 170, 200, 50);
        c.add(pass);
        passt2 = new JPasswordField();
        passt2.setFont(f);
        passt2.setBounds(200, 170, 150, 50);
        c.add(passt2);
        seleted = new JLabel("seleted your year and semister");
        seleted.setFont(f);
        seleted.setBounds(30, 250, 300, 50);
        seleted.setForeground(Color.green);
        c.add(seleted);
        box1 = new JComboBox(semister);
        box1.setFont(f);
        box1.setBounds(70, 300, 200, 50);
        c.add(box1);
        enterb1 = new JButton("Submit");
        enterb1.setFont(f);
        enterb1.setCursor(c1);
        enterb1.setBounds(50, 370, 100, 50);
        enterb1.setBackground(Color.green);
        c.add(enterb1);
        clearb2 = new JButton("Clear");
        clearb2.setFont(f);
        clearb2.setCursor(c1);
        clearb2.setBounds(200, 370, 100, 50);
        clearb2.setBackground(Color.red);
        c.add(clearb2);
        clearb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                test1.setText("");
                passt2.setText("");
            }
        });
        // int i = 0 ;
        enterb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("E:/NAIM2046/projectgoolgeclassroom/studentinfor.txt");
                    Scanner scanner = new Scanner(file);
                    String user = "";
                    String s = box1.getSelectedItem().toString();
                    String pass;
                    int i = 0;
                    while (scanner.hasNext()) {
                        user = scanner.next();
                        pass = scanner.next();
                        if (user.equals(test1.getText()) && s.equals("1st year 2nd semister")
                                && pass.equals(passt2.getText())) {
                            _1year2ndsemister frame = new _1year2ndsemister();
                            frame.setVisible(true);
                            dispose();
                            JOptionPane.showMessageDialog(null, user + " Welcome your class room");
                            i = 1;
                            break;
                        }
                    }
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Donot match your user name and password plases try again ");
                    }
                    scanner.close();

                } catch (Exception e1) {

                }

            }
        });

    }

    public static void main(String[] args) {
        studentloing frame = new studentloing();
        frame.setVisible(true);

    }
}
