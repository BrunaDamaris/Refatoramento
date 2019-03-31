package hotelManagement;

import java.util.ArrayList;

public class SingleDCommand implements RoomsCommand{

	@Override
	public void availablerooms(ArrayList<Room> rooms) {
		Room now = null;
		int numbers = 41;
    	while(numbers <= 60) {
    		now = Room.getRoom(rooms, numbers);
    		if(now == null) System.out.print(numbers + ",");
    		numbers++;
    	}
	}
	@Override
	public Room create(Room room, Hotel hotel, String name, String contact, String gender, String name2,
			String contact2, String gender2, int rn) {
		room = new Room(name,contact,gender,RoomsType.SINGLEDELUXE,rn);
        hotel.singleDeluxe++; 
		return room;
	}
	@Override
	public int available(Hotel hotel) {
		return 20 - hotel.singleDeluxe;
	}

}