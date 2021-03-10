import java.awt.*;
import java.applet.*;

public class Applet1 extends Applet{
	String s=" ";
	public void init(){
		s = "init_";
	}
	public void start(){
		s = s+"start_";
	}
	public void stop(){
		s = s+"stop_";
	}
	public void paint(Graphics g){
		s = s+"paint_";
		g.drawString(s,40,100);
		g.drawString("Hello from the Applet",40,40);
		g.drawString("How are you doing?",40,60);
		g.drawString("We wish you a pleasent day today",40,80);
	}
}