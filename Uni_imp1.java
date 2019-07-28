import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
class demo {
    JFrame jf = new JFrame();
    JScrollBar bar = new JScrollBar();
    JTextArea text = new JTextArea(5,15);
    demo() {
        text.setBounds(90,50,200,300);
        text.setEditable(false);
        bar.setBounds(10,50,70,200);
        bar.setMinimum(1);
        bar.setMaximum(30);
        jf.add(bar);
        jf.add(text);
        jf.setSize(1000,700);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        bar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                int num = bar.getValue();
                int ans = 0;
                String str = "";
                for(int i = 1 ; i <= 10 ; i++) {
                    ans = num * i;
                    str += num + " x " + i + " = " + ans; 
                    str += "\n";
                }
                text.setText(str);
            }
        });
    }
    public static void main(String[] args) {
        new demo();
    }
}
