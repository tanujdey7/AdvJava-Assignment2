import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class demo extends JFrame implements ActionListener{
    JFrame jf = new JFrame();
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        demo() {
            r1.setBounds(50,50,100,20);
            r2.setBounds(50,100,100,20);
            r1.setSelected(true);
            bg.add(r1);
            bg.add(r2);
            jf.add(r1);
            jf.add(r2);
            r1.addActionListener(this);
            r2.addActionListener(this);
            jf.setLayout(null);
            jf.setVisible(true);
            jf.setSize(300,300);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == r1) {
                JOptionPane.showMessageDialog(null, "You selected Male!");
            }
            if(ae.getSource() == r2) {
                JOptionPane.showMessageDialog(null, "You selected Female!");
            }
        }
    public static void main(String[] args) {
        demo d1 = new demo();
    }
}
