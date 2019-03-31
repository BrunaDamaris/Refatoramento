package hotelManagement;

public class SandwichCommand implements FoodCommand{
	@Override
	public double execute(int quantity) {
		return quantity*50;
	}

}
