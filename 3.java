import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
class demo {
    JFrame jf = new JFrame("Vowel");
    JButton b = new JButton("Select");
    JLabel jl = new JLabel();
    demo() {
        String alphabates[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        final JList<String> list = new JList<>(alphabates);
        list.setBounds(100,100,48,500);
        jl.setSize(100,200);
        b.setBounds(150,100,80,40);
        jf.add(b);
        jf.add(list);
        jf.add(jl);
        jf.setSize(720,720);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

        b.addActionListener(new ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(list.getSelectedValue() == "a" || list.getSelectedValue() == "e" || list.getSelectedValue() == "i" || list.getSelectedValue() == "o" || list.getSelectedValue() == "u") {
                    JOptionPane.showMessageDialog(null, "Vowel");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Consonent");
                }
            }
        });
    }
    public static void main(String[] args) {
        new demo();
    }
}
