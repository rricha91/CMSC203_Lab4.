/*
 * 
 */
public class Television{
	
	private final String MANUFACTURER;	// What kind of TV is this
	private final int SCREEN_SIZE;		// Screen size of the TV
	
	private boolean powerOn; 	// Is TV on or off
	
	private int channel; 		// What's the channel number
	
	private int volume; 		// What's the volume set to

/**  Constructor that sets the fields given above.
* @param brand  the brand of the TV
* @param size  the total size of the TV
*/
	public Television(String brand, int size) {
	MANUFACTURER = brand;
	SCREEN_SIZE = size;
	
	powerOn=false; 	// TV's defualt state is off, so set to false
	volume=20;		// Starting volume level is 20
	channel=2; 		// Starting channel is channel 2
	
}

	/*
	 * Initializes the channel field to whatever
	 * was given to the station parameter
	 * 
	 * @param station  the channel number given to change to
	 */
public void setChannel(int station) {
	channel=station;
}

/*
 * Toggles powerOn between true and false
 * to represent the TV being turned off and on
 */
public void power() {
	powerOn=!powerOn;
}


// Increments the volume field by one
public void increaseVolume() {
	volume++;
}

//Deincrements the volume field by one
public void decreaseVolume() {
	volume--;
}

public int getChannel() {
	return channel;
}

public int getVolume() {
	return volume;
}

public String getManufacturer() {
	return MANUFACTURER;
}

public int getScreenSize() {
	return SCREEN_SIZE;
}


}
