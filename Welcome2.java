//This class is created to display "WELCOME TO CURRENCY CONVERTER"
package currencyconverter;
4
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //import JFrame library
public class welcome2 extends JFrame {
welcome2() { //construtor
this.setTitle("CURRENCY CONVERTER");//to set the title
this.setLayout(null); // set the layout as null
call2(); //call the function call2()
this.setVisible(true); //to set the frame as visible
}
void call2() {
this.setSize(650, 550); //set the size of the window
this.setLocation(200, 50);
this.setResizable(false); //for fixed window size
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the
application
this.setIconImage(new
ImageIcon(getClass().getResource("icon.png")).getImage());//to set the
icon for frame
this.getContentPane().setBackground(Color.black);
JLabel l3 = new JLabel(); //create a new label
l3.setFont(new Font("Tahome", 1, 20)); //to set the font for label
l3.setText("WELCOME TO CURRENCY CONVERTER");//set the text for
label
l3.setForeground(Color.black);
l3.setBounds(130, 196, 590, 50);//set the bounds for the label
add(l3);//add the label to the frame
Timer timer = new Timer(1000, new ActionListener() { //create a
timer object and set the time
//and action to be performed after the above time is elapsed
@Override
5
public void actionPerformed(ActionEvent e) {
setVisible(false); //to hide this frame
Project p = new Project();//to create new object
}
});
timer.setRepeats(false);//to prevent the repetition of the timer
timer.start();//to start the timer
}
public static void main(String args[]) {
new welcome2(); //object creation
}
}
