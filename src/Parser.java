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

	private void parse(String filename)throws FileNotFoundException, parseError{
		Scanner in = new Scanner(new FileReader(filename));
		String current = "";

		while(in.hasNext()){
			Location location = new Location();

			current = in.next();
			if(current.substring(0,current.indexOf(' ')) == "Name:"){
				location.setName(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading room Name");
			}

			current = in.next();
			if(current.substring(0,current.indexOf(' ')) == "Desc:"){
				location.setDesc(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading room Description");
			}

			current = in.next();
			if(current.substring(0,current.indexOf(' ')) == "Img:"){
				location.setImg(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading room's Image Path");
			}

			current = in.next();
			if(current.substring(0,current.indexOf(' ')) == "Left:"){
				location.setLeft(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Left");
			}

			current = in.next();
			if(current.substring(0,current.indexOf(' ')) == "Right:"){
				location.setRight(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Right");
			}

			current = in.next();
			if(current.substring(0,current.indexOf(' ')) == "Up:"){
				location.setUp(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Up");
			}

			current = in.next();
			if(current.substring(0,current.indexOf(' ')) == "Down:"){
				location.setDown(current.substring(current.indexOf(' ')+1));
			}
			else{
				throw new parseError("Error reading rooms Down");
			}

			world.addLocation(location);
		}
	}

}//End of Class