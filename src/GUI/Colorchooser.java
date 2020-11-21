package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Colorchooser extends JFrame implements ActionListener {
//JColorChooser = A GUI mechanism that let's a user choose a color
    JButton button;
    JLabel label;
    JButton fontcolor;
    Colorchooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("BGColor"); // setting a bgcolor button
        label = new JLabel("HELLO WORLD"); // setting a new label for text and background
        fontcolor = new JButton("FONTCOLOR"); // setting a color button
        label.setFont(new Font("MV BOLI", Font.BOLD,30)); // setting font size
        label.setBackground(Color.white); // setting labels background white
        label.setForeground(Color.BLACK); // setting font color black
        label.setOpaque(true); // for set background visibility
        button.addActionListener(this); // adding ActionListener to button
        fontcolor.addActionListener(this); // adding ActionListener to font color
        this.setLayout(new FlowLayout()); // setting FlowLayout
        this.add(fontcolor);
        this.add(label);
        this.add(button);
        this.setVisible(true);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){  // when we click button after reactions
            Color color1 = JColorChooser.showDialog(null,"COLORBG",Color.white); // importing color for select
            label.setBackground(color1); // setting background color by color1 early mentioned
        } else if(e.getSource()== fontcolor){ // if we press Fontcolor button
            Color color2 = JColorChooser.showDialog(null, "FONTCOLOR", Color.BLACK);
            label.setForeground(color2); // changing
        }

    }

    public static  void main(String[] args){
        new Colorchooser();
    }
}
