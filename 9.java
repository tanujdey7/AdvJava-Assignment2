import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.event.*;
class demo {
    demo() {
        JFrame jf = new JFrame("ScrolBar");
        JScrollBar bar = new JScrollBar();
        JLabel label = new JLabel();
        bar.setBounds(50,50,50,300);
        bar.setMaximum(30);
        jf.add(bar);
        label.setBounds(110,50,100,200);
        jf.add(label);
        jf.setSize(1000,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        bar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                int num = bar.getValue();
                if(num % 2 == 0) {
                    label.setText(num+": EVEN");    
                }
                else {
                    label.setText(num+": ODD");
                }
            }
        });
    }
    public static void main(String[] args) {
        new demo();
    }
}