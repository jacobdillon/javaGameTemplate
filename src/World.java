import java.util.*;
import java.util.ArrayList;

public class World{


	private ArrayList<Location> list = new ArrayList<>();

	private Location current;

	public void World(){
		this.list = null;
	}

	private void setLocation(String name)throws LocationNotFoundException{
		for(Location i:this.list){
			if(i.getName() == name){
				this.current = i;
				return;
			}
		}
		throw new LocationNotFoundException("Could not find location");
	}

	public void addLocation(Location location){
		this.list.add(location);
	}
}//End of Class