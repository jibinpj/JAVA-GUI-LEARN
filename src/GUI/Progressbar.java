package GUI;

import javax.swing.*;
import java.awt.*;

public class Progressbar {
    // progress bar = visual aid to let the user know that an operation is processing

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    Progressbar() {

        bar.setValue(0); // setting progressbar value to start from 0
        bar.setBounds(0,0,400,50); // setting bounds for showing content in null layout
        bar.setStringPainted(true); // this will help to showing the numeric and strings in progress bar
        bar.setFont(new Font("MV BOLI",Font.BOLD,20)); // changing font to visible more clearly
        bar.setForeground(Color.blue); // the moving progress bar will update this color
        bar.setBackground(Color.red); // change its background of progressbar
        frame.add(bar);// progressbar added to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        fill(); // just a function to move the progress bar
    }
    public void fill()  { // creating a Function to move the progress bar percentage
        int counter = 0; /// created a integer to while loop
        while(counter<= 100){ // stop counter if counter is equal or less than hundred c
            bar.setValue(counter);// progressbar value set as moving counter integer
            try { // try
                Thread.sleep(1000); // for slowly moving progress bar
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            counter+=10; // add 10++ up to 100
        }
        bar.setString("SUCCESSFULLY COMPLETED"); // at end show this string print in progressbar

    }

    public static void main(String[] args) throws InterruptedException {
        new Progressbar();
    }



}
