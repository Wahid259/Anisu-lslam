
package listener;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounterLayout1 extends JFrame{
    
    private Container c;
    private JLabel promptLabel, vowelLabel, aLabel, eLeabel, iLabel, oLabel, uLabel;
    private JTextArea inputTextArea;
    private JScrollPane scroll;
    
    VowelCounterLayout1() {
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Counting Vowel app");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        promptLabel = new JLabel("Enter The Text : ");
        promptLabel.setBounds(10,20,100,30);
        c.add(promptLabel);
        
        inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        
        scroll = new JScrollPane(inputTextArea);
        scroll.setBounds(110,20,450,100);
        c.add(scroll);
        
        vowelLabel = new JLabel();
        vowelLabel.setBounds(110,150,150,30);
        c.add(vowelLabel);
        
        aLabel = new JLabel();
        aLabel.setBounds(110,190,150,30);
        c.add(aLabel);
        
        eLeabel = new JLabel();
        eLeabel.setBounds(110,230,150,30);
        c.add(eLeabel);
        
        iLabel = new JLabel();
        iLabel.setBounds(110,270,150,30);
        c.add(iLabel);
        
        oLabel = new JLabel();
        oLabel.setBounds(110,310,150,30);
        c.add(oLabel);
        
        uLabel = new JLabel();
        uLabel.setBounds(110,350,150,30);
        c.add(uLabel);
        
        
    }
    
    public static void main(String[] args) {

        VowelCounterLayout1 frame = new VowelCounterLayout1();
        frame.setVisible(true);
    }
}
