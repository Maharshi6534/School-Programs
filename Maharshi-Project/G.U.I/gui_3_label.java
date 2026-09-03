/*
    this program is without bounds and code is not organised in constructer and method
 */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class gui_3_label {
    public static void main(String args[]){
        ImageIcon img = new ImageIcon(gui_3_label.class.getResource("logo.jpg"));
        JLabel label = new JLabel("Hello");
        //             or
        // label.setText("Hello");
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
        label.setIconTextGap(100);//to set the gap between the text and the image
        label.setBackground(Color.black);//to set the background color
        label.setOpaque(true);//to make the background color visible
        //theres a catch the whole window will be filled with the color if bounds are not set
        Border border = BorderFactory.createLineBorder(Color.green, 2);
        label.setBorder(border);

        JFrame frame = new JFrame();
        frame.setTitle("lable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,650);
        frame.add(label);
        frame.setVisible(true);
    }
}
