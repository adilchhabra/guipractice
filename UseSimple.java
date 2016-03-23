import javax.swing.*;
import java.awt.*;

public class UseSimple extends JFrame {
	public static void main(String [] args) {
		DummySimple theFrame;

		if(args.length==0) {
			JOptionPane.showMessageDialog(null,"run the program by typing \n java UseSimple <program choice>");
			System.exit(1);
		} 

		if(args[0].equals("1"))
			theFrame = new Simple1();
		else if(args[0].equals("2"))
			theFrame = new Simple2();
		else
			theFrame = new Simple1();

		theFrame.setUpFrame();
		theFrame.setPreferredSize(new Dimension(500,500));

		theFrame.pack();
		theFrame.setVisible(true);

	}
}