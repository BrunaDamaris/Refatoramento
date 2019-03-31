package hotelManagement;

public class CokeCommand implements FoodCommand{
	@Override
	public double execute(int quantity) {
		return quantity*30;
	}
}
