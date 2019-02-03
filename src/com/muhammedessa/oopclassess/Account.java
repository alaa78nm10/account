package com.muhammedessa.oopclassess;

import java.time.LocalDate;
import java.util.Date;


public abstract class Account { // abstract class
	private int acc_no;        //  use private variables 
	private String name;  
	private float amount;  
	private LocalDate creationDate;
                               //  Method to initialize object
	
	
	
	public void setacc_no(int n) {

		this.acc_no=n;
	}
	public void setname(String n) {

		this.name=n;
	}
	public void setamount(float n) {

		this.amount=n;
	}
	public void setDate() {

		this.creationDate=LocalDate.now();
	}
	
	
	abstract void insert(int a,String n,float amt);/*{  
	acc_no=a;  
	name=n;  
	amount=amt;  
	creationDate=LocalDate.now();
	}  */
	                           //deposit method  ﬁÌ„… «·«Ìœ«⁄  
	
	 void deposit(float amt) {
		 amount=amount+amt;  
			System.out.println(amt+" deposited"); 
	 }
	 void withdraw(float amt) {
		 
				if(amount<amt){  
				System.out.println("Insufficient Balance");  
				}else{  
				amount=amount-amt;  
				System.out.println(amt+" withdrawn");  
				}  
				}  
	
    //method to check the balance of the account       balance ﬁÌ„… «·Õ”«»
	void checkBalance(){System.out.println("Balance is: "+amount);}  
	//method to display the values of an object  
	void display(){System.out.println(acc_no+" "+name+" "+amount+" "+creationDate);}  
} 





