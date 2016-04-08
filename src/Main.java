import java.io.FileNotFoundException;

public class Main {
	static World world;
	static GUI gui;

	public static void main(String [] args) {
		// Initialize World and Parser objects
		world = new World();
		Parser parser = new Parser(world);

		// Try to parse the location file
		try {
			parser.parse("locfile.txt");
		} catch(FileNotFoundException e) {
			System.out.println("[Error] Location file not found - Create it according to the docs");
			System.exit(1);
		} catch(parseError e) {
			e.printStackTrace();
			System.out.println(e);
			System.exit(2);
		}

		// Initialize the GUI & make it visible
		gui = new GUI(parser.getTitle());

		try {
			world.setCurrentLocation("Home");
		} catch(LocationNotFoundException e) {
			System.out.println("[Error] Location not found - Make sure that every location has valid paths");
		}

		gui.updateLocation(world.getCurrentLocation());
	}

	public static void directionRequest(Direction direction) {
		String nameOfLocation = "";

		if(direction == Direction.UP)
			nameOfLocation = world.getCurrentLocation().getUp();
		else if(direction == Direction.DOWN)
			nameOfLocation = world.getCurrentLocation().getDown();
		else if(direction == Direction.LEFT)
			nameOfLocation = world.getCurrentLocation().getLeft();
		else if(direction == Direction.RIGHT)
			nameOfLocation = world.getCurrentLocation().getRight();

		if(nameOfLocation.equals("null")) {
			gui.setStatus("Hit a wall.");
			return;
		} else {
			gui.setStatus("Move successful.");
		}

		try {
			world.setCurrentLocation(nameOfLocation);
		} catch(LocationNotFoundException e) {
			System.out.println("[Error] Location not found - Make sure that every location has valid paths");
		}

		gui.updateLocation(world.getCurrentLocation());
	}
}
