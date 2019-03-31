package hotelManagement;

public class PastaCommand implements FoodCommand{
	@Override
	public double execute(int quantity) {
		return quantity*60;
	}

}
