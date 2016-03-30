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

	private void parse(String filename)throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader(filename));
		String current = "";

		while(in.hasNext()){
			Location location = new Location();
			for(int i = 0; i < 7; i++){
					current = in.next();

						if(current.substring(0,current.indexOf(' ')) == "Name:"){
							location.setName(current.substring(current.indexOf(' ')+1));
						}
			}
		}
	}

}//End of Class