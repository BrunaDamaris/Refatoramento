package hotelManagement;

import java.util.ArrayList;

public class BookroomCommand implements MainCommand{

	@Override
	public void execute(ArrayList<Rooms> room,Hotel hotel) {
		Hotel.bookroom(room,hotel);
	}

}
