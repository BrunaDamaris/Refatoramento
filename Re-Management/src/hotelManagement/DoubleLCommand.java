package hotelManagement;

import java.util.ArrayList;

public class DoubleLCommand implements RoomsCommand{

	@Override
	public void availablerooms(ArrayList<Room> rooms) {
		Room now = null;
		int numbers = 1;
		while(numbers <= 10) {
			now = Room.getRoom(rooms, numbers);
    		if(now == null) System.out.print(numbers + ",");
    		numbers++;
    	}
	}
	@Override
	public Room create(Room room,Hotel hotel,String name,String contact,String gender,String name2,String contact2,String gender2,int rn) {
		room = new Room(name,contact,gender,name2,contact2,gender2,RoomsType.DOUBLELUXURY,rn);
        hotel.doubleLuxury++;
        return room;
	}
	@Override
	public int available(Hotel hotel) {
		return 10 - hotel.doubleLuxury;
	}
}
