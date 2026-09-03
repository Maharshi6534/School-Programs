import javax.swing.*;
import java.awt.*;
class gui_1_basic{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("My GUI");    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        // frame.getContentPane().setBackground(Color.green);
        //                      or
        // frame.getContentPane().setBackground(new Color(0,2,5));//RGB colour comand
        //                      or
        frame.getContentPane().setBackground(new Color(0x13f453));//HexaDecimal colour comand
        
        
        JButton button = new JButton("Button");
        button.setBounds(50,50,100,50);
        frame.add(button);
        frame.setLayout(null);

        ImageIcon image = new ImageIcon(gui_1_basic.class.getResource("logo.jpg"));
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
    }
}   