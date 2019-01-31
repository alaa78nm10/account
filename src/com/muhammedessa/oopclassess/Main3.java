package com.muhammedessa.oopclassess;


import java.util.Date;

//Creating multiple objects by one type only




//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods


		
public class Main3 {
	
	public static void main(String[] args){ 
		System.out.println("Welcome to the ATM: Press any key to continue\n");
		//make private variables

		Account ac=new Account(); // Create an account object   
		ac.insert(832345,"Muhammed",3000);  
		ac.display();  
		ac.checkBalance();  
		ac.deposit(40000);  
		ac.checkBalance();  
		ac.withdraw(15000);  
		ac.checkBalance();
		Date date = new Date();
		System.out.printf( "Current Date/time: %tc", date );
		 
        // Â‰« ﬁ„‰« »⁄—÷ «· «—ÌŒ ›ﬁÿ
        System.out.printf( "\nCurrent Date: %tF", date );
 
        // Â‰« ﬁ„‰« »⁄—÷ «·Êﬁ  ›ﬁÿ
        System.out.printf( "\nCurrent time: %tr", date );
   
      
         

		
		
		
		
		
		//date time
		
		}

}





