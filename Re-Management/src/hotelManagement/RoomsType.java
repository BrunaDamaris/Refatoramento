package hotelManagement;

import java.util.ArrayList;

public enum RoomsType implements RoomsStrategy{
	DOUBLELUXURY{

		@Override
		public double calculate(ArrayList<Room> rooms,int rn) {
			double amount=0;
	        String list[]={"Sandwich","Pasta","Noodles","Coke"};
	        System.out.println("\n*******");
	        System.out.println(" Bill:-");
	        System.out.println("*******");
			Room now = Room.getRoom(rooms, rn);
			amount+=4000;
            System.out.println("\nRoom Charge - "+4000);
            System.out.println("\n===============");
            System.out.println("Food Charges:- ");
            System.out.println("===============");
             System.out.println("Item   Quantity    Price");
            System.out.println("-------------------------");
            for(Food obb:now.food)
            {
                amount+=obb.price;
                String format = "%-10s%-10s%-10s%n";
                System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
            }
			return amount;
		}


		@Override
		public void counting(Hotel hotel) {
			hotel.doubleLuxury--;
		}
	},
	DOUBLEDELUXE{

		@Override
		public double calculate(ArrayList<Room> rooms, int rn) {
			double amount=0;
	        String list[]={"Sandwich","Pasta","Noodles","Coke"};
	        System.out.println("\n*******");
	        System.out.println(" Bill:-");
	        System.out.println("*******");
			Room now = Room.getRoom(rooms, rn);
			amount+=3000;
            System.out.println("Room Charge - "+3000);
            System.out.println("\nFood Charges:- ");
            System.out.println("===============");
             System.out.println("Item   Quantity    Price");
            System.out.println("-------------------------");
            for(Food obb:now.food)
            {
                amount+=obb.price;
                String format = "%-10s%-10s%-10s%n";
                System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
            }
			return amount;
		}

		@Override
		public void counting(Hotel hotel) {
			hotel.doubleDeluxe--;
		}
	},
	SINGLELUXURY{

		@Override
		public double calculate(ArrayList<Room> rooms, int rn) {
			double amount=0;
	        String list[]={"Sandwich","Pasta","Noodles","Coke"};
	        System.out.println("\n*******");
	        System.out.println(" Bill:-");
	        System.out.println("*******");
			Room now = Room.getRoom(rooms, rn);
			amount+=2200;
            System.out.println("Room Charge - "+2200);
            System.out.println("\nFood Charges:- ");
            System.out.println("===============");
            System.out.println("Item   Quantity    Price");
            System.out.println("-------------------------");
            for(Food obb:now.food)
            {
                amount+=obb.price;
                String format = "%-10s%-10s%-10s%n";
                System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
            }
			return amount;
		}

		@Override
		public void counting(Hotel hotel) {
			hotel.singleLuxury--;
		}

		
	},
	SINGLEDELUXE{

		@Override
		public double calculate(ArrayList<Room> rooms, int rn) {
			double amount=0;
	        String list[]={"Sandwich","Pasta","Noodles","Coke"};
	        System.out.println("\n*******");
	        System.out.println(" Bill:-");
	        System.out.println("*******");
			Room now = Room.getRoom(rooms, rn);
			amount+=1200;
            System.out.println("Room Charge - "+1200);
            System.out.println("\nFood Charges:- ");
            System.out.println("===============");
            System.out.println("Item   Quantity    Price");
            System.out.println("-------------------------");
            for(Food obb:now.food)
            {
                amount+=obb.price;
                String format = "%-10s%-10s%-10s%n";
                System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
            }
            return amount;
			
		}

		@Override
		public void counting(Hotel hotel) {
			hotel.doubleDeluxe--;
		}

	};
}
