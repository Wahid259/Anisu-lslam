
package slideshowdemo;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo1 extends JFrame implements ActionListener{
    
    private CardLayout card;
    private Container c;
    private JPanel panel;
    private JButton previousButton, nextButton;
    private ImageIcon icon;
    private JLabel label;
    
    SlideShowDemo1()
    {
        initComponents();
        showImage();
    }
    
    public void showImage()
    {
        
        String[] imageNames = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg",};
        for (String n:imageNames) {
            icon = new ImageIcon("src/image/"+n);
            
            //resizing the image
            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);
            
            label = new JLabel(icon);
            panel.add(label);
        }
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("SlideShow demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        card = new CardLayout();
        
        panel = new JPanel(card);
        panel.setBounds(10,10,560,380);
        c.add(panel);
        
        previousButton = new JButton("Previous");
        previousButton.setBounds(10,400,100,50);
        c.add(previousButton);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(470,400,100,50);
        c.add(nextButton);
        
        previousButton.addActionListener(this);
        nextButton.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==previousButton)
        {
            card.previous(panel);
        }
        if(e.getSource()==nextButton)
        {
            card.next(panel);
        }
        
        
        
    }
    
    public static void main(String[] args) {
        SlideShowDemo1 frame = new SlideShowDemo1();
        frame.setVisible(true);
    }

    
    
}
