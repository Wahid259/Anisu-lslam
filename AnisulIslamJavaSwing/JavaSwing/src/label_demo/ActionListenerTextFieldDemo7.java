//in this some error hapans




package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenerTextFieldDemo7 extends JFrame{
    private Container c;
    private JTextField tf1, tf2, tf3;

    ActionListenerTextFieldDemo7() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 150, 50);
        c.add(tf3);
        
        tf3 = new JTextField();
        tf3.setBounds(50, 170, 150, 50);
        c.add(tf3);

        Handler handler = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
        tf3.addActionListener(handler);

    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == tf1) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "you did not enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1 = " + s);
                }
            } else if(e.getSource() == tf2) {
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "you did not enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2 = " + s);
                }
            }else {
                String s = tf3.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "you did not enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf3 = " + s);
                }
            }

        }
    }

    public static void main(String[] args) {

        ActionListenerTextFieldDemo7 frame = new ActionListenerTextFieldDemo7();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("ActionListener Demo");

    }
}
