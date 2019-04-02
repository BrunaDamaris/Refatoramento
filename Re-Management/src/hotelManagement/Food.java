package hotelManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Food implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8724178121181340505L;
	int itemno;
    int quantity;   
    double price;
    
    Food(int itemno,int quantity)
    {
        this.itemno=itemno;
        this.quantity=quantity;
        this.price = FoodInvoker.invoker(itemno, quantity);
    }
    
    static void order(Scanner sc1,ArrayList<Rooms> rooms,int rn)
    {
        int i = 0,q = 0;
        char wish;
         try{
             System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
        do
        {
        	String trash = "";
            boolean correctInput = false;
        	while(!correctInput) {
    			try{
    				i = sc1.nextInt();
    				correctInput = true;
    			}
    			catch(NumberFormatException e){
    				System.out.println("Incorrect Format.");
    			}
    			catch(InputMismatchException e) {
    				System.out.println("Incorrect Format.");
    			}
    			trash = sc1.nextLine();
    		}
    		correctInput = false;
            System.out.print("Quantity- ");
        	while(!correctInput) {
    			try{
    				q = sc1.nextInt();
    				correctInput = true;
    			}
    			catch(NumberFormatException e){
    				System.out.println("Incorrect Format." + trash);
    			}
    			catch(InputMismatchException e) {
    				System.out.println("Incorrect Format." + trash);
    			}
    			trash = sc1.nextLine();
    		}
            Rooms now = Rooms.getRoom(rooms, rn);
            if(now != null) now.food.add(new Food(i,q));
            System.out.println("Do you want to order anything else ? (y/n)");
            wish=sc1.next().charAt(0); 
        } while(wish=='y'||wish=='Y');  
        }
         catch(NullPointerException e)
            {
                System.out.println("\nRoom not booked");
            }
         catch(Exception e)
         {
             System.out.println("Cannot be done");
         }
    }
}
