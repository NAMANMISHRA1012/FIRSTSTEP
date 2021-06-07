package ANTI;
import java.util.*;

public class UserManagement {
	List<Customer> Customerlist = new ArrayList<Customer>();
	
	public UserManagement() {
		Customerlist.add(new Customer("Naman","naman@gmail","2million",7054,"regular","active"));
	}
	
       public void createUsers(Customer customer)
       { // TODO add condition if user already exists
    	   Customerlist.add(customer);
       }
       public void updateUsers(Customer customer) {
    	   for(int i =0; i<Customerlist.size();i++) 
    	   {
    		   if (Customerlist.get(i).getEmail()==customer.getEmail()) { //TODO replace with String comparison
    			   Customerlist.set(i, customer);
    		   
    	   }
    	   }
    	   
       }
       public void deleteUsers(String email){
    	   for(int i =0; i<Customerlist.size();i++) 
    	   {
    		   if (Customerlist.get(i).getEmail().compareTo(email)==0) { //TODO replace with String comparison
    			   Customerlist.get(i).setStatus("inactive");
    		   
    	   }
    	   
       }
       
}
       public void displayUser() {
    	   for(Customer obj:Customerlist) {
    		   System.out.println(obj);
    	   }
       }
       public String getCategory(String email) {
    	   for (Customer obj :Customerlist) {
    		   //System.out.println(obj.getEmail());
    		  // System.out.println(email);
    		   if(obj.getEmail().compareTo(email)== 0) {
    			   //System.out.println("returning"+obj.getCategory());
    			   return obj.getCategory();
    		   }
    	   }
		return null;
    	   
    	   
    	   
       }
       }
