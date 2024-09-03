import java.awt.*;
import java.awt.event.*;
/*
<applet code="MyApplet.class" width=600 height=600>

</applet>
*/
public class first implements MouseMotionListener 
{
	Frame frame;
	Label l1;
	Button b1;
	first()
	{
		frame=new Frame("First frame program");
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		l1=new Label("Not Clicked");
		l1.setBounds(50,50,200,70);
		frame.add(l1);
		
		b1=new Button("Click me");
		b1.setBounds(50,150,70,40);
		frame.add(b1);
		
		frame.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e)
		{
			frame.dispose();
			
		}});
		frame.addMouseMotionListener(this);
	}
	
	public void mouseMoved(MouseEvent e)
	{
		Graphics g=frame.getGraphics();
		g.drawOval(e.getX(),e.getY(),20,20);
		
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=frame.getGraphics();
		g.drawOval(e.getX(),e.getY(),20,20);
        // g.setColor(null);
	}
	
	public static void main(String args[])
	{
		
		first mp=new first();
	}
	
}