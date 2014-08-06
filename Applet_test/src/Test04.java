import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;


public class Test04 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int x=0,y=0;
	Image img1;
	public void init(){
		img1 = getImage(getDocumentBase(), "img/0.png");
		repaint();
	}
	public void paint(Graphics g) {
		g.drawImage(img1, x, y, this);
	}
	public boolean mouseDown(Event e, int x, int y) {
		this.x = x;
		this.y = y;
		repaint();
		return true;
	}

}
