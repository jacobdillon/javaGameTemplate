import java.util.ArrayList;

public class World {
	private ArrayList<Location> list = new ArrayList<>();
	private Location current;

	public void World() {
		this.list = null;
	}

	public void setCurrentLocation(String name) throws LocationNotFoundException {
		for(Location i : this.list) {
			if(i.getName().equals(name)) {
				this.current = i;
				return;
			}
		}
		throw new LocationNotFoundException();
	}

	public void addLocation(Location location) {
		this.list.add(location);
	}

	public Location getCurrentLocation() {
		return this.current;
	}
}
