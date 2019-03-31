package hotelManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FoodInvoker {
	public static Map<Integer, FoodCommand> foodcommands = new HashMap<Integer,FoodCommand>();
	static ArrayList<Room> rooms;
	public void setRoom(ArrayList<Room> rooms) {
		MainInvoker.rooms = rooms;
	}
	static {
		foodcommands.put(1,new SandwichCommand());
        foodcommands.put(2,new PastaCommand());
        foodcommands.put(3,new NoodlesCommand());
        foodcommands.put(4,new CokeCommand());
	}
	public static double invoker(int command,int i) {
		double price = foodcommands.get(command).execute(i);
		return price;
	}

}
