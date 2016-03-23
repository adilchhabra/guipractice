import java.awt.event.*;
import javax.swing.*;

public class JERActionListener1 implements ActionListener {

	int times;
	JLabel theLabel;

	public JERActionListener1(JLabel aLabel) {

		theLabel = aLabel;
		times=0;
	}

	public void actionPerformed(ActionEvent e) {

		times++;
		theLabel.setText("Pushed " +times+ " times");
	}
}