//This class is created to convert the different currencies
package currencyconverter;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class Project {
JFrame frame;
JLabel label1, label2, label3, label4;
JTextField text1, text2;
JComboBox combo1, combo2;
JButton btnConvert, btnClear;
JMenuBar mb;
JMenu edit, about;
JMenuItem copy, cc;
JTextField textField;
6
JTabbedPane tp;
Project() {
currencyFrame();
}
public void currencyControls() {
label1 = new JLabel("Select The Input Currency :");
//creating the first label and naming the label
label1.setBounds(120, 50, 160, 30);
//setting the bounds for the label(x axis,y axis,width,height)
label1.setForeground(Color.black);
frame.add(label1);
//adding the created label to the frame
String[] values1 = {"U.S Dollar", "Euro", "Japanese Yen", "Indian
Rupee", "Saudi Riyal"}; //array of string containing the input
Currencies
combo1 = new JComboBox(values1);
//creating a combobox to select the input currencies
combo1.setBounds(280, 50, 150, 30);
//set the bounds (x axis,y axis,width,height)
frame.add(combo1);
//adding the created combobox to the frame
label2 = new JLabel("Enter The Amount :");
//creating the second label and naming the label as enter the amount
label2.setBounds(150, 110, 150, 30); //setting the bounds for the
label(x axis,y axis,width,height)
label2.setForeground(Color.black);
frame.add(label2);
//adding the created label to the frame
text1 = new JTextField();
//creating the text field to enter the amount
7
text1.setBounds(270, 110, 150, 30);
//setting the bounds (x axis,y axis,width,height)
frame.add(text1);
//adding the created text field to the frame
label3 = new JLabel("Select The Output Currency :");
//creating the third label and naming the label as select the output
currency
label3.setBounds(120, 170, 180, 30);//setting the bounds for the
label(x axis,y axis,width,height)
label3.setForeground(Color.black);
frame.add(label3);
//adding the created label to the frame
String[] values2 = {"Swiss franc", "U.S Dollar", "Canadian
Dollar", "Chinese Yuan", "Indian Rupee"}; //array of string
containing the output Currencies
combo2 = new JComboBox(values2);
//creating a combobox to select the output currencies
combo2.setBounds(290, 170, 150, 30);
//set the bounds (x axis,y axis,width,height)
frame.add(combo2);
//adding the created combobox to the frame
btnConvert = new JButton("Convert");
//creating the button for convert
btnConvert.setBounds(230, 230, 100, 30);
//set the bounds for the button(x axis,y axis,width,height)
frame.add(btnConvert);
//adding the created button to the frame
label4 = new JLabel("Converted Amount :");
//creating the fourth label and naming the label as Converted amount
label4.setBounds(150, 290, 150, 30); //setting the bounds for the
label(x axis,y axis,width,height)
label4.setForeground(Color.black);
8
frame.add(label4);
//adding the created label to the frame
text2 = new JTextField();
//creating the text field to display the converted amount
text2.setBounds(270, 290, 150, 30);
//setting the bounds (x axis,y axis,width,height)
frame.add(text2);
//adding the created text field to the frame
btnClear = new JButton("Clear");
//creating the button for clear
btnClear.setBounds(230, 350, 100, 30);
//set the bounds for the button(x axis,y axis,width,height)
frame.add(btnClear);
//adding the created button to the frame
}
public void currencyActionListeners() {
btnClear.addActionListener(new ActionListener() {
//adding Action Listeners to perform an action method
public void actionPerformed(ActionEvent e) { //known
as actionPerformed for the clear button which clears the textfield
text1.setText(" ");
text2.setText(" ");
}
});
btnConvert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
double result;
9
String from = (String)
combo1.getItemAt(combo1.getSelectedIndex());//extract the value of from
String To = (String)
combo2.getItemAt(combo2.getSelectedIndex());//extract the value of to
double amount =
Double.parseDouble(text1.getText());//extract the value of the amount to
be converted
if (amount == (double) amount) { //check if the
amount is valid
if (!from.equals("Indian Rupee")) { //basecurrency
is an Indian rupee
double subres = (Math.round((amount *
basecurrency(from)) * 100)) / 100.0d; //calculate the numerical part
//and round off to two decimal places
result = (Math.round((subres /
basecurrency(To)) * 100)) / 100.0d;//convert the currency and round off to
two decimal places
} else { //if the currency to be converted from
itself is the base currency then
result = (Math.round((amount /
basecurrency(To)) * 100)) / 100.0d;
}
text2.setText((String.valueOf(result) + " " +
To));//output the result
} else { //if the amount is not valid show the
message
JOptionPane.showMessageDialog(frame, "Enter valid
amount ");
}
} catch (Exception ex) { //if any error in the calculation
then show the message
10
JOptionPane.showMessageDialog(frame, "Enter valid
amount ");
}
}
});
copy = new JMenuItem("Copy"); //menuitem copy
cc = new JMenuItem("Currency Converter"); //menuitem
mb = new JMenuBar(); //creating menu bar
edit = new JMenu("Edit"); //menu edit
about = new JMenu("About"); //menu about
edit.add(copy); //adding menuitem copy to edit menu
about.add(cc); //adding menu item currency converter to the about
menu
mb.add(edit); //adding menu edit to menubar
mb.add(about); //adding menu about to the menu bar
frame.add(mb); //adding menubar to the frame
frame.setJMenuBar(mb);
cc.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
frame.setVisible(false);
About ob = new About();
}
});
copy.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text2.selectAll(); //to select the text from the result
text2.copy(); //to copy the result to the clipboard
}
});
}
public double basecurrency(String s) { //to fetch the base currency
values
11
double a = 0;
switch (s) {
case "U.S Dollar":
a = 74.61;
break;
case "Euro":
a = 88.09;
break;
case "Japanese Yen":
a = 0.68;
break;
case "Canadian Dollar":
a = 59.14;
break;
case "Swiss franc":
a = 81.19;
break;
case "Chinese Yuan":
a = 11.52;
break;
case "Indian Rupee":
a = 1;
break;
case "Saudi Riyal":
a = 19.89;
break;
}
return a;
}
public void currencyFrame() {
frame = new JFrame("CURRENCY CONVERTOR"); //Creating a
new frame using JFrame
frame.setSize(650, 550); //set the
bounds for the frame
12
frame.setResizable(false); //to avoid the
user from resizing the frame
currencyControls();
currencyActionListeners();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//default method for closing the frame
frame.setLayout(null); //using
no layout managers
frame.setIconImage(new
ImageIcon(getClass().getResource("icon.png")).getImage()); // to set the
icon
frame.getContentPane().setBackground(Color.LIGHT_GRAY);
frame.setVisible(true);
frame.setLocation(200, 50);//making the frame visible
}
public static void main(String[] args) {
Project p1 = new Project();
}
}
