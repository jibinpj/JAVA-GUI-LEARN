package GUI;
import  java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragandDrop extends JFrame {

                                   /*drag and drop setting */

    public class Dragpanel extends JPanel{


        ImageIcon image = new ImageIcon("C:\\Users\\jibin\\Desktop\\emoji.png");
        final int WIDTH = image.getIconWidth();
        final int HEIGHT = image.getIconHeight();
        Point imageCorner;
        Point prevPt;

        Dragpanel(){
            imageCorner = new Point(0,0);
            ClickListener clickListener = new ClickListener();
            DragListener dragListener = new DragListener();
            this.addMouseListener(clickListener);
            this.addMouseMotionListener(dragListener);


        }

        public void paintComponent (Graphics g){
            super.paintComponent(g);
            image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());

        }

        private  class ClickListener extends MouseAdapter{
            public void mousePressed(MouseEvent e){
                prevPt = e.getPoint();
            }

        }
                                 /* drag setting here */
        private class DragListener extends MouseMotionAdapter{
            public void mouseDragged(MouseEvent e){
                Point currentPt = e.getPoint();
                imageCorner.translate(
                        (int)(currentPt.getX() - prevPt.getX()),
                        (int)(currentPt.getY() - prevPt.getY())
                );
                prevPt = currentPt;
                repaint();
            }

        }


    }
                            /* Frame of the program */
    DragandDrop(){

        Dragpanel drag = new Dragpanel();

        this.add(drag);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);

    }



    public static void main(String[] args){
        new DragandDrop();
    }
}
