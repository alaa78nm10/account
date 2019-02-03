package com.muhammedessa.oopclassess;


import java.util.Date;

class Bank extends Account{

	@Override
	void insert(int a, String n, float amt) {
		setacc_no(a);
		setname(n); 
		setamount(amt);
		setDate();
		
	}      // Inheritance & abstract
	
}	
public class Main3 {
	
	public static void main(String[] args){ 
		System.out.println("Welcome to the ATM \n");
		                        //make private variables
	     //  I can't Create an account object directly with out use Inheritance 
		Bank b = new Bank(); 
		
		b.insert(832345,"Muhammed",3000);  
		b.display();  
		b.checkBalance();  
		b.deposit(40000);  
		b.checkBalance();  
		b.withdraw(15000);  
		b.checkBalance();
		
		Date date = new Date();             // Create object Date
		System.out.printf( "Current Date/time: %tc", date );
		 
                                            // Â‰« ﬁ„‰« »⁄—÷ «· «—ÌŒ ›ﬁÿ
        System.out.printf( "\nCurrent Date: %tF", date );
 
                                            // Â‰« ﬁ„‰« »⁄—÷ «·Êﬁ  ›ﬁÿ
        System.out.printf( "\nCurrent time: %tr", date );
		
		}

}





