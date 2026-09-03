import javax.swing.*;
import java.awt.*;
public class gui_6_Panel {
    JFrame frame;
    JPanel panel1,panel2,panel3;
    public gui_6_Panel( ) {
        frame = new JFrame();
        frame.setTitle("Panel");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1500);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
    void Panel1(){
        panel1.setBackground(new Color(0x123312));
        panel1.setBounds(0,0,250,250);
        //it    needs    x,y,width,height
        JLabel label = new JLabel();
        label.setText("Panel 1");
        label.setFont(new Font("MV Boli",Font.BOLD,25));
        label.setForeground(Color.white);
        //Here text will appear in the center of the panel because we have not set any layout for the panel
        panel1.add(label);
    }
    void Panel2(){
        panel2.setBackground(new Color(0x123321));
        panel2.setBounds(250,0,250,250);
        panel2.setLayout(new BorderLayout());
        JLabel label = new JLabel();
        label.setText("Panel 2");
        label.setFont(new Font("MV Boli",Font.BOLD,25));
        label.setForeground(Color.white);
        label.setVerticalAlignment(SwingConstants.BOTTOM);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        //here text will appear in the bottom left corner of the panel because we have set the layout of the panel to BorderLayout
        panel2.add(label);
    }
    void Panel3(){
        panel3.setBackground(new Color(0x321123));
        panel3.setBounds(0,250,500,250);
        panel3.setLayout(null);
        JLabel label = new JLabel();
        label.setText("Panel 3");
        label.setFont(new Font("MV Boli",Font.BOLD,25));
        label.setForeground(Color.white);
        label.setBounds(100,100,200,50);
        //here text will appear in the center of the panel because we have set the layout of the panel to null and set the bounds of the label
        panel3.add(label);
    }    

    public static void main(String args[]){
        gui_6_Panel ob = new gui_6_Panel();
        ob.Panel1();
        ob.Panel2();
        ob.Panel3();
        ob.frame.setVisible(true);
    }
}
