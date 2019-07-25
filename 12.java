import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.*;
class demo implements ActionListener {
    JFrame jf = new JFrame("12");
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JLabel label = new JLabel();
    demo() {
        b1.setBounds(10,20,100,20);
        b2.setBounds(10,50,100,20);
        b3.setBounds(10,80,100,20);
        label.setBounds(10,110,500,20);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(label);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            label.setText("Selected Button 1");
        }
        if(ae.getSource() == b2) {
            label.setText("Selected Button 2");
        }
        if(ae.getSource() == b3) {
            label.setText("Selected Button 3");
        }
    }
    public static void main(String[] args) {
        new demo();
    }
}