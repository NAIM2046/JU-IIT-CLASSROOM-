import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome extends JFrame {
    Container c;
    private JCheckBox student, teacher;
    private JLabel label, labelimg, iconlabel;
    private Font f, f1;

    private JButton lonig, creataccount;
    private ImageIcon icon, img;
    private Cursor c1;

    welcome() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(420, 50, 600, 600);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        c1 = new Cursor(Cursor.HAND_CURSOR);
        f = new Font("Wide Latin", Font.BOLD, 15);
        f1 = new Font("Times New Roman", Font.BOLD, 25);
        label = new JLabel("Welcome to JU - IIT - Classroom");
        label.setFont(f);
        label.setBounds(80, 10, 500, 50);
        label.setForeground(Color.black);
        c.add(label);
        img = new ImageIcon(getClass().getResource("julogo.png"));
        iconlabel = new JLabel(img);
        iconlabel.setBounds(200, 60, img.getIconWidth(), img.getIconHeight());
        c.add(iconlabel);

        icon = new ImageIcon(getClass().getResource("iit.png"));
        labelimg = new JLabel(icon);
        labelimg.setBounds(70, 250, icon.getIconWidth(), icon.getIconHeight());
        c.add(labelimg);
        lonig = new JButton("Login");
        lonig.setFont(f1);
        lonig.setBackground(Color.green);
        lonig.setCursor(c1);
        lonig.setBounds(100, 450, 100, 50);
        c.add(lonig);
        creataccount = new JButton("CreatAccount");
        creataccount.setFont(f1);
        creataccount.setBackground(Color.green);
        creataccount.setBounds(300, 450, 180, 50);
        creataccount.setCursor(c1);
        c.add(creataccount);
        lonig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Main frame = new Main();
                frame.setVisible(true);
                dispose();

            }
        });
        creataccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                creataccountMain frame = new creataccountMain();
                frame.setVisible(true);
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        welcome frame = new welcome();
        frame.setVisible(true);

    }
}
