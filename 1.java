import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.event.*;
class demo {
    JFrame jf = new JFrame();
    JButton b = new JButton("Click");
    demo() {
        Integer arr[] = new Integer[10];
        for(int i = 0 ; i < 10 ; i++) {
            int num = i;
            arr[i] = num;
        }
        JList<Integer> list1 = new JList<>(arr);
        JList<Integer> list2 = new JList<>(arr);
        list1.setBounds(10,20,20,200);
        list2.setBounds(40,20,20,200);
        b.setBounds(10,230,70,50);
        jf.add(list1);
        jf.add(list2);
        jf.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b) {
                    int num1 = list1.getSelectedValue();
                    int num2 = list2.getSelectedValue();
                    System.out.println(num1+num2);
                }
            }
        });
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new demo();
    }
}
