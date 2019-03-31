package hotelManagement;

import java.util.ArrayList;

public class IteratorArrayRooms implements RoomsIterator{
	ArrayList<Room> rooms;
    int currentposition;
    
    public IteratorArrayRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    @Override
    public Object next() {
        Room room = rooms.get(currentposition);
        currentposition++;
        return room;
    }
     
    @Override
    public boolean hasNext() {
        if (currentposition >= rooms.size() || rooms.get(currentposition) == null) {
        	return false;
        } 
        return true;
    }
}
