/* this can be useful during the development of a GUI application. 
It is a simple Java Swing application that creates a window with a specified size, background color, and an icon image. 
The window will close when the user clicks the close button.
*/
import java.awt.*;
import javax.swing.*;
class gui_2_Basic extends JFrame{
    gui_2_Basic(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My GUI");
        this.setSize(400, 300);
        this.getContentPane().setBackground(new Color(0x13f453));

        ImageIcon image = new ImageIcon(gui_2_Basic.class.getResource("logo.jpg"));
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }
    public static void main(String args[]){
        new gui_2_Basic();
    }
}