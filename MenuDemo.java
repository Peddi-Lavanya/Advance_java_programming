import java.awt.*;
import java.awt.event.*;
class MenuDemo extends Frame implements ActionListener 
{
String label="";
MenuBar mb;
Menu m1,m2,m3;
MenuItem mi1,mi2,mi3;
MenuDemo()
{ 
this.setSize(300,300);
this.setVisible(true);
this.setTitle("myFrame");
this.setBackground(Color.green);
mb=new MenuBar();
this.setMenuBar(mb);
m1=new Menu("new");
m2=new Menu("option");
m3=new Menu("edit");
mb.add(m1);
mb.add(m2);
mb.add(m3);
mi1=new MenuItem("open");
mi2=new MenuItem("save");
mi3=new MenuItem("saveas");
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
}
public void actionPerformed(ActionEvent ae)
{ 
label=ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
Font f=new Font("arial",Font.BOLD,25);
g.setFont(f);
g.drawString("Selected item....."+label,50,200);
}
}
class Demo8
{
public static void main(String[] args)
{
MenuDemo f=new MenuDemo();
}
};
