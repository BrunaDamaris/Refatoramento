package hotelManagement;

import java.util.ArrayList;

public class AvailableCommand implements MainCommand{
	@Override
	public void execute(ArrayList<Room> room,Hotel hotel) {
		Hotel.availability(hotel);
	}

}
