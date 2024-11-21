import java.awt.*;
public class Login_form{
    public static void main(String args[]){
       Frame f=new Frame("Grid Login form");
       Panel p=new Panel();
       f.setLayout(new FlowLayout());
       p.setLayout(new GridLayout(3,2));
       f.setSize(200,200);
       p.add(new Label("username"));
       p.add(new TextField());
       p.add(new Label("password"));
       p.add(new TextField());
       TextField pass = new TextField(); 
       pass.setEchoChar('*');
       p.add(new Button("click me"));
       p.add(new Button("cancel"));
       f.add(p);
       f.setVisible(true);

    }
}