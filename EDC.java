import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.*;

public class EDC extends JFrame {
    Container c;
    private Font f;

    private Cursor c1;
    private JTextArea ta;
    private JScrollPane scroll;
    private JLabel label;
    private JMenuBar menubar;
    private JMenu Menu;
    private JMenuItem backItem, logOutItem;

    EDC() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 50, 600, 700);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        c1 = new Cursor(Cursor.HAND_CURSOR);
        f = new Font("Times New Roman", Font.BOLD, 20);
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        Menu = new JMenu("Menu");
        menubar.add(Menu);
        backItem = new JMenuItem("Back");
        logOutItem = new JMenuItem("log out");
        Menu.add(backItem);
        Menu.add(logOutItem);
        backItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                _1year2ndsemister frame = new _1year2ndsemister();
                frame.setVisible(true);
                dispose();
            }
        });
        logOutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main frame = new Main();
                frame.setVisible(true);
                dispose();
            }
        });

        label = new JLabel("Electronic Devices and Circuits  classroom");
        label.setBounds(1, 50, 400, 50);
        label.setFont(f);
        c.add(label);
        ta = new JTextArea();

        ta.setFont(f);
        ta.setBackground(Color.WHITE);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        scroll = new JScrollPane(ta);
        scroll.setBounds(1, 120, 585, 490);
        c.add(scroll);
        try {
            File file = new File("E:/NAIM2046/projectgoolgeclassroom/EDC.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                ta.append(s + "\n");
            }
            scanner.close();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        EDC Frame = new EDC();
        Frame.setVisible(true);
    }
}
