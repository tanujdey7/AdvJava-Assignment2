import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class demo {
    JFrame jf = new JFrame();
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JComboBox cb = null;
    JButton b = new JButton("Click");
    demo(){
        String operators[] = {"+","-","x","/"};
        cb = new JComboBox(operators);
        text1.setBounds(50,50,100,20);
        text2.setBounds(50,90,100,20);
        text3.setBounds(50,130,100,20);
        text3.setEditable(false);
        cb.setBounds(170,50,50,20);
        b.setBounds(50,170,100,20); 
        jf.add(text1);
        jf.add(text2);
        jf.add(text3);
        jf.add(cb);
        jf.add(b);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(text1.getText());
                int num2 = Integer.parseInt(text2.getText());
                int ans = 0;
                if(e.getSource() == b) {
                    String item = (String)cb.getSelectedItem();
                    switch (item) {
                        case "+":
                            ans = num1 + num2;
                            break;
                        case "-":
                            ans = num1 - num2;
                            break;
                        case "x":
                            ans = num1 * num2;
                            break;
                        case "/":
                            ans = num1 / num2;
                            break;
                    }
                }
                String str = String.valueOf(ans);
                text3.setText(str);
            }
        });   
    }
    public static void main(String[] args) throws Exception {
        new demo();
    }
}
