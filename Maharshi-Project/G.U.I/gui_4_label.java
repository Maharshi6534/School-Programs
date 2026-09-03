/*
    this program is with bounds and code organised in constructer and method
*/

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
public class gui_4_label {
    JFrame frame;
    JLabel label;
    gui_4_label(){
        frame = new JFrame();
        label = new JLabel("Hello");
        //             or
        // label.setText("Hello");
        frame.setTitle("lable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,650);
        frame.setLayout(null);//this will clear the frame and with setting bounds we wouldn't be able to label
        label.setBounds(100,100,500,400);//this will sets bouds for the label to appear in the frame 
        //this is      x, y, width, height
        frame.add(label);
        frame.setVisible(true);
    }
    void lb(){
        ImageIcon img = new ImageIcon(gui_4_label.class.getResource("logo.jpg"));
        label.setIcon(img);
        
        label.setHorizontalTextPosition(JLabel.CENTER);//to set the theposition of the text  horizontally
        label.setVerticalTextPosition(JLabel.TOP);//to set the theposition of the text  vertically
        label.setHorizontalAlignment(JLabel.CENTER);//to set the theposition of the label  horizontally
        label.setVerticalAlignment(JLabel.TOP);//to set the theposition of the label  vertically

        //this  positions can be placed top, bottom, left, right, center
        // label.setForeground(new Color(0x123450)); ,for hexadecimal
        // label.setForeground(new Color(20,20,20)); ,forRGB
        label.setForeground(Color.orange);
        
        label.setFont(new Font("MV Boli",Font.PLAIN,22));//to set font's script, style and size
        
        label.setIconTextGap(-25);//to set the gap between the text and the image
        
        label.setBackground(Color.black);//to set the background color
        label.setOpaque(true);//to make the background color visible
        //theres a catch the whole window will be filled with the color if bounds are not set

        Border border = BorderFactory.createLineBorder(Color.green, 2);
        label.setBorder(border);
    }
    public static void main(String args[]){
        gui_4_label ob = new gui_4_label();
        ob.lb();
    }
}
