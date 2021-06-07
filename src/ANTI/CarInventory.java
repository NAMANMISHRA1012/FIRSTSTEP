package ANTI;
import java.util.*;

public class CarInventory {
	List<Car> inventory = new ArrayList<Car>();
	TimeTracking timetracking = new TimeTracking();
	
	 public CarInventory() {
	    	inventory.add(new Car(101,"SEDAN",4,1000) );
	    	inventory.add(new Car(102,"SUV",7,3000) );
	    	inventory.add(new Car(103,"HATCHBACKS",4,500) );
	    	
	    
	    }
	 public void display() {
		 for(Car obj : inventory) {
			 System.out.println(obj);
	 }
	 }
	
	
    public Car borrowCar( int carid) {
    	
    	for(Car obj :inventory)
    	{
    		if (obj.getId() == carid) {
    			System.out.println("car is borrowed");
    			inventory.remove(obj);
    			timetracking.borrowCar(obj);
    			return obj;
    			
    			
    		}
    		
    	}
    	System.out.println("Car is not avilable");
		return null;
    }
    public void addCar(Car car) {
    	inventory.add(car);
    	System.out.println("Car added successfully");
    	System.out.println(car);
    }
    
    public long returnCar(Car car) {
    	inventory.add(car);
    	long variable = timetracking.ReturnCar(car);
    	System.out.println(car);
    	return variable;
    }
   
    
    
    }

