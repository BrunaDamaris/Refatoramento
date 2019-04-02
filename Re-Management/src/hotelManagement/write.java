package hotelManagement;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


class write implements Runnable
{
	ArrayList<Rooms> rooms;
	private ObjectOutputStream oos;
    write(ArrayList<Rooms> rooms)
    {
        this.rooms = rooms;
    }
    @Override
    public void run() {
          try{
        FileOutputStream fout=new FileOutputStream("backup");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(rooms);
        }
        catch(Exception e)
        {
            System.out.println("Error in writing "+e);
        }         
        
    }
    
}