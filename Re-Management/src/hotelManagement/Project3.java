package hotelManagement;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Project3 {
	static ArrayList<Room> rooms = new ArrayList<>();
	public static void main(String[] args){
		
        try
        {           
	        File f = new File("backup");
	        if(f.exists())
        {
            FileInputStream fin=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fin);
           	rooms = (ArrayList<Room>)ois.readObject();
        }
        Scanner sc = new Scanner(System.in);
        String wish = null;
        Hotel hotel = new Hotel(0,0,0,0);
        while(true) {
        	System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
            String command = null;
            command = sc.nextLine();
            if(command.equals("6")) break;
            MainInvoker.invoker(command,rooms,hotel);
            System.out.println("\nContinue : (y/n)");
            wish = sc.nextLine(); 
            if(!(wish.equals("y") || wish.equals("Y")||wish.equals("n") || wish.equals("N")))
            {
               System.out.println("Invalid Option");
               System.out.println("\nContinue : (y/n)");
               wish = sc.nextLine(); 
            }
            else if(wish.equals("n") || wish.equals("N")) break;
        }
        sc.close();
        Thread t = new Thread(new write(rooms));
        t.start();
        }        
        catch(Exception e)
        {
            System.out.println("Not a valid input");
        }
       
    }
	
}