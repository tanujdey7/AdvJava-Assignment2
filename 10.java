import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

class demo implements ItemListener {
    JFrame jf = new JFrame("Toggle");
    JToggleButton b = new JToggleButton("On");
    demo() {
        jf.add(b);
        b.setBounds(100,200,100,100);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        b.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e) {
        if(b.isSelected()) {
            b.setText("Off");
        }
        else {
            b.setText("On");
        }
    }
    public static void main(String[] args) {
        new demo();
    }
}