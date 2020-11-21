package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame implements ActionListener {
    // JCheckbox = A GUI component  that can be selected or deselected
    JButton button = new JButton();;
    JCheckBox chekBox;
    ImageIcon picture1;
    ImageIcon picture2;
    CheckBox(){
        picture1 = new ImageIcon("path"); // importing image as picture1
        picture2 = new ImageIcon("path2");// importing image as picture2
        button.setText("SUBMIT");  /// button setting as submit name
        button.addActionListener(this); /// adding actionlistener to button
        chekBox = new JCheckBox("im not a robot");/// checkbox mentioning and adding text to it
        chekBox.setFont(new Font("Consolas", Font.BOLD,20)); // checkbox text font sizing
        chekBox.setFocusable(false); // text of checkbox rectangle shape outer removing
       // chekBox.setIcon(picture1); /// before ticking the checkbox image
        chekBox.setSelectedIcon(picture2); // after ticking the checkbox image
        this.add(chekBox);this.add(button); // adding button and checkbox to the frame
        this.setLayout(new FlowLayout()); // use before pack for show the frame full content
        this.pack(); // use only nessecary frame for contents
        this.setVisible(true); // settinf visiblity
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(chekBox.isSelected()); // print if ticked ot unticked as true or false
        }



    }


    public static void main(String[] args){
        new CheckBox();
    }
}
