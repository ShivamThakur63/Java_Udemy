package Concepts.Java08.LamdaExpressions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class InActionListener {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLayout(null);  
        frame.setSize(300, 200);  


        JTextField tf=new JTextField();  
        tf.setBounds(80, 50,150,20);  
        JButton b=new JButton("click");  
        b.setBounds(120,100,70,30);  
        
        frame.add(b);
        frame.add(tf);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // LamdaExpression for ActionListener
        b.addActionListener(e -> tf.setText("        Hello World"));

        // Without ActionListener 

        /* 
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("        Hello World");            
            }
            
        });      
        
        */
    }
    
}
