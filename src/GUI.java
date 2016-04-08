import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class GUI extends JFrame {
	JFrame frame;
	JTextField locationName;
	JTextField status;
	ImagePanel image;
	JTextArea description;
	final JButton up;
	final JButton down;
	final JButton left;
	final JButton right;

	public GUI(String title) {
		// Frame to use
		frame = new JFrame(title);

		// Set size of the window
		frame.setSize(420, 250);

		// Manually layout items using setBounds(x, y, w, h)
		frame.setLayout(null);

		// Exit program when window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make it so you can't resize the window
		frame.setResizable(false);

		// Name of Location TextField
		locationName = new JTextField("");
		locationName.setBounds(10, 10, 400, 20);
		locationName.setEditable(false);
		frame.add(locationName);

		// Status TextBox
		status = new JTextField("");
		status.setBounds(10, 35, 400, 20);
		status.setEditable(false);
		frame.add(status);

		// Image JPanel
		image = new ImagePanel();
		image.setBounds(10, 60, 200, 180);
		frame.add(image);

		// Description TextBox
		description = new JTextArea("");
		description.setBounds(215, 135, 195, 105);
		description.setEditable(false);
		description.setLineWrap(true);
		description.setWrapStyleWord(true);
		frame.add(description);

		// Up button
		up = new JButton("^");
		up.setBounds(292, 60, 45, 20);
		up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Main.directionRequest(Direction.UP);
			}
		});
		frame.add(up);

		// Down button
		down = new JButton("v");
		down.setBounds(292, 110, 45, 20);
		down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Main.directionRequest(Direction.DOWN);
			}
		});
		frame.add(down);

		// Left Button
		left = new JButton("<");
		left.setBounds(242, 85, 45, 20);
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Main.directionRequest(Direction.LEFT);
			}
		});
		frame.add(left);

		// Right Button
		right = new JButton(">");
		right.setBounds(342, 85, 45, 20);
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Main.directionRequest(Direction.RIGHT);
			}
		});
		frame.add(right);

		// Set the GUI visible
		frame.setVisible(true);
	}

	public void updateLocation(Location loc) {
		locationName.setText(loc.getName());
		try {
			image.setImage(ImageIO.read(new File(loc.getImg())));
		} catch(IOException e) {
			System.out.println("[Warning] No image file found");
		}
		description.setText(loc.getDesc());
	}

	public void setStatus(String str) {
		status.setText(str);
	}
}
