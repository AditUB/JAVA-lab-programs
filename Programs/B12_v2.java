import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
    JFrame frame; // Creating object of JFrame class
    JTextField t;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, badd, bmul, bsub, bdiv, beq, bclr;
    static double a = 0, b = 0, res = 0;
    static int op = 0;

    public void Display() {
        frame = new JFrame();
        frame.setTitle("IUK Calculator"); // Title of the JFrame
        frame.setSize(225, 300); // Calculator Size
        frame.setLayout(null); // Setting Layout
        frame.setBackground(Color.black); // Setting Background Color
        frame.setResizable(true); // window resizing
        frame.setVisible(true); // Setting window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Setting default close operation
        t = new JTextField();
        t.setBounds(30, 10, 165, 35);
        b0 = new JButton("0");
        b0.setBounds(30, 50, 45, 40);
        b1 = new JButton("1");
        b1.setBounds(70, 50, 45, 40);
        b2 = new JButton("2");
        b2.setBounds(110, 50, 45, 40);
        b3 = new JButton("3");
        b3.setBounds(150, 50, 45, 40);
        b4 = new JButton("4");
        b4.setBounds(30, 90, 45, 40);
        b5 = new JButton("5");
        b5.setBounds(70, 90, 45, 40);
        b6 = new JButton("6");
        b6.setBounds(110, 90, 45, 40);
        b7 = new JButton("7");
        b7.setBounds(150, 90, 45, 40);
        b8 = new JButton("8");
        b8.setBounds(30, 130, 45, 40);
        b9 = new JButton("9");
        b9.setBounds(70, 130, 45, 40);
        bdot = new JButton(".");
        bdot.setBounds(110, 130, 45, 40);
        badd = new JButton("+");
        badd.setBounds(150, 130, 45, 40);
        bsub = new JButton("-");
        bsub.setBounds(30, 170, 45, 40);
        bmul = new JButton("*");
        bmul.setBounds(70, 170, 45, 40);
        bdiv = new JButton("/");
        bdiv.setBounds(110, 170, 45, 40);
        beq = new JButton("=");
        beq.setBounds(150, 170, 45, 40);
        bclr = new JButton("CLR");
        bclr.setBounds(30, 210, 165, 40);
        frame.add(t);
        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdot);
        frame.add(badd);
        frame.add(bsub);
        frame.add(bmul);
        frame.add(bdiv);
        frame.add(beq);
        frame.add(bclr);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdot.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bclr) {
            t.setText("");
        }
        if (e.getSource() == b0) {
            t.setText(t.getText().concat("0"));
        }
        if (e.getSource() == b1) {
            t.setText(t.getText().concat("1"));
        }
        if (e.getSource() == b2) {
            t.setText(t.getText().concat("2"));
        }
        if (e.getSource() == b3) {
            t.setText(t.getText().concat("3"));
        }
        if (e.getSource() == b4) {
            t.setText(t.getText().concat("4"));
        }
        if (e.getSource() == b5) {
            t.setText(t.getText().concat("5"));
        }
        if (e.getSource() == b6) {
            t.setText(t.getText().concat("6"));
        }
        if (e.getSource() == b7) {
            t.setText(t.getText().concat("7"));
        }
        if (e.getSource() == b8) {
            t.setText(t.getText().concat("8"));
        }
        if (e.getSource() == b9) {
            t.setText(t.getText().concat("9"));
        }
        if (e.getSource() == bdot) {
            t.setText(t.getText().concat("."));
        }
        if (e.getSource() == badd) {
            a = Double.parseDouble(t.getText());
            op = 1;
            t.setText("");
        }
        if (e.getSource() == bsub) {
            a = Double.parseDouble(t.getText());
            op = 2;
            t.setText("");
        }
        if (e.getSource() == bmul) {
            a = Double.parseDouble(t.getText());
            op = 3;
            t.setText("");
        }
        if (e.getSource() == bdiv) {
            a = Double.parseDouble(t.getText());
            op = 4;
            t.setText("");
        }
        if (e.getSource() == beq) {
            b = Double.parseDouble(t.getText());
            switch (op) {
                case 1:
                    res = a + b;
                    break;
                case 2:
                    res = a - b;
                    break;
                case 3:
                    res = a * b;
                    break;
                case 4:
                    res = a / b;
                    break;
            }
            t.setText("" + res);
        }
    }
}

public class CalculatorP {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.Display();
    }
}