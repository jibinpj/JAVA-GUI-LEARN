package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseListener extends JFrame implements java.awt.event.MouseListener {
    JLabel label;
    MouseListener(){
        label = new JLabel();
        label.setBounds(50,50,250,100);
        label.setBackground(Color.red); //  added label to red color background
        label.setOpaque(true); // if this true then it will show
        label.addMouseListener(this); //adding mouse listener to label from implements
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,500);
        this.getContentPane().setBackground(Color.gray); // setted as gray color in frame color
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when a mouse button has been (pressed and released) on a component
        System.out.println("YOU CLICKED AND RELEASED");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("YOU PRESSED");
        label.setBackground(Color.yellow);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        System.out.println("YOU RELEASED");
        label.setBackground(Color.green);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("ENTERED");
        label.setBackground(Color.red);
    }
    @Override
    public void mouseExited(MouseEvent e) {
       // Invoked when mouse exits a components
        System.out.println("EXITED");
        label.setBackground(Color.black);
    }

    public static void main(String[] args){
        new MouseListener();
    }
}
