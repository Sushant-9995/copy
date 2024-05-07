package sushant;
import java.awt.*;
import java.awt.event.*;

public class MouseL implements MouseListener{
	Label l;
	MouseL(){
		Frame f=new Frame();
		f.addMouseListener(this);
		l=new Label();
		l.setBounds(20,50,100,20);
		f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse Clicked");
		
	}

	public void mousePressed(MouseEvent e) {
		l.setText("Mousepressed ");
		
	}

	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse Released");
		
	}

	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse Enter");
		
	}

	public void mouseExited(MouseEvent e) {
		l.setText("Mouse Exited");
		
	}
	public static void main(String[] args) {
		new MouseL();
		}

}
