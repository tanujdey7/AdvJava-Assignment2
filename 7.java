import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class demo {
    JFrame jf = new JFrame("7");
    JTextArea area = new JTextArea(20,20);
    demo() {
        jf.add(area);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jf.getContentPane().add(scroll);
        jf.setSize(500,500);
        jf.getContentPane().setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new demo();
    }
}