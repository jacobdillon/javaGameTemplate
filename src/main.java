import java.io.FileNotFoundException;

class main{

	public static void main(String [] args){
		World world = new World();
		Parser parser = new Parser(world);
		try{
			parser.parse("locfile.txt");

		world.setLocation("test");

		}
		catch(FileNotFoundException|parseError|LocationNotFoundException e){
			System.out.println(e);
		}


		world.printCurrent();
	}
}//End of Class