
package radio_button;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioButtonAndActionListener extends JFrame{
    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;
    

    RadioButtonAndActionListener() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("RadioButtonDemo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        f = new Font("Arial", Font.BOLD, 18);

        grp = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 50);
        male.setFont(f);
        male.setBackground(Color.orange);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(160, 50, 100, 50);
        female.setFont(f);
        female.setBackground(Color.orange);
        c.add(female);

        grp.add(male);
        grp.add(female);
        
        ta = new JTextArea();
        ta.setBounds(20, 110, 300, 200);
        ta.setFont(f);
        ta.setBackground(Color.pink);
        c.add(ta);
        
        Handler handler = new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
        
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(male.isSelected())
            {
                ta.append("You have selected male\n");
            }
            else
            {
                ta.append("You have selected female\n");
            }
        }
        
    }

    public static void main(String[] args) {

        RadioButtonAndActionListener frame = new RadioButtonAndActionListener();
        frame.setVisible(true);
    }
}
