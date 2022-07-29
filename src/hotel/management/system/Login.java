package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author sts
 */
public class Login extends JFrame implements ActionListener{
    
    JTextField username;
    JPasswordField password;
    JButton login,cancel;
    
    Login()
    {
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        
        JLabel user= new JLabel("USERNAME");
        user.setBounds(40,20,100,30);
        add(user);
        
        username= new JTextField();
        username.setBounds(150,20,150,30);
        add(username);
        
        JLabel pass= new JLabel("PASSWORD");
        pass.setBounds(40,70,100,30);
        add(pass);
        
        password= new JPasswordField();
        password.setBounds(150,70,150,30);
        add(password);
        
        login=new JButton("LOGIN");
        login.setBounds(40,150,120,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        cancel=new JButton("CANCEL");
        cancel.setBounds(180,150,120,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3= new JLabel(i3);
        l3.setBounds(350,10,200,200);
        add(l3);
        
        
//        setBounds(500,200,600,300);
        setVisible(true);
        
        setSize(600,300);
        setLocation(600,350);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login)
        {
            String user=username.getText();
            String pass=password.getText();
            
            try{
                Conn c= new Conn();
                
                String query = "select * from login where username = '" + user + "' and password = '"+ pass +"'";
                ResultSet rs=c.s.executeQuery(query);
                
                if(rs.next())
                {
                    setVisible(false);
                    new Dashboard();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                }
                }
            catch(Exception e)
                {
                    e.printStackTrace();
                }
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Login();
    }
}
