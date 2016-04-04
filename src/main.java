import java.io.FileNotFoundException;

public class main {
	public static void main(String [] args) {
		World world = new World();
		Parser parser = new Parser(world);
		try {
			parser.parse("locfile.txt");
		} catch(FileNotFoundException | parseError e) {
			System.out.println(e);
		}

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
