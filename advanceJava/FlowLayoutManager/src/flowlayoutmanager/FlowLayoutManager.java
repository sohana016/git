/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayoutmanager;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author User
 */
public class FlowLayoutManager {

    static JFrame aWindow = new JFrame("FlowLayout Practice");
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
    aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.width/2);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Flow Layout
//    FlowLayout flow = new FlowLayout();
//        Container content = aWindow.getContentPane();
//        content.setLayout(flow);
//        for(int i = 1;i <= 6;i++){
//            content.add(new JButton("Press " + i));
//            aWindow.setVisible(true);
//        }
   //BordeerLayout 
   
//   BorderLayout border = new BorderLayout();
//   Container content =  aWindow.getContentPane();
//   content.setLayout(border);
//    EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
//    JButton button;
//    content.add(button = new JButton("East"),BorderLayout.EAST);
//    button.setBorder(edge);
//    button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                System.out.println("Hit East");
//            
//            }
//        });
//    
//    content.add(button = new JButton("WEST"),BorderLayout.WEST);
//    button.setBorder(edge);
//    content.add(button = new JButton("North"),BorderLayout.NORTH);
//    button.setBorder(edge);
//    content.add(button = new JButton("South"),BorderLayout.SOUTH);
//    button.setBorder(edge);
//    content.add(button = new JButton("Center"),BorderLayout.CENTER);
//    button.setBorder(edge);
//    aWindow.setVisible(true);
        GridLayout grid = new GridLayout(3,4,30,20);
        Container content = aWindow.getContentPane();
        content.setLayout(grid);
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        JButton button = null;
        for(int i = 1; i <= 6;i++){
            content.add(button = new JButton("Press "+i));
            button.setBorder(edge);
        }
    aWindow.pack();
    aWindow.setVisible(true);
    }
    
}
