import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Product extends JFrame implements ListSelectionListener{
JLabel jl;
JList jl1;
JTextField jtf;
String name[]={"Books","pencil","pen","sharpner","Scale"};
public Product(){
Container c=getContentPane();
c.setLayout(new BorderLayout());
jl=new JLabel("select a product");
c.add(jl,BorderLayout.NORTH);
jl1=new JList(name);
jl1.addListSelectionListener(this);
c.add(jl1,BorderLayout.CENTER);
jtf=new JTextField(15);
c.add(jtf,BorderLayout.SOUTH);
}
public void valueChanged(ListSelectionEvent e){
int i=jl1.getSelectedIndex();
if(i==0){
jtf.setText("The price of the books are Rs100 only");
}
else if(i==1){
jtf.setText("the price of pencil is Rs 25 only");
}
else if(i==2){
jtf.setText("the price of pen is just Rs30 only");
}
else if(i==3){
jtf.setText("the price of sharpner is just Rs15 only");
}
else if(i==4){
jtf.setText("the price of scale is just Rs 20only");
}
else{
jtf.setText("please select the product ");
}
}
public static void main(String args[]){
Product p=new Product();
p.setSize(500,500);
p.setTitle("products");
p.setVisible(true);
p.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}