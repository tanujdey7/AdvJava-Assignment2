import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
class demo {
    JFrame jf = new JFrame("WEEK");
    JButton b = new JButton("CLICK");
    JLabel jl = new JLabel();
    demo() {
        jl.setSize(500,100);
        b.setBounds(100,190,80,20);
        String week[] = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        final JList<String> list = new JList<>(week);
        list.setBounds(100,100,75,75);
        jf.add(list);
        jf.add(b);
        jf.add(jl);

        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Day selected: ";
                if(list.getSelectedIndex() != -1) {
                    data += list.getSelectedValue();
                    jl.setText(data);
                }
            }
        });
    }
    public static void main(String[] args) {
        new demo();
    }
}