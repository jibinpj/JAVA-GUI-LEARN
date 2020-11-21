package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider  implements ChangeListener { // identity if any change occur in contents and showing
    //JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track
    JSlider slid;
    JFrame frame;
    JPanel panel;
    JLabel label;
    Slider(){
        frame = new JFrame("SLIDER");
        panel = new JPanel();
        label = new JLabel();
        slid = new JSlider(0,100,50);  /// from 0 to 100 and starting point is 50 setting slider
        slid.setPreferredSize(new Dimension(100,300)); // setting dimension for slider
        slid.setPaintTicks(true); // for showing small ticks corresponding at minor TickSpacing
        slid.setMinorTickSpacing(10); // setting as mark paint tick as distance 10
        slid.setPaintTrack(true); // setting paint track for major
        slid.setMajorTickSpacing(25); // setting main big line as 25 distance from each value
        slid.setPaintLabels(true); // showing numeric at the major tick line corresponding to tick spacing rate
        slid.setFont(new Font("MV BOLI", Font.BOLD,15)); // setting font of numeric
        slid.setOrientation(SwingConstants.VERTICAL); // setting slider to vertical look also top and bottom etc
        slid.addChangeListener(this); // adding change listener to slider
        label.setFont(new Font("MV BOLI", Font.BOLD,25)); // setting font to label to mark
        panel.add(slid); // adding slider to panel
        panel.add(label); // adding label to panel
        frame.add(panel); // adding panel to frame
        frame.setVisible(true);
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void stateChanged(ChangeEvent e) { // change will listened here and showing
        label.setText("°C = " +slid.getValue()); // this will help showing the text at frame
    }
    public static void main(String[] args){
        new Slider();
    }


}
