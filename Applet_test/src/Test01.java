import java.applet.Applet;
import java.awt.Graphics;


public class Test01 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("文字を表示",10,10);
	}

}
