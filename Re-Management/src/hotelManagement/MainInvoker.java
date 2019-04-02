package hotelManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import hotelManagement.AvailableCommand;
import hotelManagement.BookroomCommand;
import hotelManagement.DeallocateCommand;
import hotelManagement.FeaturesCommand;
import hotelManagement.MainCommand;
import hotelManagement.OrderCommand;

public class MainInvoker {
	public static Map<String, MainCommand> commands = new HashMap<String,MainCommand>();
	static ArrayList<Rooms> rooms;
	public void setRoom(ArrayList<Rooms> rooms) {
		MainInvoker.rooms = rooms;
	}
	static {
		commands.put("1",new FeaturesCommand());
        commands.put("2",new AvailableCommand());
        commands.put("3",new BookroomCommand());
        commands.put("4",new OrderCommand());
        commands.put("5",new DeallocateCommand());
	}
	public static void invoker(String command,ArrayList<Rooms> room,Hotel hotel) {
		commands.get(command).execute(room,hotel);
	}
}
