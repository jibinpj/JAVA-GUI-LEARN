package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Filechooser  extends JFrame implements ActionListener {
    // JFilechooser = A GUI mechanism that let's user choose a file (helpful for opening and saving files)


    JButton button;
    Filechooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("select File");
        button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== button){
            JFileChooser filechooser = new JFileChooser(); // file choose opend here
            int reponse = filechooser.showOpenDialog(null);// save the int to response and file chooser is show open dialog
            if(reponse == JFileChooser.APPROVE_OPTION){// if file choose press open
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());// print the selectedfile directory
                System.out.println(file);
            }

        }


    }

   public static void main(String[] args){
        new Filechooser();

    }
}
