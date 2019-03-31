package hotelManagement;

import java.util.ArrayList;

public class SingleLCommand implements RoomsCommand{

	@Override
	public void availablerooms(ArrayList<Room> rooms) {
		Room now = null;
		int numbers = 31;
    	while(numbers <= 40) {
    		now = Room.getRoom(rooms, numbers);
    		if(now == null) System.out.print(numbers + ",");
    		numbers++;
    	}
	}

	@Override
	public Room create(Room room, Hotel hotel, String name, String contact, String gender, String name2,
			String contact2, String gender2, int rn) {
		room = new Room(name,contact,gender,RoomsType.SINGLELUXURY,rn);
        hotel.singleLuxury++;  
		return room;
	}

	@Override
	public int available(Hotel hotel) {
		return 10 - hotel.singleLuxury;
	}


}
