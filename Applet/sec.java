import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;
public class sec implements ActionListener{
    Frame f;
    Button B;
    Label l;
    TextField T1;
    TextField T2;
    sec()
    {
        f = new Frame(); 
        f.setSize(700, 500);
        
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        T1 = new TextField();
        T1.setBounds(50, 50, 150, 40);
        f.add(T1);

        T2 = new TextField();
        T2.setBounds(50, 100, 150, 40);
        f.add(T2);

        B = new Button("SUM");
        B.setBounds(50, 150, 150, 40);
        f.add(B);

        l = new Label();
        l.setBounds(70,200,150,40);
        f.add(l);

        B.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(T1.getText());
                int n2 = Integer.parseInt(T2.getText());
                String ans = String.valueOf(n1+n2);
                l.setText(ans);
            }
    public static void main(String args[])
    {
        sec a = new sec();
    }
}