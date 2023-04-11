package work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyWindow {
    public static void main(String[] args) {
        // window :create  object  of Jframe
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        //create button and add jframe
        JButton button = new JButton("click me !!");

        //using anonymous class
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button click ");
//                JOptionPane.showMessageDialog(null,"Hey, Button click");
//            }
//        });
//        using lambda expression
        button.addActionListener((ActionEvent e) -> {
//            button.addActionListener(( e)-> {
            /* Java compiler also inter the type of variabl passed in arguments, hence type is optional. */
            System.out.println("Button click ");
            JOptionPane.showMessageDialog(null, "Hey, Button click");
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
