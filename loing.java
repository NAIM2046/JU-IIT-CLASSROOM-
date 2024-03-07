import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class loing extends JFrame {
    private Container c;
    private JLabel l1, l2, l3, coursecode;
    private Font f, f1;
    private JTextField t1, tcoursecode;
    private JPasswordField t2;
    private JButton b1, b2, back;
    private Cursor c1;

    loing() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(420, 50, 500, 500);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        f = new Font("Times New Roman", Font.BOLD, 20);
        f1 = new Font("Times New Roman", Font.BOLD, 25);
        c1 = new Cursor(Cursor.HAND_CURSOR);
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
        l1 = new JLabel(" Teacher login ");
        l1.setBounds(120, 10, 200, 50);
        l1.setForeground(Color.GREEN);
        l1.setFont(f1);
        c.add(l1);
        l2 = new JLabel("Username : ");
        l2.setForeground(Color.GREEN);
        l2.setBounds(15, 70, 120, 30);
        l2.setFont(f);
        c.add(l2);
        t1 = new JTextField();
        t1.setBounds(130, 60, 200, 50);
        t1.setFont(f);
        c.add(t1);
        l3 = new JLabel("Passwords : ");
        l3.setBounds(20, 120, 200, 50);
        l3.setForeground(Color.green);
        l3.setFont(f);
        c.add(l3);
        t2 = new JPasswordField();
        t2.setBounds(130, 120, 200, 50);
        c.add(t2);
        coursecode = new JLabel("Course code : ");
        coursecode.setFont(f);
        coursecode.setForeground(Color.green);
        coursecode.setBounds(20, 170, 200, 50);
        c.add(coursecode);
        tcoursecode = new JTextField("ICT-");
        tcoursecode.setFont(f);
        tcoursecode.setBounds(130, 180, 200, 50);
        c.add(tcoursecode);
        b1 = new JButton("Submit");
        b1.setBounds(90, 280, 100, 50);

        b1.setBackground(Color.green);
        b1.setCursor(c1);
        c.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = "";
                String course = "";
                try {
                    File file = new File("E:/NAIM2046/projectgoolgeclassroom/teacher.txt");
                    Scanner scanner = new Scanner(file);
                    int i = 0;
                    while (scanner.hasNext()) {
                        username = scanner.next();
                        course = scanner.next();

                        if (username.equals(t1.getText()) && tcoursecode.getText().equals("ICT-1207")
                                && course.equals(t2.getText())) {
                            Teacher1 frame = new Teacher1();
                            frame.setVisible(true);
                            dispose();
                            JOptionPane.showMessageDialog(null, username + " Sir Welcome your class room");
                            i = 1;
                            break;
                        } else if (username.equals(t1.getText()) && tcoursecode.getText().equals("ICT-1204")) {
                            Teacher2 frame = new Teacher2();
                            frame.setVisible(true);
                            dispose();
                            JOptionPane.showMessageDialog(null, username + " Sir Welcome your class room");
                            i = 1;
                            break;
                        } else if (username.equals(t1.getText()) && tcoursecode.getText().equals("ICT-1201")) {
                            Teacher3EDC frame = new Teacher3EDC();
                            frame.setVisible(true);
                            dispose();
                            JOptionPane.showMessageDialog(null, username + " Sir Welcome your class room");
                            i = 1;
                            break;
                        }

                    }
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Donot match your user name and password plases try again ");
                    }

                } catch (Exception e1) {

                }
            }

        });

        b2 = new JButton("Clear");
        b2.setBounds(200, 280, 100, 50);
        b2.setCursor(c1);
        b2.setBackground(Color.red);
        c.add(b2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });

    }

    public static void main(String[] args) {
        loing frame = new loing();
        frame.setVisible(true);

    }
}
