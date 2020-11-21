package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class Combobox extends JFrame implements ActionListener {
    JComboBox combobx;
    Combobox(){ // JComboBox = A component that combines a button editable field and a drop-down list
        String [] animals = {"DOG", "ELEPHANT", "LION", "TIGER"}; // for combo we need to set a array
        combobx = new JComboBox(animals); // adding array to combo box
        combobx.addActionListener(this); //  adding ActionListener
        combobx.setEditable(true);// it will help to edit that we written in array
        System.out.println(combobx.getItemCount());//// print the total count
        combobx.addItem("FOX"); // for adding extra to combobox
        combobx.insertItemAt("BEAR", 3); // inserting new name at a index
        combobx.setSelectedIndex(0);// it will help always keep when combo on to be selected a preferred name
        combobx.removeItem("FOX"); // removing a mentioned object from combo
        combobx.removeItemAt(1); // this will remove a object from mentioned index
        this.add(combobx);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== combobx){ // Listener adding to combo box
            System.out.println(combobx.getSelectedIndex()); // for print the index that selected
            JOptionPane.showMessageDialog(null,combobx.getSelectedItem(),"INFO",JOptionPane.INFORMATION_MESSAGE);
            int index = combobx.getSelectedIndex(); // saving index to int format index
            if (index == 1){ // tried for is it work but worked
                System.out.println("your doing good");
            }
        }

    }



    public static void main(String[] args){

        new Combobox();

    }

}
