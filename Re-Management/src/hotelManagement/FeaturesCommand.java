package hotelManagement;

import java.util.ArrayList;

public class FeaturesCommand implements MainCommand{
	
	@Override
	public void execute(ArrayList<Room> room,Hotel hotel) {
		Room.features();
	}
}
