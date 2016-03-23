import java.awt.*;
import javax.swing.*;

public class Simple1 extends DummySimple {
	public void setUpFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());
	}
}