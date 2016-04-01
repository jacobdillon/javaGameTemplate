import java.util.*;
import java.util.ArrayList;

public class World{


	private ArrayList<Location> list = new ArrayList<>();

	private Location current;

	public void World(){
		this.list = null;
	}

	public void readyLocation(String name)throws LocationNotFoundException{
		for(Location i:this.list){
			if(i.getName().equals(name)){
				this.current = i;
				return;
			}
		}
		throw new LocationNotFoundException("Could not find location");

	}

	public void addLocation(Location location){
		this.list.add(location);
	}

	public void printCurrent(){
		System.out.println(current);
	}
}//End of Class