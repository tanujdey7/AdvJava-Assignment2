import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class demo implements ActionListener{
    JFrame jf = new JFrame("Fruits");
    JRadioButton r1 = new JRadioButton("Apple");
    JRadioButton r2 = new JRadioButton("Banana");
    JRadioButton r3 = new JRadioButton("Mango");
    JRadioButton r4 = new JRadioButton("Orange");
    ButtonGroup bg = new ButtonGroup();
    JLabel label = new JLabel();
    demo() {
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        jf.add(r1);
        jf.add(r2);
        jf.add(r3);
        jf.add(r4);
        jf.add(label);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == r1) {
            label.setText("You have Selected Apple");
        }
        if(e.getSource() == r2) {
            label.setText("You have Selected Banana");
        }
        if(e.getSource() == r3) {
            label.setText("You have Selected Mango");
        }
        if(e.getSource() == r4) {
            label.setText("You have Selected Orange");
        }
    }
    public static void main(String[] args) {
        new demo();
    }
}