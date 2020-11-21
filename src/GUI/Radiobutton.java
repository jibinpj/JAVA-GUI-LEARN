package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radiobutton extends JFrame implements ActionListener {
    /*JRadioButton = one or more buttons in a grouping in which
    only 1 may be selected per group
   */JRadioButton radiobuton, radiobuton1, radiobutton3;
   ImageIcon pizza = new ImageIcon("pizzaimg");// setting images as different names
   ImageIcon hotdog = new ImageIcon("hotdogimg");
   ImageIcon burger = new ImageIcon("burgerimg");

    Radiobutton(){

        ButtonGroup buttonGroup = new ButtonGroup(); // created a buttongroup for select only one at a time
        radiobuton = new JRadioButton("PIZZA");    // creating radiobutton as different name
        radiobuton1 = new JRadioButton("HOTDOG");
        radiobutton3 = new JRadioButton("BURGER");
        //radiobuton.setIcon(pizza); // adding images as suitable to radiobutton
        //radiobuton1.setIcon(hotdog);
       // radiobutton3.setIcon(burger);
        radiobuton.addActionListener(this); // adding actionListener to radiobutton
        radiobuton1.addActionListener(this);
        radiobutton3.addActionListener(this);
        buttonGroup.add(radiobuton); buttonGroup.add(radiobuton1);
        buttonGroup.add(radiobutton3); // adding button group to radiobuttons
        this.add(radiobuton); //aading radiobutton to frame
        this.add(radiobuton1);
        this.add(radiobutton3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== radiobuton){ // set as litenser when we click radiobutton
            this.dispose();

            int close = JOptionPane.showConfirmDialog(null, "you ordered PIZZA", "pizza",JOptionPane.INFORMATION_MESSAGE);
            if (close == 1){
                new Radiobutton();
            }else if(close == 0){
                JOptionPane.showMessageDialog(null, "THANKS");
            }
        }else if (e.getSource()==radiobuton1){
            this.dispose();

            int close = JOptionPane.showConfirmDialog(null, "you ordered HOTDOG", "pizza",JOptionPane.INFORMATION_MESSAGE);
            if (close == 1){
                new Radiobutton();
            }else if(close == 0){
                JOptionPane.showMessageDialog(null, "THANKS");
            }
        }

    }

    public static void main(String[] args){
        new Radiobutton();
    }



}
