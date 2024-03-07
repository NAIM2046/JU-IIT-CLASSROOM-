import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teacher2 extends JFrame {
    private Container c;
    private JLabel lt1, label;
    private Font f, f2;
    private JTextArea ta;
    private JScrollPane scroll;
    private JButton post, logout;
    private Cursor c1;

    Teacher2() {
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(420, 50, 500, 600);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        f = new Font("Times New Roman", Font.BOLD, 15);
        f2 = new Font("Times New Roman", Font.BOLD, 20);
        c1 = new Cursor(Cursor.HAND_CURSOR);
        label = new JLabel("now you are a OOP course Teacher");
        label.setFont(f);
        label.setBounds(10, 1, 300, 50);
        c.add(label);

        lt1 = new JLabel("Announce something with your class : ");
        lt1.setBounds(10, 60, 400, 50);
        lt1.setFont(f2);

        c.add(lt1);
        ta = new JTextArea();

        ta.setFont(f);
        ta.setBackground(Color.WHITE);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        scroll = new JScrollPane(ta);
        scroll.setBounds(10, 120, 400, 150);

        c.add(scroll);
        post = new JButton("post");
        post.setFont(f2);
        post.setBounds(50, 280, 100, 50);
        post.setBackground(Color.GREEN);
        post.setCursor(c1);
        c.add(post);
        logout = new JButton("logout");
        logout.setFont(f);
        logout.setBounds(200, 500, 100, 50);
        logout.setBackground(Color.red);
        logout.setCursor(c1);
        c.add(logout);
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcome frame = new welcome();
                frame.setVisible(true);
                dispose();
            }
        });
        try {
            FileWriter file = new FileWriter("E:/NAIM2046/projectgoolgeclassroom/OOp.txt", true);
            BufferedWriter bwrite = new BufferedWriter(file);
            post.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String s = ta.getText();
                        bwrite.write(s);
                        bwrite.newLine();
                        bwrite.newLine();
                        bwrite.close();
                        file.close();

                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    ta.setText("");
                    JOptionPane.showMessageDialog(null, "Successfully post your message ");
                }
            });

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Teacher2 frame = new Teacher2();
        frame.setVisible(true);
    }

}