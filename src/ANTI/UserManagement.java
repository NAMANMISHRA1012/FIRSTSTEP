package ANTI;
import java.util.*;

public class UserManagement {
	List<Customer> Customerlist = new ArrayList<Customer>();
	
	public UserManagement() {
		Customerlist.add(new Customer("Naman","naman@gmail","2million",7054,"regular","active"));
	}
	
       public void createUsers(Customer customer)
       { 
    	   Customerlist.add(customer);
       }
       public void updateUsers(Customer customer) {
    	   for(int i =0; i<Customerlist.size();i++) 
    	   {
    		   if (Customerlist.get(i).getEmail()==customer.getEmail()) { 
    			   Customerlist.set(i, customer);
    		   
    	   }
    	   }
    	   
       }
       public void deleteUsers(String email){
    	   for(int i =0; i<Customerlist.size();i++) 
    	   {
    		   if (Customerlist.get(i).getEmail().compareTo(email)==0) { 
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
    		  
    		   if(obj.getEmail().compareTo(email)== 0) {
    			   
    			   return obj.getCategory();
    		   }
    	   }
		return null;
    	   
    	   
    	   
       }
       }
