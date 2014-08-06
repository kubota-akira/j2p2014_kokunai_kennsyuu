import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class Test03 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Image [] img = new Image[10];
	int w = 36;
	public void init(){
		for(int i=0;i<=9;i++) {
			img[i] = getImage(getDocumentBase(), "img/"+i+".png");
		}
	}
	public void paint(Graphics g) {
		for(int i=0;i<=9;i++) {
			g.drawImage(img[i], i*w, 0, this);
		}
	}

}
