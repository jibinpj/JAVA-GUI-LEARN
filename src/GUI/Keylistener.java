package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistener extends JFrame implements KeyListener { // adding keylistener to identify keyboard moves

    JLabel label;
    ImageIcon rocket; // adding image to label

    Keylistener(){

        rocket = new ImageIcon("path");
      //  label.setIcon(rocket);   // adding image to label
        label = new JLabel();
        label.setBounds(0,0,100,100); // setting bound for null frame
        label.setBackground(Color.red); // adding background
        label.setOpaque(true); // this will help to show background in label
        this.add(label); // adding label to frame
        this.getContentPane().setBackground(Color.BLACK); // adding background to frame
        this.addKeyListener(this); // adding keylistener to frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // setting empty frame to set manually
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Keytyped =Invoked when a  key is tyoed .  Uses keychar, char output

        switch (e.getKeyChar()){ // using switch case for moving label with letters    // from top left corner
            case 'a' : label.setLocation(label.getX()-50, label.getY()); // if we press 'a' then label x dir - 50
            break;
            case 's' : label.setLocation(label.getX(),label.getY()+50); // if we press 's' then label y dir + 50
            break ;
            case 'd' : label.setLocation(label.getX()+50, label.getY());
            break;
            case 'w' : label.setLocation(label.getX(), label.getY()-50);
            break;
        }

    }
    @Override
    public void keyPressed(KeyEvent e) {
        //KeyPressed = Invoked when a physical key is pressed down . Uses Keycode, int output
        switch (e.getKeyCode()){  // using switch case for move label by numeric code of letter
            case 65 : label.setLocation(label.getX()-50, label.getY());
                break;
            case 83 : label.setLocation(label.getX(),label.getY()+50);
                break ;
            case 68 : label.setLocation(label.getX()+50, label.getY());
                break;
            case 87 : label.setLocation(label.getX(), label.getY()-50);
                break;
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {  // after we release button this will print
        //Keyreleased = called whenever a button is released

        System.out.println("letter we pressed : " + e.getKeyChar());
        System.out.println("number we pressed code : " + e.getKeyCode());



    }

    public static void main(String[] args){
        new Keylistener();
    }
}


