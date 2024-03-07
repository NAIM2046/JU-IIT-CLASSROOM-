import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class creataccountMain extends JFrame {
    Container c;
    private JCheckBox student, teacher;
    private JLabel label;
    private Font f;
    private ButtonGroup grp;
    private JButton b1;

    creataccountMain() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(420, 50, 500, 500);
        setTitle(" JU- IIT - Classroom ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        grp = new ButtonGroup();
        f = new Font("Times New Roman", Font.BOLD, 20);
        label = new JLabel("What do you CreatAccount as ? ");
        label.setFont(f);
        label.setBounds(50, 50, 350, 50);
        c.add(label);
        student = new JCheckBox("Student");
        student.setBounds(100, 150, 200, 50);
        student.setBackground(Color.green);
        student.setFont(f);
        c.add(student);
        teacher = new JCheckBox("Teacher");
        teacher.setBounds(100, 220, 200, 50);
        teacher.setBackground(Color.green);
        teacher.setFont(f);

        c.add(teacher);
        grp.add(student);
        grp.add(teacher);
        b1 = new JButton("Enter");
        b1.setBounds(120, 300, 100, 50);
        b1.setBackground(Color.green);
        c.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (teacher.isSelected()) {
                    creataccountTeacher frame = new creataccountTeacher();
                    frame.setVisible(true);
                    dispose();
                } else {
                    creataccountstudent frame = new creataccountstudent();
                    frame.setVisible(true);
                    dispose();
                }
            }
        });

    }

    public static void main(String[] args) {
        creataccountMain frame = new creataccountMain();
        frame.setVisible(true);
    }
}
