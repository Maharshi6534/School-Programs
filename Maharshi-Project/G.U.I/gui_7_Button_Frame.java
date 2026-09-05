import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class gui_7_Button_Frame extends JFrame implements ActionListener{
    JButton b1;
    JLabel l;
    gui_7_Button_Frame(){
        ImageIcon icon = new ImageIcon(gui_7_Button_Frame.class.getResource("icon.jpg"));
        ImageIcon icon2 = new ImageIcon(gui_7_Button_Frame.class.getResource("logo.jpg"));
        
        l = new JLabel();
        l.setIcon(icon2);
        l.setBounds(200,200,250,250);
        l.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Buttons");
        this.setLayout(null);
        this.setSize(400, 300);
        
        b1 = new JButton("Click me");
        b1.setBounds(100,100,200,150);
        //this are   x, y, width, height
        b1.addActionListener(this);
        b1.setFocusable(false);
        //with this the button cann't be focused when clicked or be controled by the keyboard 
        b1.setIcon(icon);
        b1.setHorizontalTextPosition(JButton.CENTER);
		b1.setVerticalTextPosition(JButton.BOTTOM);
		b1.setFont(new Font("Comic Sans",Font.BOLD,25));
        b1.setHorizontalTextPosition(JButton.CENTER);
		b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setForeground(Color.cyan);
		b1.setBackground(Color.lightGray);
		b1.setBorder(BorderFactory.createEtchedBorder());
        
        this.add(b1);
        this.add(l);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //code to be executed when button is clicked
        if(e.getSource() == b1){
            System.out.println("Button clicked");
            b1.setEnabled(false);
            l.setVisible(true);
            //here we are disabling the button after it is clicked and making the label visible
        }
    }
}