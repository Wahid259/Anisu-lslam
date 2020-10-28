
package window_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowListenerDemo1 extends JFrame{
    
    private Container c;
    
    WindowListenerDemo1()
    {
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("Window Listener Demo");
        
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent we) {
                
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent we) {
                
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent we) {
                
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                
                System.out.println("windowDeactivated");
            }
        
        
        });
    }
    
    public static void main(String[] args) {
        
        WindowListenerDemo1 frame = new WindowListenerDemo1();
        frame.setVisible(true);
    }
}
