package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menubar extends JFrame implements ActionListener {
    JMenuBar menubr;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;
    ImageIcon loadicon;
    ImageIcon saveicon;
    ImageIcon Exiticon;
    Menubar(){
        menubr = new JMenuBar(); // importing Menubar
        loadicon = new ImageIcon("path"); // uploading a image icon in loadicon
        saveicon = new ImageIcon("path");// """
        Exiticon = new ImageIcon("Path");//  """
        filemenu = new JMenu("FILE");//  file menubar creating
        editmenu = new JMenu("EDIT");// edit menu bar creating
        helpmenu = new JMenu("HELP");// help menu bar creating
        load = new JMenuItem("LOAD"); // load item creating
        save = new JMenuItem("SAVE");// save item creating
        exit = new JMenuItem("EXIT");// exit item creating
        load.setIcon(loadicon); //  loading image icon in load item
        save.setIcon(saveicon);// save image icon in save item
        exit.setIcon(Exiticon);// exiting icon adding
        filemenu.setMnemonic(KeyEvent.VK_F); /// if we click alt + F then fileMenu appear
        editmenu.setMnemonic(KeyEvent.VK_E);// if we click alt + E then edit Menu bar appear
        load.setMnemonic(KeyEvent.VK_L);// if we click when file menu appear to L then load
        save.setMnemonic(KeyEvent.VK_S); // if we click S after filemenu appeared
        load.addActionListener(this);// added a actionListener to load
        save.addActionListener(this);// added save to ActionListener to save
        exit.addActionListener(this);// also added actionListener
        filemenu.add(load);// added load item to fileMenu
        filemenu.add(save);// added save item in saveMenu
        filemenu.add(exit); // added exit in exit menu
        menubr.add(filemenu);// added  filemenu to menubar
        menubr.add(editmenu);// added editmenu to menubar
        menubr.add(helpmenu);// added helpmenu to menubar
        this.setJMenuBar(menubr); // setting menubar to frame
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== load){ // if clicked load button then it would print
            System.out.println("loading menu");
        }else if (e.getSource()== save){ // if clicked save menu it would be print
            System.out.println("saving item");
        }else if (e.getSource()== exit){ // if we clicked exit then it would close program
            System.out.println("EXITED");
            System.exit(0); // for closing program
        }

    }

    public static void main(String[] args){
        new Menubar();
    }


}

