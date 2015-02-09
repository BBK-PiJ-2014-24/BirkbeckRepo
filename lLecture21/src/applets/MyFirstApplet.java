package applets;

import java.awt.*;
import javax.swing.*;

public class MyFirstApplet extends JApplet {

	public void paint(Graphics g){
		super.paint(g);
		g.drawString("My First Applet", 25,25);
	}
	
}
