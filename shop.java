package Marathon_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class shop {
static ArrayList a = new ArrayList<>();
	
	static double bill;
	
	public void bill() {
		cart();

		System.out.println("Your total bill is ");
		//double bill;
//		double cgst = bill * 0.09;
//		double sgst = bill * 0.09;
//		System.out.println("cgst " + cgst);
//		System.out.println("sgst " + sgst);
		System.out.println("Total Amount is: " + (bill));

		
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Press 1 Back to Main Menu");
		System.out.println("Press 2 for exit");
		System.out.println();
		int v= s.nextInt();
		switch (v) {
		case 1:
			S1();
			break;
		case 2:
			System.out.println("       ===============================================");
			System.out.println("       =                  Thank you                  =");
			System.out.println("       ===============================================");
			System.exit(0);
		    break;
		}
		
		
		//mainmenu();
	}
	public void cart() {
		if (a.size() == 0) {
			System.out.println("Your order list is empty please order");
			S1();
		}
		System.out.println();
		System.out.println("Your order is");
	
		for (Object o : a) {
			System.out.println(o);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Do you want to remove?");
		System.out.println();
		System.out.println("Press 1 to remove");
		System.out.println("Press 2 to continue");
		System.out.println();
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Enter the number which you want to remove");
			n = sc.nextInt();
			a.remove(n - 1);
			cart();
		} else if (n == 2) {
			return;
		}
	}
	Scanner sc = new Scanner(System.in); 
	
	public void S1() 
	{
		System.out.println("       ========================================================");
		System.out.println("       =                                                      =");
		System.out.println("       =           Please Select The Brand of Mobile          =");
		System.out.println("       =                                                      =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("        1. Apple");
		System.out.println("        2. Samsung");
		System.out.println("        3. Motorola");
		System.out.println("        4. Vivo");
		System.out.println("        5. IQOO");
		System.out.println("        0. Exit");
		
		int n = sc.nextInt();
		switch(n) 
		{
			case 1:				
				System.out.println("       ========================================================");
				System.out.println("       =             You Have Selected Apple Brand            =");
				System.out.println("       =                                                      =");
				Apple i = new Apple();
				i.iPhone();
				break;

			case 2:
				System.out.println("       ========================================================");
				System.out.println("       =            You Have Selected Samsung Brand           =");
				System.out.println("       =                                                      =");
				Samsung s = new Samsung();
				s.Galaxy();
				break;
			case 3:
				System.out.println("       ========================================================");
				System.out.println("       =             You Have Selected Motorola Brand         =");
				System.out.println("       =                                                      =");
				Motorola m = new Motorola();
				m.Moto();
				break;
				
			case 4:
				System.out.println("       ========================================================");
				System.out.println("       =             You Have Selected Vivo Brand             =");
				System.out.println("       =                                                      =");
				Vivo v = new Vivo();
				v.VV();
				break;
				
			case 5:
				System.out.println("       ========================================================");
				System.out.println("       =             You Have Selected IQOO Brand             =");
				System.out.println("       =                                                      =");
				IQOO IQ= new IQOO();
				IQ.Q();
				break;
	
			default:
				System.exit(0);
				break;
		}
	}

}
