import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.String;
class Parser{

	World world = new World();


	public Parser(World world){
		this.world = world;
	}

	public void parse(String filename)throws FileNotFoundException, parseError{
		Scanner in = new Scanner(new FileReader(filename));
		String current = "";

		while(in.hasNext()){
			Location location = new Location();

			current = in.nextLine();
			if(current.substring(0,current.indexOf(' ')).equals("Name:")){
				location.setName(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading room Name");
			}

			current = in.nextLine();
			if(current.substring(0,current.indexOf(' ')).equals("Desc:")){
				location.setDesc(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading room Description");
			}

			current = in.nextLine();
			if(current.substring(0,current.indexOf(' ')).equals("Img:")){
				location.setImg(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading room's Image Path");
			}

			current = in.nextLine();
			if(current.substring(0,current.indexOf(' ')).equals("Left:")){
				location.setLeft(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Left");
			}

			current = in.nextLine();
			if(current.substring(0,current.indexOf(' ')).equals("Right:")){
				location.setRight(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Right");
			}

			current = in.nextLine();
			if(current.substring(0,current.indexOf(' ')).equals("Up:")){
				location.setUp(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Up");
			}

			current = in.nextLine();
			if(current.substring(0,current.indexOf(' ')).equals("Down:")){
				location.setDown(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Down");
			}

			world.addLocation(location);
		}
	}

}//End of Class