import java.awt.*;
import java.awt.event.*;
/*class MyFrame extends Frame{
    MyFrame(){
        this.setSize(400,400);
        this.setVisible(true);
        this.setTitle("MY FRAME");
        this.setBackground(Color.gray);
        this.addWindowListener(new myclass());

    }
}
 class myclass implements WindowListener{
        public void windowActivated(WindowEvent e){
            System.out.println("the window is activated");
        }
        public void windowDeactivated(WindowEvent e){
            System.out.println("the window is deactivated");
        }
        public void windowIconified(WindowEvent e){
            System.out.println("window is iconified");
        }
        public void windowDeiconified(WindowEvent e){
            System.out.println("the window isn  deiconified");
        }
        public void windowClosed(WindowEvent e){
            System.out.println("window is closed");
        }
        public void windowClosing(WindowEvent e){
            System.out.println("window is closing");
            System.exit(0);
        }
        public void windowOpened(WindowEvent e){
            System.out.println("Window is opened");
        }
    
}
public class Windowlistener_awt {
    public static void main(String args[]){
MyFrame f=new MyFrame();
    }
}*/


class MyFrame extends Frame{
    MyFrame(){
        this.setSize(400,400);
        this.setVisible(true);
        this.setTitle("MY FRAME");
        this.setBackground(Color.gray);
        this.addWindowListener(new Myclass());

    }
}
class Myclass extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}

public class Windowlistener_awt {
    public static void main(String args[]){
MyFrame f=new MyFrame();
    }
}

