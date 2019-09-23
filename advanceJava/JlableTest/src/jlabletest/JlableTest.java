/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabletest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class JlableTest {
    private static JFrame mainWindow = new JFrame();

    public JlableTest() {
    prepareGui();
    
    }
    public void prepareGui(){
        mainWindow.setBounds(100, 200, 400, 400);
        mainWindow.setTitle("Jlable Patice");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel headerLable = new JLabel("",JLabel.CENTER);
        JButton button  = new JButton("Submit");
        JCheckBox cBox = new JCheckBox();
        cBox.setBounds(0, 0, 20, 30);
        button.setBounds(20, 30, 80, 40);
        headerLable.setText("Header");
        headerLable.setSize(60, 50);
        System.out.println("Size "+ headerLable.getLocation().getX());
        headerLable.setBackground(Color.red);
        headerLable.setForeground(Color.red);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Hit submit");
            }
        });
        mainWindow.add(cBox);
        mainWindow.add(button);
        
        mainWindow.add(headerLable);
        mainWindow.setLayout(new GridLayout(1,3));
        
    
    }
    
    public void showHeader(){
       
    mainWindow.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
   
   JlableTest j1 = new JlableTest();
   j1.showHeader();
    
    
    }
    
}
