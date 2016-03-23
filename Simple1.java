import java.awt.*;
import javax.swing.*;

public class Simple1 extends DummySimple {
	public void setUpFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());


		JLabel label1 = new JLabel("Hello");
		this.getContentPane().add(label1);

		JLabel label2 = new JLabel("Bye");
		this.getContentPane().add(label2);
	}
}