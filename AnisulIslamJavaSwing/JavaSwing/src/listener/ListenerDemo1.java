
package listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerDemo1 extends JFrame{
    
    private Container c;
    private JButton redButton, greenButton, blueButton;
    
    ListenerDemo1() 
    {
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);
        
        //creating and adding button1
        redButton = new JButton("RED");
        redButton.setBounds(50,50,100,50);
        c.add(redButton);
        
        //creating and adding button2
        greenButton = new JButton("GREEN");
        greenButton.setBounds(50,110,100,50);
        c.add(greenButton);
        
        //creating and adding button3
        blueButton = new JButton("BLUE");
        blueButton.setBounds(50,170,100,50);
        c.add(blueButton);
        
        redButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                c.setBackground(Color.RED);
            }
        
        });
        
        greenButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                c.setBackground(Color.GREEN);
            }
        
        });
        
        blueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                c.setBackground(Color.BLUE);
            }
        
        });
        
    }
    public static void main(String[] args) {
        
        ListenerDemo1 frame = new ListenerDemo1();
        frame.setVisible(true);
    }
}
