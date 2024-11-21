import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<applet code ="Table1"width=300 height=300>
</applet>*/
public class Table1 extends JApplet
{
JTable jtb;
JScrollPane jsp;
public void init(){
Container c= getContentPane();
c.setLayout(new BorderLayout());
String colHeads[]={"Sr.no","Name","phone no"};
Object data[][]={{"1","Lava","123456"},
		{"2","abby","654321"},
		{"3","eshu","789456"},
		{"4","sanju","654987"},
		{"5","joy","123789"},
		{"6","ram","789123"},
		{"7","krishn","456789"},
		{"8","radha","456123"},
		{"9","hanuman","789456"},
		{"10","draupadi","9259554"}};
jtb=new JTable(data,colHeads);
jsp=new JScrollPane(jtb);
c.add(jsp);
}
}