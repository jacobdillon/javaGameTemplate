import java.io.FileNotFoundException;

public class main {
	public static void main(String [] args) {
		// Initialize World and Parser objects
		World world = new World();
		Parser parser = new Parser(world);

		// Try to parse the location file
		try {
			parser.parse("locfile.txt");
		} catch(FileNotFoundException | parseError e) {
			System.out.println("Please create the location file or fix it according to the documentation.");
			System.exit(1);
		}

		// Initialize the GUI & make it visible
		GUI gui = new GUI(parser.getTitle());
		gui.setVisible(true);
		try {
			world.setCurrentLocation("test");
		} catch(LocationNotFoundException e) {
			System.out.println(e);
		}

		System.out.println(world.getCurrent());
		System.out.println("Down is...");

		try {
			world.setCurrentLocation(world.getCurrent().getDown());
		} catch(LocationNotFoundException e) {
			System.out.println(e);
		}

		System.out.println(world.getCurrent());
	}
}
