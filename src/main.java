import java.io.FileNotFoundException;

public class main {
	public static void main(String [] args) {
		// Initialize World and Parser objects
		World world = new World();
		Parser parser = new Parser(world);

		// Try to parse the location file
		try {
			parser.parse("locfile.txt");
		} catch(FileNotFoundException e) {
			System.out.println("[Error] Location file not found - Create it according to the docs");
			System.exit(1);
		} catch(parseError e) {
			System.out.println("[Error] Parsing file failed - Ahere to the docs");
			System.exit(2);
		}

		// Initialize the GUI & make it visible
		GUI gui = new GUI(parser.getTitle());

		try {
			world.setCurrentLocation("Home");
		} catch(LocationNotFoundException e) {
			System.out.println("[Error] Location not found - Make sure that every location has valid paths");
		}

		gui.updateLocation(world.getCurrentLocation());
	}
}
