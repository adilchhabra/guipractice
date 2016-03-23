import java.awt.*;
import javax.swing.*;

public class Simple3 extends DummySimple {
	
	private JLabel label1;

	public void setUpFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());

		label1 = new JLabel("Hello");
		this.getContentPane().add(label1);

		JButton button1 = new JButton("press me");
		this.getContentPane().add(button1);

		button1.addActionListener(new JERActionListener1(label1));

	}
}