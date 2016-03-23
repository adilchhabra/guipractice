import javax.swing.*;
import java.awt.*;

public class UseSimple extends JFrame {
	public static void main(String [] args) {
		DummySimple theFrame = new Simple1();
		theFrame.setUpFrame();
		theFrame.setPreferredSize(new Dimension(500,500));

		theFrame.pack();
		theFrame.setVisible(true);

	}
}