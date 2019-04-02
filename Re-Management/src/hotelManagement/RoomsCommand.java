package hotelManagement;

import java.util.ArrayList;

public interface RoomsCommand {
	public void availablerooms(ArrayList<Rooms> rooms);
	public Rooms create(Rooms room,Hotel hotel,String name,String contact,String gender,String name2,String contact2,String gender2,int rn);
	public int available(Hotel hotel);
}
