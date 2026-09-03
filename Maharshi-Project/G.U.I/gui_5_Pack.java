//to demonstrate the use of pack method to hold together the componets of frame and label
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class gui_5_Pack {
    JFrame frame;
    JLabel label;
    gui_5_Pack(){
        frame = new JFrame();
        label = new JLabel("Hello I am Maharshi Patel");
        //             or
        // label.setText("Hello");
        frame.setTitle("lable");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();//this will hold the componets of frame and label together and will not let them to be seperated
        //always remember to use pack method after adding all the components  
    }
    void lb(){
        ImageIcon img = new ImageIcon(gui_5_Pack.class.getResource("logo.jpg"));
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
        gui_5_Pack ob = new gui_5_Pack();
        ob.lb();
    }
}
