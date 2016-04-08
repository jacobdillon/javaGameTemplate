import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImagePanel extends JPanel {
	private BufferedImage image;

	public void setImage(BufferedImage newImage) {
		image = newImage;
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		if(image == null) {
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, getWidth(), getHeight());
			return;
		}
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}
