////import java.util.*;
////import javax.swing.*;
////public class swing_concept {
////    public static void main(String args[]){
////        JLabel jLabel=new JLabel();
////        jLabel.add("Suraj");
////        jLabel.add("usraj");
////
////    }
////}
//
//import javax.swing.*;
//public class swing_concept {
//    JFrame f;
//    swing_concept(){
//        f=new JFrame();//creating instance of JFrame
//
//        JButton b=new JButton("click");//creating instance of JButton
//        b.setBounds(130,100,100, 40);
//
//        f.add(b);//adding button in JFrame
//
//        f.setSize(400,500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible
//    }
//
//    public static void main(String[] args) {
//        new swing_concept();
//    }
//}

import javax.swing.*;

class swing_concept {
    public static void main(String[] args) {
        //Declare JFrame object
        JFrame frame = new JFrame();
        //Set the title
        frame.setTitle("Java Swing Example-1");
        //Set the frame size
        frame.setSize(350, 150);
        //Disable the resize option
        frame.setResizable(false);
        //Set frame position to the center of the screen
        frame.setLocationRelativeTo(null);
        //Make the frame visible
        frame.setVisible(true);
    }
}