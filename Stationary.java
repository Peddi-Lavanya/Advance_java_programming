import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Stationary  extends JFrame implements ListSelectionListener {
   JLabel jl1;
   JList list;
   JTextField jtf;
   String name[]={"BOOKS","PEN","PENCIL","SHARPNER","SCALE"};
   public Stationary()
{
Container cp=getContentPane();
cp.setLayout(new BorderLayout());
jl1=new JLabel("Select a product");
cp.add(jl1,BorderLayout.NORTH);
list=new JList(name);
list.addListSelectionListener(this);
cp.add(list,BorderLayout.CENTER);
jtf=new JTextField(15);
cp.add(jtf,BorderLayout.SOUTH);
}
public void valueChanged(ListSelectionEvent le)
{
int i=list.getSelectedIndex();
if(i==0)
{
jtf.setText("The price of Books isRs.1000");
}
else if(i==1)
{
jtf.setText("The price of pen is Rs.50");
}
else if(i==2)
{
jtf.setText("The price of pencil is Rs.25");
}
else if(i==3)
{
jtf.setText("The price of sharpenerisRs.80");
}
else if(i==4)
{
jtf.setText("The price of scale is Rs.35");
}
else
{
jtf.setText("Select Item");
}
}
 public static void main(String args[]){
    Stationary p1=new Stationary();
    p1.setSize(500,500);
    p1.setVisible(true);
    p1.setTitle("Product");
    p1.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    
    
 }    
}
