public class LocationNotFoundException extends Exception {
	public LocationNotFoundException() {
		super("[Error] Location not found - Make sure that every location has valid paths");
	}
}
