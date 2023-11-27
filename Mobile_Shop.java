package Marathon_Project;

import java.util.ArrayList;
import java.util.Scanner;

//abstraction
interface Regi {
	 void signup();

	 void login();
}

//Inheritance
class Registration implements Regi 
{
	String fname;
	String lname;
	String gender;
	private long contact;
	String email = "admin";
	String password = "admin";

	public long getContact() 
	{
		System.out.println();
		return contact;
	}

	public void setContact(long contact) 
	{
		this.contact = contact;
	}
	

	public void signup() // Method Overriding
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("       ===============================================");
	    System.out.println("       =           Welcome to Sign Up Page           =");
	    System.out.println("       =                                             =");
	    System.out.println("       =    Please fill out the following details:   =");
	    System.out.println("       =                                             =");
	    System.out.println("       ===============================================");
	    System.out.println();
		fname();
		lname();
		gender();
		Contact();
		System.out.println("Enter the Email");
		email = sc.nextLine();
		System.out.println("Enter the Password");
		password = sc.nextLine();
		login();
	}

	public void login() // Method Overriding
	{
		System.out.println();
		System.out.println("       ===============================================");
		System.out.println("       =             Welcome to Login Page           =");
		System.out.println("       =                                             =");
		System.out.println("       =        Please enter your login details:     =");
		System.out.println("       =                                             =");
		System.out.println("       ===============================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = sc.nextLine();
		System.out.println("Enter the password");
		String pass = sc.nextLine();
		if (email.equals(this.email) && pass.equals(this.password)) {
			System.out.println();
			System.out.println("Successful");
		} else {
			System.out.println();
			System.out.println("Enter the valid Password");
			login();
		}
	}

	public void Contact() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		long contact = sc.nextLong();
		if (contact > 999999999l && contact < 10000000000L && (contact > 6666666666L || contact > 7777777777L || contact > 8888888888L)) 
		{
			this.contact = contact;
		} 
		else 
		{
			System.out.println();
			System.out.println("Please enter valid 10 digit number");
			Contact();
		}
	}
	
	public void fname() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Name");
		String fname = sc.next();
		if (fname.length() < 2) {
			System.out.println("The First Name Should Have Atleast 2 Characters");
			fname();
		} else {
			this.fname = fname;
		}
	}
	
	public void lname() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Last Name");
		String lname = sc.next();
		if (lname.length() < 2) {
			System.out.println("The Last Name Should Have Atleast 2 Characters");
			lname();
		} else {
			this.lname = lname;
		}
	}
	
	public void gender() {
		Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your gender (M/F):");
        String gender = sc.nextLine();

        if (gender.equalsIgnoreCase("M")) {
            this.gender = gender;
        } else if (gender.equalsIgnoreCase("F")) {
        	this.gender = gender;
        } else {
            System.out.println("Invalid gender input.");
            gender();
        }
	}
}

public class Mobile_Shop 
{
	static 
	{
		System.out.println("       ========================================================");
		System.out.println("       =                                                      =");
		System.out.println("       =               Welecome To Mobile Store               =");
		System.out.println("       =                                                      =");
		System.out.println("       ========================================================");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("       Enter 1 for Signup");
		System.out.println("       Enter 2 for Login");
		System.out.println("       Enter 3 for Exit");
		Regi r = new Registration(); //Upcasting
		
		//System.out.println(r);
		shop s = new shop();
		int n = sc.nextInt();
		switch (n) 
		{
			case 1:
				r.signup();
				s.S1();
				break;
		
			case 2:
				r.login();
				s.S1();
				break;
				
			case 3:
				System.exit(0);
				break;
				
			default:
				System.out.println();
				System.out.println("       Please enter the valid input");
				main(null);
				break;
		}
	}
}
