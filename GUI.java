import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event;
import org.json.simple.JSONObject;
import java.IO.*;
import java.io.File;
import java.io.IOException;
import java.awt.Actionevent;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JFrame F;

    JTextField t1, t2, t3, t4;
    JRadioButton r1, r2;
    ButtonGroup b;
    JRadioButton OP1, OP2;
    ButtonGroup G1;
    JCheckBox j1, j2, j3, j4;
    JTextArea a1;
    JComboBox c1;
    JButton b1, b2, b3;
    JPanel p1;
    // String Country[] = { "Pakistan", "India", "China" };

    public GUI() {
    }

    public GUI(String s) {
        super(s);
    }

    public void SetComponents() {
        l1 = new JLabel("Name");
        l2 = new JLabel("Roll NO");
        l3 = new JLabel("Batch");
        l4 = new JLabel("Section");
        l5 = new JLabel("Gender");
        l6 = new JLabel("Qualification");
        l7 = new JLabel("Adress");
        l8 = new JLabel("Country");
        l9 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        r1 = new JRadioButton("A)Male");
        r2 = new JRadioButton("B)Female");
        b = new ButtonGroup();
        j1 = new JCheckBox("Matric");
        j2 = new JCheckBox("Intermediate");
        j3 = new JCheckBox("Graduate");
        j4 = new JCheckBox("Post Graduate");
        a1 = new JTextArea();
        c1 = new JComboBox();
        b1 = new JButton("Save");
        b2 = new JButton("Print");
        b3 = new JButton("Clear");
        p1 = new JPanel();
        OP1 = new JRadioButton("Male");
        OP2 = new JRadioButton("Female");
        // F.getContentPane().setBackground(Color.ORANGE);
        // F.pack();
        // F.setVisible(true);
        // G1 = new ButtonGroup();

        // c1.addItem("Pakistan");
        // c1.addItem("India");
        // c1.addItem("China");

        // setBackground(Yellow);
        setLayout(new FlowLayout());
        pack();
        l1.setBounds(50, 50, 100, 20);
        l2.setBounds(50, 100, 150, 20);
        l3.setBounds(50, 150, 200, 20);
        l4.setBounds(50, 200, 250, 20);
        l9.setBounds(50, 250, 300, 20);
        t1.setBounds(200, 50, 300, 20);
        t2.setBounds(200, 100, 300, 20);
        t3.setBounds(200, 150, 300, 20);
        t4.setBounds(200, 200, 300, 20);
        l5.setBounds(50, 250, 200, 20);
        OP1.setBounds(200, 50, 200, 20);
        OP2.setBounds(220, 50, 250, 20);
        r1.setBounds(200, 50, 200, 20);
        r2.setBounds(200, 50, 200, 20);
        l6.setBounds(50, 300, 300, 20);
        j1.setBounds(200, 290, 200, 30);
        j3.setBounds(200, 340, 220, 30);
        j4.setBounds(280, 335, 270, 40);
        j2.setBounds(280, 285, 270, 40);
        l7.setBounds(50, 400, 400, 20);
        l8.setBounds(50, 500, 500, 20);
        a1.setBounds(200, 400, 265, 50);
        c1.setBounds(200, 480, 280, 50);
        b1.setBounds(120, 600, 100, 30);
        b2.setBounds(250, 600, 100, 30);
        b3.setBounds(375, 600, 100, 30);
        // l9.setBounds(50, ABORT, WIDTH, HEIGHT);

        //// b1.addActionListener(new Handler());
        // b2.addActionListener(new Handler());
        // b3.addActionListener(new Handler());

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(l9);
        add(l5);
        add(l6);
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(l7);
        add(a1);
        add(c1);
        add(l8);
        add(b1);
        add(b2);
        add(b3);
        add(OP1);
        add(OP2);
        setLayout(null);
        add(OP1);
        add(OP2);
        p1.setBackground(Color.white);
        add(p1);
        c1.addItem("Pakistan");
        c1.addItem("India");
        c1.addItem("China");
        // add(l8);

        // add(j1);
        // add(j2);

        // l1.setB
        // b.add(r1);
        // b.add(r2);

    }

    class Handler implements ActionListener {
        public void ActionPerformed(Actionevent e) {
            File myFile = new File("MyFist.json");
            try {
                if (myFile.createNewFile())
                    ;
                System.out.println("File Created" + myFile.getName);
            } catch (IOException ie) {
                System.out.println("File not Found");
                ie.setStackTrace();
            }
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("Name", "Muhammad Waryal");
            jsonobject.put("Roll NO", "21SW119");
            jsonobject.put("Batch", "21Sw");
            jsonobject.put("Section", 3);
            jsonobject.put("Gender", "Male");
            jsonobject.put("Adress", "Talib-ul-Moula Colony Hala");
            jsonobject.put("Country", "Pakistan");

        }
    }

    public static void main(String[] args) {
        GUI G = new GUI("Student Registration Form ");
        G.SetComponents();
        G.setSize(700, 700);
        G.setVisible(true);
        // G.getContent
        // G.setBackground(Yellow);
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // G.setBackground(Color.YELLOW);

    }
}
