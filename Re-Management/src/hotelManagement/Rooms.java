package hotelManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rooms implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8189184711108494218L;
	static Scanner sc1 = new Scanner(System.in);
	String name;
    String contact;
    String gender;
    String name2;
    String contact2;
    String gender2; 
    int roomnumber;
    RoomsType type;
    ArrayList<Food> food = new ArrayList<>();

    Rooms(String name,String contact,String gender,RoomsType roomtype,int roomnumber)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.type = roomtype;
        this.roomnumber=roomnumber;
    }
    Rooms(String name,String contact,String gender,String name2,String contact2,String gender2,RoomsType roomtype,int roomnumber){
    	this(name,contact,gender,roomtype,roomnumber);
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }
    
    public static void features()
    {
    	int i = 0;
    	System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
    	String trash = "";
    	boolean correctInput = false;
    	while(!correctInput) {
			try{
				i = sc1.nextInt();
				correctInput = true;
			}
			catch(NumberFormatException e){
				System.out.println("Incorrect Format."  + trash);
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect Format."  + trash);
			}
			trash = sc1.nextLine();
		}
	    if(i == 1) System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
	    else if(i == 2) System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
	    else if(i == 3) System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ");
	    else if(i == 4) System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
	    else{
	    	System.out.println("Enter valid option");
	    }
    }
    
    public static Rooms getRoom(ArrayList<Rooms> rooms,int roomn) {
    	RoomsIterator iterator = new IteratorArrayRooms(rooms);
    	while(iterator.hasNext()) {
    		Rooms now = (Rooms)iterator.next();
    		if(now.roomnumber == roomn) return now;
    	}
    	return null;
    }

}
