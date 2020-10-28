
package table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo1 extends JFrame{
    
    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane scroll;
    
    private String[] cols = {"ID","Name","GPA"};
    private String[][] rows = {
        {"101","Wahid0","3.84"},
        {"102","Wahid1","3.74"},
        {"103","Wahid2","3.64"},
        {"104","Wahid3","3.34"},
        {"105","Wahid4","3.84"},
        {"106","Wahid5","3.74"},
        {"107","Wahid6","3.64"},
        {"108","Wahid7","3.34"},
        {"109","Wahid8","3.84"},
        {"1010","Wahid9","3.74"},
        {"1011","Wahi10","3.64"},
        {"1012","Wahid11","3.34"},
    
    
    };
    
    TableDemo1()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,750,450);
        this.setTitle("Table Demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        font = new Font("Arial", Font.BOLD,22);
        
        label = new JLabel("Students Details");
        label.setFont(font);
        label.setBounds(250,20,200,50);
        c.add(label);
        
        table = new JTable(rows,cols);
        table.setSelectionBackground(Color.pink);
        //table.setEnabled(false);//table er data change kora jabe na
        
        scroll =new JScrollPane(table);
        scroll.setBounds(50,80,600,150);
        c.add(scroll);
    
    }
    
    public static void main(String[] args) {
        
        TableDemo1 frame = new TableDemo1();
        frame.setVisible(true);
    }
}
