import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.event.*;
/*Create a form containing two list, one having month name and other having
day names. On clicking a button concatenate the elements selected by user
in both the lists and display it on label.*/
class demo {
    JFrame jf = new JFrame("13");
    JLabel label = new JLabel();
    JButton b = new JButton("Click");
    demo(){
        String str1[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String str2[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        JList<String> list1 = new JList<>(str1);
        JList<String> list2 = new JList<>(str2);
        b.setBounds(10,400,80,20);
        list1.setBounds(10,20,80,220);
        list2.setBounds(10,250,80,150);
        label.setBounds(10,430,800,20);
       // label.setText("Hello");
        jf.add(b);
        jf.add(list1);
        jf.add(list2);
        jf.add(label);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String month = "";
                if (list1.getSelectedIndex() != -1) {
                    month += list1.getSelectedValue();
                }
                String week = "";
                if(list2.getSelectedIndex() != -1) {
                    week = list2.getSelectedValue();
                }
                label.setText(month+" "+week);
                
            }
        });
    }
    public static void main(String[] args) {
        new demo();
    }
}