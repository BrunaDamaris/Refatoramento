package hotelManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Hotel
{
	int doubleDeluxe = 0,singleDeluxe = 0,doubleLuxury = 0,singleLuxury = 0;
	Hotel(int dD,int sD,int dL,int sL){
		this.doubleDeluxe = dD;
		this.singleDeluxe = sD;
		this.doubleLuxury = dL;
		this.singleLuxury = sL;
	}
	
    static Scanner sc = new Scanner(System.in);
    static void CustDetails(int i,int rn,ArrayList<Room> rooms,Hotel hotel)
    {
        String name, contact, gender;
        String name2 = null, contact2 = null; 
        String gender2="";
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact=sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
        if(i<3)
        {
	        System.out.print("Enter second customer name: ");
	        name2 = sc.next();
	        System.out.print("Enter contact number: ");
	        contact2=sc.next();
	        System.out.print("Enter gender: ");
	        gender2 = sc.next();
        }
        Room newroom = null;
        if(i == 1 || i == 2 || i == 3 || i== 4) {
        	newroom = RoomsInvoker.invoker_1(i, newroom, hotel,name,contact,gender,name2,contact2,gender2,rn);
    		rooms.add(newroom);
        }
        else System.out.println("Wrong Option!");
	}
    
    static void bookroom(ArrayList<Room> rooms,Hotel hotel)
    {
    	int i = 0;
    	System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
    	String trash = "";
        boolean correctInput = false;
    	while(!correctInput) {
			try{
				i = sc.nextInt();
				correctInput = true;
			}
			catch(NumberFormatException e){
				System.out.println("Valor no formato incorreto." + trash);
			}
			catch(InputMismatchException e) {
				System.out.println("Valor no formato incorreto." + trash);
			}
			trash = sc.nextLine();
		}
		correctInput = false;
        int rn = 0;
        Room now = null;
        System.out.println("\nChoose room number from : ");
        if(i == 1 || i == 2 || i == 3 || i == 4) RoomsInvoker.invoker(i, rooms);
        else {
        	System.out.println("Invalid option");
        	return;
        }
        System.out.print("\nEnter room number: ");
        try{
	    	while(!correctInput) {
				try{
					rn = sc.nextInt();
					correctInput = true;
				}
				catch(NumberFormatException e){
					System.out.println("Valor no formato incorreto.");
				}
				catch(InputMismatchException e) {
					System.out.println("Valor no formato incorreto.");
				}
				trash = sc.nextLine();
			}
			correctInput = false;
	        now = Room.getRoom(rooms, rn);
	        if(now != null || rn == 0) throw new NotAvailable();
	        CustDetails(i,rn,rooms,hotel);
	    }
        catch(Exception e)
        {
           System.out.println("Invalid Option");
            return;
        }
        System.out.println("Room Booked");
    }
    
    static void availability(Hotel hotel)
    {
    	int i = 0,count = 0;
    	System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
    	String trash = "";
        boolean correctInput = false;
    	while(!correctInput) {
			try{
				i = sc.nextInt();
				correctInput = true;
			}
			catch(NumberFormatException e){
				System.out.println("Valor no formato incorreto.");
			}
			catch(InputMismatchException e) {
				System.out.println("Valor no formato incorreto.");
			}
			trash = sc.nextLine();
		}
		correctInput = false;
		if(i == 1 || i == 2 || i == 3 || i == 4) {
			count = RoomsInvoker.invoker_2(i, hotel);
			System.out.println("Number of rooms available : " + count);
		}
		else System.out.println("Enter valid option" + trash);
    }
    
    static void bill(int rn,ArrayList<Room> rooms,RoomsType current)
    {
    	double amount = current.calculate(rooms, rn);
        System.out.println("\nTotal Amount- " + amount);
    }
    
    static void deallocate(int rn,ArrayList<Room> rooms,Hotel hotel)
    {
        char w;
        Room now = Room.getRoom(rooms, rn);
        if(now != null) {
        	System.out.println("Room used by "+ now.name);
        	System.out.println(" Do you want to checkout ? (y/n)");
            w = sc.next().charAt(0);
            if(w == 'y'||w == 'Y')
            {
                RoomsType current = now.type;
                current.counting(hotel);
                bill(rn,rooms,current);
                rooms.remove(now);
                System.out.println("Deallocated succesfully");
            }
        }
        else { 
    		System.out.println("Empty Already");
            return;
    	}
    }
}


