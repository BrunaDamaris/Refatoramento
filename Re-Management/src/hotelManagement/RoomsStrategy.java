package hotelManagement;

import java.util.ArrayList;

public interface RoomsStrategy {
		public double calculate(ArrayList<Rooms> rooms,int rn);
		void counting(Hotel hotel);
}
