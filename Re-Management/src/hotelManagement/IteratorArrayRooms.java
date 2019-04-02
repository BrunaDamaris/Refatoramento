package hotelManagement;

import java.util.ArrayList;

public class IteratorArrayRooms implements RoomsIterator{
	ArrayList<Rooms> rooms;
    int currentposition;
    
    public IteratorArrayRooms(ArrayList<Rooms> rooms) {
        this.rooms = rooms;
    }
    @Override
    public Object next() {
        Rooms room = rooms.get(currentposition);
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
