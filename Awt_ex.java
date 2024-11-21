import java.awt.*;
public class Awt_ex {
    public static void main(String args[]){
    /*Frame f=new Frame("Label demo");
    f.setSize(200,100);
    Label l=new Label("hello world");
    f.add(l);
    f.setVisible(true);*/

    Frame f=new Frame();
    f.setSize(200,100);
    //flowLayout
    //f.setLayout(new FlowLayout());
    f.setLayout(new GridLayout(1,2));
    Button b=new Button("click me");
    f.add(b);
    f.add(new Button("cancel"));
    f.setVisible(true);

    
}
}

