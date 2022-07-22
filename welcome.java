//This class created to display the title of project
package currencyconverter;
import javax.swing.*; //import JFrame library
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class welcome extends JFrame {
welcome() { //constructor
this.setLayout(null);//to set the Layout null
this.setLocation(200, 50);
call(); //call the function call()
this.setVisible(true); //to set frame as visible
}
void call() {
this.setSize(650, 550); //set the size of the window
this.setResizable(false); //for fixed window size
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the
application
this.setIconImage(new
ImageIcon(getClass().getResource("icon.png")).getImage());
this.getContentPane().setBackground(Color.LIGHT_GRAY);
this.setTitle("CURRENCY CONVERTER"); //to set the title
JButton b = new JButton(); //creating a button
b.setSize(600, 500); //setting the size of the button
b.setText("NEXT"); //setting the text in the button
3
b.setBounds(490, 400, 80, 30); //to set the bounds of button i.e,
the x-dimension,y-dimension,height and width
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
setVisible(false);
welcome2 w1 = new welcome2();
}
}
);
add(b); //add button to the frame
JLabel l = new JLabel(); //creating a new label
l.setFont(new Font("Tahome", 1, 30)); //set the label font
l.setText("CURRENCY CONVERTER"); //set the label text as
currency converter
l.setBounds(140, 230, 590, 50); //set the bound of label
add(l); //to add the label to frame
JLabel l1 = new JLabel(); //creating another label
l1.setIcon(new ImageIcon(getClass().getResource("icon.png")));
//to set the icon for the frame
l1.setBounds(268, 48, 250, 250); //to set the bounds for label
add(l1); //to add the label to the frame
}
public static void main(String args[]) {
new welcome(); //object creation
}
}