import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
	public static void main(String[]args) {
		// Frame to use
		JFrame frame = new JFrame("Game!");

		// Set size of the window
		frame.setSize(420, 250);

		// Manually layout items using setBounds(x, y, w, h)
		frame.setLayout(null);

		// Exit program when window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make it so you can't resize the window
		frame.setResizable(false);

		// Name of Location TextField
		JTextField locationName = new JTextField("");
		locationName.setBounds(10, 10, 400, 20);
		locationName.setEditable(false);
		frame.add(locationName);

		// Status TextBox
		JTextField status = new JTextField("");
		status.setBounds(10, 35, 400, 20);
		status.setEditable(false);
		frame.add(status);

		// Image JPanel
		ImagePanel image = new ImagePanel();
		image.setBounds(10, 60, 200, 180);
		frame.add(image);

		// Description TextBox
		JTextArea description = new JTextArea("");
		description.setBounds(215, 135, 195, 105);
		description.setEditable(false);
		description.setLineWrap(true);
		description.setWrapStyleWord(true);
		frame.add(description);

		// Up button
		final JButton up = new JButton("^");
		up.setBounds(292, 60, 45, 20);
		up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			}
		});
		frame.add(up);

		// Down button
		final JButton down = new JButton("v");
		down.setBounds(292, 110, 45, 20);
		down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			}
		});
		frame.add(down);

		// Left Button
		final JButton left = new JButton("<");
		left.setBounds(242, 85, 45, 20);
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			}
		});
		frame.add(left);

		// Right Button
		final JButton right = new JButton(">");
		right.setBounds(342, 85, 45, 20);
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			}
		});
		frame.add(right);

		// Make it visible
		frame.setVisible(true);
	}
}
