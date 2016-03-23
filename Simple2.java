import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Simple2 extends DummySimple implements ActionListener {
	
	private JLabel label1;
	private int n;

	public void setUpFrame() {

		n=0;

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());

		label1 = new JLabel("Hello");
		this.getContentPane().add(label1);

		JButton button1 = new JButton("press me");
		this.getContentPane().add(button1);

		button1.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		n++;
		label1.setText("pressed " +n+ " times");
	}
}