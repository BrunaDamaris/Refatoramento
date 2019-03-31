package hotelManagement;

public class NoodlesCommand implements FoodCommand{
	@Override
	public double execute(int quantity) {
		return quantity*70;
	}

}
