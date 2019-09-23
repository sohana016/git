
package mainclass;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class MainClass {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public MainClass() {
        initGui();
    }
    
    public static void main(String[] args) {
       MainClass app = new MainClass();
       app.setComponents();
       
       SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               
           }
       });
       
    }
 public void initGui(){
        //Step 1 Configure Main JFrame
          mainFrame = new  JFrame("Event Pratice");
           mainFrame.setBounds(100, 100, 400, 600);
            mainFrame.setLayout(new GridLayout(3,1));
             mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
        //Step 2 Create Components
        headerLabel = new JLabel("",JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        
        
        //Light weight container
        controlPanel = new JPanel(new FlowLayout());
        
        //Add components into main frame
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        
    }

    public void setComponents(){
        headerLabel.setText("Header Section");
        statusLabel.setText("Status Section");
        
        JButton okButton = new JButton("OK");
        okButton.setActionCommand(" Invoked");
        JButton cancelButton = new JButton("Cancel");
        controlPanel.add(okButton);
        controlPanel.add(cancelButton);
        okButton.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Focused");
           
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Focused de");
            }
        });
        
         okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            statusLabel.setText("Ok Button Selected" + e.getActionCommand());
            
            }
        });
    cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Cancel Button Selected");
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    
    }    
}
