/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sts
 */
public class HotelManagementSystem extends JFrame implements ActionListener{
    
    HotelManagementSystem(){
//        setSize(1280,853); 
//        setLocation(100,0);
        setBounds(100,0,1280,753);
        setLayout(null);
        
        ImageIcon il= new ImageIcon(ClassLoader.getSystemResource("icons/hotel_homepage.jpg"));
        JLabel image= new JLabel(il);
        image.setBounds(0,0,1280,853);
        add(image);
        
        JLabel text= new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(429,265,900,90);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("serif", Font.BOLD,26));
        image.add(text);
        
        JButton next= new JButton("NEXT");
        next.setBounds(1120,673,150,50);
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.PLAIN,26));
        
        image.add(next);
        
        setVisible(true);
        
        while(true)
        {
            text.setVisible(false);
            try{
                Thread.sleep(300);
            } catch(Exception e){
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(300);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae){
            new Login().setVisible(true);
            this.setVisible(false);
                
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
    
}
