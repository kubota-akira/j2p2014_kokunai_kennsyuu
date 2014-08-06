
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class Test02 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Image img0;
	public void init(){
		img0 = getImage(getDocumentBase(), "img/0.png");
	}
	public void paint(Graphics g) {
		g.drawImage(img0, 0, 0, this);
	}

}
