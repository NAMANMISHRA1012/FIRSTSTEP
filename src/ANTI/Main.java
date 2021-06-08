package ANTI;
import java.util.*;

public class Main {
	
	public static void main(String args [])
	{	
		UserManagement um = new UserManagement();
		CarInventory ci = new CarInventory();
		BillingClass bill = new BillingClass();
		TimeTracking tt = new TimeTracking();
		Car obj;
		String customerEmail;
		Map<String, Car> storing = new HashMap<String, Car>();
		Scanner sc = new Scanner (System.in);
		System.out.println(" WELCOME TO 1CAR RENTAL SERVICE");
		while(true) {
		System.out.println("Enter your choice\n"+ "Number 1:Add new customer\n"+ "Number 2:Add new car\n"+"Number3:Borrow a car\n"+"Number4:Return a car\nNumber5:Delete customer "+"\nNumber6: exit");
		int input = sc.nextInt();
		sc.nextLine();
		switch (input) {
		case 1 :
			
			System.out.println("enter customer email");
			String id = sc.nextLine();
			System.out.println("enter customer name");
			String name = sc.nextLine();
			System.out.println("enter customer password");
			String password = sc.nextLine();
			System.out.println("Enter the Phone Number");
			long number =  sc.nextInt();
			sc.nextLine();
			System.out.println("enter customer category regular or premium");
			String category = sc.nextLine();
			System.out.println("enter customer status : active");
			String status = sc.nextLine();
			Customer customer = new Customer(name,id,password,number,category,status);
		    um.createUsers(customer);
			
			
			
	
			break;
		case 2 :
			System.out.println("enter  idCar");
			int idCar = sc.nextInt();
			sc.nextLine();
			System.out.println("enter car type");
			String type = sc.nextLine();
			System.out.println("enter numberOfSeats");
			int numberOfSeats = sc.nextInt();
			sc.nextLine();
			System.out.println("enter rentperhour");
			int RentPerHour=  sc.nextInt();
			sc.nextLine();
			Car car = new Car(idCar,type,numberOfSeats,RentPerHour);
			
			
			
			
			
			break;
		case 3 :
			System.out.println("Enter your email");
			customerEmail = sc.nextLine();
			ci.display();
			System.out.println("Enter car id ");
			int carId =sc.nextInt();
			 obj = ci.borrowCar(carId);
			System.out.println("Car borrowed is "+ obj);
			storing.put(customerEmail,obj);
			tt.borrowCar(obj);
			
		
			break;
			
		case 4 :
			System.out.println("Enter your email");
			customerEmail = sc.nextLine();
			obj = storing.get(customerEmail);
			int Duration =(int) ci.returnCar(obj);
			System.out.println(um.getCategory(customerEmail));
			bill.billing(um.getCategory(customerEmail),obj,Duration);
			
			
			
			break;
			
		case 5:
			System.out.println("enter your email");
			customerEmail=sc.nextLine();
			um.deleteUsers(customerEmail);
			um.displayUser();
			break;
		case 6:System.exit(0);
		}}
		
	}
	}
