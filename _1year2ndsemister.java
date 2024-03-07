import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class _1year2ndsemister extends JFrame {
    Container c;
    private Font f, f1, f2;
    private JLabel discretemath, OOP, EDC;
    private JButton b1, b2, b3, logout;

    private Cursor c1;

    _1year2ndsemister() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 20, 550, 950);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        c1 = new Cursor(Cursor.HAND_CURSOR);
        f = new Font("Times New Roman", Font.BOLD, 20);
        f1 = new Font("Times New Roman", Font.BOLD, 15);
        f2 = new Font("Times New Roman", Font.BOLD, 10);
        logout = new JButton("logout");
        logout.setFont(f1);
        logout.setBounds(420, 1, 100, 50);
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
        discretemath = new JLabel("    Discrete Mathematics \n ");
        // discretemath.setText("Discrete Mathematics Batch 51 ");
        discretemath.setFont(f);
        discretemath.setBackground(Color.PINK);
        discretemath.setOpaque(true);

        discretemath.setBounds(100, 10, 300, 200);
        // discretemath.setBackground(Color.PINK);
        c.add(discretemath);
        b1 = new JButton("Enter");
        b1.setBounds(90, 120, 100, 50);
        b1.setBackground(Color.green);
        b1.setCursor(c1);
        discretemath.add(b1);

        OOP = new JLabel("                   OOP   ");
        OOP.setFont(f);
        OOP.setBackground(Color.RED);
        OOP.setOpaque(true);
        OOP.setBounds(100, 230, 300, 200);
        c.add(OOP);
        b2 = new JButton("Enter");
        b2.setBounds(90, 120, 100, 50);
        b2.setBackground(Color.green);
        b2.setCursor(c1);
        OOP.add(b2);
        EDC = new JLabel("                  EDC   ");
        EDC.setFont(f);
        EDC.setBackground(Color.white);
        EDC.setOpaque(true);
        EDC.setBounds(100, 470, 300, 200);
        c.add(EDC);
        b3 = new JButton("Enter");
        b3.setBounds(90, 120, 100, 50);
        b3.setBackground(Color.green);
        b3.setCursor(c1);
        EDC.add(b3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                discretemath Frame = new discretemath();
                Frame.setVisible(true);
                dispose();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OOP frame = new OOP();
                frame.setVisible(true);
                dispose();
            }
        });
        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                EDC Frame = new EDC();
                Frame.setVisible(true);
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        _1year2ndsemister frame = new _1year2ndsemister();
        frame.setVisible(true);

    }

}
