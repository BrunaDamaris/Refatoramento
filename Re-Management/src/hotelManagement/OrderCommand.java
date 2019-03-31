package hotelManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderCommand implements MainCommand{
	static Scanner sc1 = new Scanner(System.in);
	@Override
	public void execute(ArrayList<Room> rooms,Hotel holtel) {
    	int rn = 0;
    	System.out.print("Room Number - ");
    	String trash = "";
        boolean correctInput = false;
    	while(!correctInput) {
			try{
				rn = sc1.nextInt();
				correctInput = true;
			}
			catch(NumberFormatException e){
				System.out.println("Valor no formato incorreto." + trash);
			}
			catch(InputMismatchException e) {
				System.out.println("Valor no formato incorreto." + trash);
			}
			trash = sc1.nextLine();
		}
    	if(rn > 60 || rn <= 0) System.out.println("Room doesn't exist");
    	else Food.order(sc1,rooms,rn);
	}

}
