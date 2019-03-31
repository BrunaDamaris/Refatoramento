package hotelManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RoomsInvoker {
	public static Map<Integer, RoomsCommand> commands = new HashMap<Integer,RoomsCommand>();
	static ArrayList<Room> rooms;
	public void setRoom(ArrayList<Room> rooms) {
		MainInvoker.rooms = rooms;
	}
	static {
		commands.put(1,new DoubleLCommand());
        commands.put(2,new DoubleDCommand());
        commands.put(3,new SingleLCommand());
        commands.put(4,new SingleDCommand());
	}
	public static void invoker(int command,ArrayList<Room> room) {
		commands.get(command).availablerooms(room);
	}
	public static Room invoker_1(int command,Room room,Hotel hotel,String name,String contact,String gender,String name2,String contact2,String gender2,int rn) {
		return commands.get(command).create(room,hotel,name,contact,gender,name2,contact2,gender2,rn);
	}
	public static int invoker_2(int command,Hotel hotel) {
		return commands.get(command).available(hotel);
	}
}
