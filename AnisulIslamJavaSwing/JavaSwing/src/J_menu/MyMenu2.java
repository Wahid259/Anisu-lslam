
package J_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu2 extends JFrame implements ActionListener{
    
    private JMenuBar menubar;
    private JMenu file, edit, help;
    private JMenuItem newItem, openItem, exitItem, cutItem, copyItem, pastItem, selectAllItem;
    
    MyMenu2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,100,600,500);
        this.setTitle("Menu Demo");
        
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pastItem = new JMenuItem("Pase");
        selectAllItem = new JMenuItem("Select All");
        
        file.add(newItem);
        file.add(openItem);
        file.add(exitItem);
        
        edit.add(cutItem);
        edit.add(copyItem);
        edit.add(pastItem);
        edit.add(selectAllItem);
        
        newItem.addActionListener(this);
        exitItem.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == newItem)
        {
            JFrame newframe = new JFrame();
            newframe.setVisible(true);
            newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newframe.setBounds(300,100,600,500);
            newframe.setTitle("New frame");
            
        }
        else if(e.getSource() == exitItem)
        {
            
            System.exit(0);
            
            
        }
        
    }
    
    public static void main(String[] args) {
        
        MyMenu2 frame = new MyMenu2();
        frame.setVisible(true);
    }

    
    
}
