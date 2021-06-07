package ANTI;

import java.util.Scanner;

public class BillingClass {
	public void billing(String string , Car car,int duration) {
		//System.out.println(string);
		//System.out.println(car);
		int billBefore = car.getRentPerHour()* duration;
		System.out.println("Bill before discount = "+ billBefore+" INR");
		Discount d=  new Discount();
		double var = d.discount(string, billBefore);
		double billAfter = billBefore- var;
		System.out.println("Bill after discount = "+billAfter+" INR");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the currency in which you want to pay \n  enter\n 1: for eur\n 2 for usd\n 3 for gbp\n 4 for aud\n 5 for jpy ");
		int choice  = sc.nextInt();
		String currency = "INR";
		switch(choice) {
		case 1: billAfter = billAfter*0.00769;
				currency="EUR";
		        break;
		case 2 : billAfter =  billAfter*0.01;
				currency ="USD";
				break;
		case 3 : billAfter =  billAfter*0.011;
				currency ="JBP";
				break;
		case 4 : billAfter =  billAfter*0.018;
				currency ="AUD";
				break;
		case 5 : billAfter =  billAfter*1.67;
				currency ="JPY";
				break;
			
		default: System.out.println("bill will be genrated in inr");
			
		
		}
		System.out.println("Your bill is "+ billAfter + currency);
		
		
		
		
		
		
	}

}
