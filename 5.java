import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
class demo implements ActionListener{
        JFrame jf = new JFrame();
        JLabel label = new JLabel();
        JCheckBox r1 = new JCheckBox("Swimming");
        JCheckBox r2 = new JCheckBox("Reading");
        JCheckBox r3 = new JCheckBox("Dancing");
        JCheckBox r4 = new JCheckBox("Singing");
        demo() {
            r1.setBounds(50,50,100,20);
            r2.setBounds(50,80,100,20);
            r3.setBounds(50,110,100,20);
            r4.setBounds(50,140,100,20); 
            label.setBounds(50,170,100,200);
            r1.addActionListener(this);
            r2.addActionListener(this);
            r3.addActionListener(this);
            r4.addActionListener(this);
            jf.add(label);
            jf.add(r1);
            jf.add(r2);
            jf.add(r3);
            jf.add(r4);
            jf.setLayout(null);
            jf.setVisible(true);
            jf.setSize(300,300);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent ae) {
            String str = "";
            if(ae.getSource() == r1) {
                str += r1.getText();
            }
            if(ae.getSource() == r2) {
                str += r2.getText();
            }
            if(ae.getSource() == r3) {
                str += r3.getText();
            }
            if(ae.getSource() == r4) {
                str += r4.getText();
            }
            label.setText(str);
        }
    public static void main(String[] args) {
        demo d1 = new demo();
    }
}
