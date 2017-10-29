import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Panelka extends JFrame {
    public Panelka() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(110, 800);
        setLayout(null);
        getContentPane().setBackground(Color.black);
        setUndecorated(true);
        setType(JFrame.Type.UTILITY);
        
           
       
        
       
        JButton b1 = new JButton("Name");
        b1.setBounds(10, 10, 90, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setFocusable(false);
        
        
        JButton b2 = new JButton("Name");
        b2.setBounds(10, 45, 90, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setFocusable(false);
        
        
        JButton b3 = new JButton("Name");
        b3.setBounds(10, 80, 90, 30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setFocusable(false);
        
        JButton b4 = new JButton("Name");
        b4.setBounds(10, 115, 90, 30);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.setFocusable(false);
        
        JButton b5 = new JButton("Name");
        b5.setBounds(10, 150, 90, 30);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.setFocusable(false);
        
         
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        
        
        
        
         class My implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                   String s = e.getActionCommand();
                    if (e.getSource().equals(b1)) {
                        try {
                            Desktop.getDesktop().open(new File("C:\\Your path"));
                    } catch (IOException ex) {
                        Logger.getLogger(Panelka.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                    
                    else if (s.equals("Name")) {
                        try {
                            Desktop.getDesktop().open(new File("D:\\Your path\\Your path\\"));
                    } catch (IOException ex) {
                        Logger.getLogger(Panelka.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                    
                    else if (s.equals("Name")) {
                        try {
                            Desktop.getDesktop().open(new File("c:\\Your path"));
                    } catch (IOException ex) {
                        Logger.getLogger(Panelka.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                    
                    else if (s.equals("Name")) {
                        try {
                            Desktop.getDesktop().open(new File("d:\\Your path"));
                    } catch (IOException ex) {
                        Logger.getLogger(Panelka.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                    
                    else if (s.equals("Name")) {
                        try {
                            Desktop.getDesktop().open(new File("c:\\Your path"));
                    } catch (IOException ex) {
                        Logger.getLogger(Panelka.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                    
                    
                    
                    
                }
            }
            b1.addActionListener(new My());
            b2.addActionListener(new My());
            b3.addActionListener(new My());
            b4.addActionListener(new My());
            b5.addActionListener(new My());
            
        
        
    }
    
    public static void main(String[] args){

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Panelka.class.getName()).log(Level.SEVERE, null, ex);
        }
        Panelka p = new Panelka();
        p.setVisible(true);
    }
}
