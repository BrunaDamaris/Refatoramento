package hotelManagement;

import java.util.ArrayList;

public class FeaturesCommand implements MainCommand{
	
	@Override
	public void execute(ArrayList<Rooms> room,Hotel hotel) {
		Rooms.features();
	}
}
