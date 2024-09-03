// import java.awt.*;
// import java.awt.event.*;

// public class checkboc implements ItemListener {

//     Frame f;
//     Checkbox c1;
//     Checkbox c2;
//     Checkbox c3;
//     Label l;

//     checkboc() {
//         f = new Frame();
//         f.setSize(900, 700);
//         f.setLayout(null);
//         f.setVisible(true);

//         c1 = new Checkbox("Read");
//         c1.setBounds(50, 50, 100, 50);
//         f.add(c1);

//         c2 = new Checkbox("Write");
//         c2.setBounds(50, 100, 100, 50);
//         f.add(c2);

//         c3 = new Checkbox("Think");
//         c3.setBounds(50, 150, 100, 50);
//         f.add(c3);

//         l = new Label();
//         l.setBounds(50, 200, 100, 50);
//         f.add(l);

//         f.addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent e) {
//                 f.dispose();
//             }
//         });

//         c1.addItemListener(this);
//         c2.addItemListener(this);
//         c3.addItemListener(this);

//     }

//     public void itemStateChanged(ItemEvent e)
//         {
//             if (e.getSource() == c1) {
//                 l.setText(c1.getName());       
//             }
//             else if(e.getSource() == c2){
//                 l.setText(c2.getName());
//             }
//             else{
//                 l.setText(c3.getName());
//             }
//         }

//     public static void main(String[] args) {
//         checkboc ck = new checkboc();
//     }
// }


import java.awt.*;
import java.awt.event.*;

public class checkboc implements ItemListener {

    Frame f;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
    Label l;

    checkboc() {
        f = new Frame();
        f.setSize(900, 700);
        f.setLayout(null);
        f.setVisible(true);

        c1 = new Checkbox("Read");
        c1.setBounds(50, 50, 100, 50);
        f.add(c1);

        c2 = new Checkbox("Write");
        c2.setBounds(50, 100, 100, 50);
        f.add(c2);

        c3 = new Checkbox("Think");
        c3.setBounds(50, 150, 100, 50);
        f.add(c3);

        l = new Label();
        l.setBounds(50, 200, 100, 50);
        f.add(l);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == c1) {
            l.setText(c1.getLabel());       
        }
        else if(e.getSource() == c2){
            l.setText(c2.getLabel());
        }
        else{
            l.setText(c3.getLabel());
        }
    }

    public static void main(String[] args) {
        checkboc ck = new checkboc();
    }
}
