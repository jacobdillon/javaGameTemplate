import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.String;

public class Parser {
	private World world;
	private String title;

	public Parser(World world) {
		this.world = world;
		this.title = null;
	}

	public void parse(String filename) throws FileNotFoundException, ParseFailedException {
		Scanner in = new Scanner(new FileReader(filename));
		String current = "";

		current = in.nextLine();
		if(current.substring(0, current.indexOf(' ')).equals("Title:")) {
			this.title = current.substring(current.indexOf(' ') + 1);
		} else {
			throw new ParseFailedException("[Error] Reading title failed");
		}

		while(in.hasNext()) {
			Location location = new Location();

			current = in.nextLine();
			if(current.equals("Location:")) {
				current = in.nextLine();
				if(current.substring(0, current.trim().indexOf(' ')).equals("Name:")) {
					location.setName(current.substring(current.indexOf(' ') + 1));
				} else {
					throw new ParseFailedException("[Error] Reading room name failed");
				}

				current = in.nextLine();
				if(current.substring(0, current.trim().indexOf(' ')).equals("Desc:")) {
					location.setDesc(current.substring(current.indexOf(' ')+1));
				} else {
					throw new ParseFailedException("[Error] Reading room description failed");
				}

				current = in.nextLine();
				if(current.substring(0, current.trim().indexOf(' ')).equals("Img:")) {
					location.setImg(current.substring(current.indexOf(' ')+1));
				} else {
					throw new ParseFailedException("[Error] Reading room image path failed");
				}

				current = in.nextLine();
				if(current.substring(0, current.trim().indexOf(' ')).equals("Left:")) {
					location.setLeft(current.substring(current.indexOf(' ')+1));
				} else {
					throw new ParseFailedException("[Error] Reading room location to the left failed");
				}

				current = in.nextLine();
				if(current.substring(0, current.trim().indexOf(' ')).equals("Right:")) {
					location.setRight(current.substring(current.indexOf(' ')+1));
				} else {
					throw new ParseFailedException("[Error] Reading room location to the right failed");
				}

				current = in.nextLine();
				if(current.substring(0, current.trim().indexOf(' ')).equals("Up:")) {
					location.setUp(current.substring(current.indexOf(' ')+1));
				} else {
					throw new ParseFailedException("[Error] Reading room location up failed");
				}

				current = in.nextLine();
				if(current.substring(0, current.trim().indexOf(' ')).equals("Down:")) {
					location.setDown(current.substring(current.indexOf(' ')+1));
				} else {
					throw new ParseFailedException("[Error] Reading room location down failed");
				}

				world.addLocation(location);
			}
		}
	}

	public String getTitle() {
		return this.title;
	}
}
