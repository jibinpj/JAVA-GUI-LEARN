package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textfeild extends JFrame implements ActionListener {


    JTextField txtfld = new JTextField();
    JButton button = new JButton("Submit");
    textfeild(){

        this.add(button); /// adding button to frame
        txtfld.setPreferredSize(new Dimension(150,40)); // setting preferedsize
        txtfld.setBackground(Color.yellow); // textfeild color
        txtfld.setForeground(Color.red); // font color
        txtfld.setFont(new Font("Consolas", Font.BOLD,20));  // font setup
        txtfld.setCaretColor(Color.white);   /// blinging curser seting color

        button.addActionListener(this); // Adding ActionListener to button from frame

        this.setLayout(new FlowLayout()); /// setting layout for only show used frame
        this.add(txtfld);              /// adding Text-Feild to frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on red button pressed
        this.pack();                                         // only use for size that appear
        this.setVisible(true);                              //frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button){               /// if button pressed after reactions
           // System.out.println("welcome " +txtfld.getText());
            txtfld.setEditable(false);
            JOptionPane.showConfirmDialog(null,
                    "Welcome " + txtfld.getText() + " ",
                    "BOX", JOptionPane.YES_NO_CANCEL_OPTION);/// pop up message showing
            this.dispose();                //Clear frame from background
        }


    }

    public static void main(String[] args){
        new textfeild();
    }

}
