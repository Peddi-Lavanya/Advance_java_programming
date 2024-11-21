import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Student_Application extends Frame implements ActionListener{
    String msg;
    Button b=new Button("save");
    Label ll1=new Label("Student details",Label.CENTER);
    Label l1=new Label("Name",Label.LEFT);
    Label l2=new Label("Age",Label.LEFT);
    Label l3=new Label("Sex(M/F)",Label.LEFT);
    Label l4=new Label("Address",Label.LEFT);
    Label l5=new Label("Course",Label.LEFT);
    Label l6=new Label("Semister",Label.LEFT);
    Label l7=new Label("",Label.RIGHT);
    TextField t1=new TextField();
    Choice c1=new Choice();
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox cb1=new Checkbox("Male",false,cbg);
    Checkbox cb2=new Checkbox("Female",false,cbg);
    TextArea t2=new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
    Choice course =new Choice();
    Choice semister=new Choice();
    Choice age=new Choice();
    public Student_Application(){
        addWindowListener(new myWindowAdapter());
        setBackground(Color.gray);
        setForeground(Color.black);
        setLayout(null);
        add(ll1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(t1);
        add(t2);
        add(cb1);
        add(cb2);
        add(course);
        add(semister);
        add(age);
        add(b);
        b.addActionListener(this);
        add(b);
        course.add("MSc computer science");
        course.add("MCA");
        course.add("MBA");
        course.add("MCom");
        course.add("MSc maths");
        semister.add("1");
        semister.add("2");
        semister.add("3");
        semister.add("4");
        semister.add("5");
        semister.add("6");
        age.add("17");
        age.add("18");
        age.add("19");
        age.add("20");
        age.add("21");
        l1.setBounds(25,65,90,20);
        l2.setBounds(25,90,90,20);
        l3.setBounds(25,120,90,20);
        l4.setBounds(25,185,90,20);
        l5.setBounds(25,260,90,20);
        l6.setBounds(25,290,90,20);
        l7.setBounds(25,260,90,20);
        ll1.setBounds(10,40,280,20);
        t1.setBounds(120,65,170,20);
        t2.setBounds(120,185,170,60);
        cb1.setBounds(120,120,50,20);
        cb2.setBounds(170,120,60,20);
        course.setBounds(120,260,100,20);
        semister.setBounds(120,290,50,20);
        age.setBounds(120,90,50,20);
        b.setBounds(120,350,50,30);
    }
    public void paint(Graphics g){
        g.drawString(msg,200,450);
    }
    public void  actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("save")){
            msg="Details saved";
            setForeground(Color.blue);
        }
    }
    public static void main(String args[]){
        Student_Application std=new Student_Application();
        std.setSize(500,500);
        std.setTitle("Student Registration form");
        std.setVisible(true);
    }
}
class myWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}