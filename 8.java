import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.event.*;
class demo {
    demo() {
        JFrame jf = new JFrame("Jlist");
        JLabel label = new JLabel();
        Integer arr[] = new Integer[200];
        for(int i = 1 ; i < 21 ; i++) {
            int num = i;
            arr[i] = num;
        }
        JList<Integer> list = new JList<>(arr);
        list.setBounds(10,10,25,400);
        label.setBounds(45,10,100,200);
        jf.add(list);
        jf.add(label);
        jf.setSize(1000,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {
                if(e.getClickCount() == 1) {
                    int num = list.getSelectedValue();
                    if(num % 2 == 0) {
                        label.setText(num+": EVEN");    
                    }
                    else {
                        label.setText(num+": ODD");
                    }         
                }
            }
        });            
    }
    public static void main(String[] args) {
        new demo();
    }
}
