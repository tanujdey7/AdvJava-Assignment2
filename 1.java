/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener {
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JFrame jf = new JFrame("Addition");
    JButton jb1 = new JButton("+");
    JButton jb2 = new JButton("-");
    JLabel jl = new JLabel("Result");
    
    demo() {
        tf1.setBounds(50,50,150,20);
        tf2.setBounds(50,100,150,20);
        jb1.setBounds(50,200,50,50);
        jb2.setBounds(120,200,50,50);
        jl.setBounds(50,150,150,20);
        add(tf1);
        add(tf2);
        add(jb1);
        add(jb2);
        add(jl);

        //Listeners
        jb1.addActionListener(this);
        jb2.addActionListener(this);         

        //Compulsary
        setLayout(null);
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int ans1 = 0 , ans2 = 0;
        if(ae.getSource() == jb1) {
            ans1 = num1 + num2;
            jl.setText(ans1 + "");
        }
        if(ae.getSource() == jb2) {
            ans2 = num1 - num2;
            jl.setText(ans2 + "");
        }
    }
    public static void main(String[] args) {
        demo d1 = new demo();
    }
}