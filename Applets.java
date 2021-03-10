import java.awt.*;
import java.applet.*;

public class Applets extends Applet{
	String name,age,food,fruit,destination;
	public void init(){
		name = getParameter("Name");
		age = getParameter("Age");
		food = getParameter("Food");
		fruit = getParameter("Fruit");
		destination = getParameter("Destination");
	}
	public void paint(Graphics g){
		g.drawString("Reading Parameters are :",20,20);
		g.drawString("Name = "+name,20,40);
		g.drawString("Age = "+age,20,60);
	}
}