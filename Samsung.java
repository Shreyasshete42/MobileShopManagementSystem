package Marathon_Project;

public class Samsung extends shop{
	public void Galaxy() {
		System.out.println("       =                                                      =");
		System.out.println("       =              Please Selected The Series              =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Samsung Galaxy A Series");
		System.out.println("       2. Samsung Galaxy F Series");
		System.out.println("       3. Samsung Galaxy S Series");
		System.out.println("       4. Samsung Galaxy Z Series");
		System.out.println("       5. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("       ========================================================");
				System.out.println("       =                Samsung Galaxy A Series               =");
				System.out.println("       =                                                      =");
				Aseries AS = new Aseries();
				AS.a();
				break;
				
			case 2:
				System.out.println("       ========================================================");
				System.out.println("       =                Samsung Galaxy F Series               =");
				System.out.println("       =                                                      =");
				Fseries FS = new Fseries();
				FS.f();
				break;
				
			case 3:
				System.out.println("       ========================================================");
				System.out.println("       =                Samsung Galaxy S Series               =");
				System.out.println("       =                                                      =");
				Sseries SS = new Sseries();
				SS.s();
				break;
				
			case 4:
				System.out.println("       ========================================================");
				System.out.println("       =                Samsung Galaxy Z Series               =");
				System.out.println("       =                                                      =");
				Zseries ZS = new Zseries();
				ZS.z();
				break;
				
			default:
				S1();
				break;
		}
	}
}

class Aseries extends Samsung
{
	public void a() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Samsung Galaxy A14");
		System.out.println("       2. Samsung Galaxy A23");
		System.out.println("       3. Samsung Galaxy A34");
		System.out.println("       4. Samsung Galaxy A54");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("       Model Name: Samsung Galaxy A14");
				System.out.println("       Company Name: Samsung");
				System.out.println("       SIM Type: Dual Sim");
				System.out.println("       Display Size: 16.76cm(6.6 inch)");
				System.out.println("       Operating System: Android 13");
				System.out.println("       Processor Type: Exynos 1330");
				System.out.println("       RAM: 6GB & 8GB");
				System.out.println("       Internal Storage: 128GB");
				System.out.println("       Primary Camera: 50MP + 2MP");
				System.out.println("       Secondary Camera: 13MP");
				System.out.println("       Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("       Select The Variant: 1. 6GB & 128GB");
				System.out.println("                           2. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy A14 6GB & 128GB Variant");
						System.out.println("Rs. 17999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy A14 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 17999);
								a.add("Samsung Galaxy A14 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy A14 8GB & 128GB Variant");
						System.out.println("Rs. 19999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy A14 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 19999);
								a.add("Samsung Galaxy A14 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
			case 2:
				System.out.println("Model Name: Samsung Galaxy A23");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.76cm(6.6inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 695");
				System.out.println("RAM: 6GB & 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 5MP");
				System.out.println("Secondary Camera: 8MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy A23 6GB & 128GB Variant");
						System.out.println("Rs. 20999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy A23 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 20999);
								a.add("Samsung Galaxy A23 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy A23 8GB & 128GB Variant");
						System.out.println("Rs. 22999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy A23 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 22999);
								a.add("Samsung Galaxy A23 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
			case 3:
				System.out.println("Model Name: Samsung Galaxy A34");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.76cm(6.6inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mideatek Dimensity 1080");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 48MP + 8MP + 5MP");
				System.out.println("Secondary Camera: 13MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy A34 8GB & 128GB Variant");
						System.out.println("Rs. 27999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy A34 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 27999);
								a.add("Samsung Galaxy A34 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy A34 8GB & 256GB Variant");
						System.out.println("Rs. 29999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy A34 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 29999);
								a.add("Samsung Galaxy A34 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
			case 4:
				System.out.println("Model Name: Samsung Galaxy A54");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.76cm(6.6inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mideatek Dimensity 1080");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 48MP + 8MP + 5MP");
				System.out.println("Secondary Camera: 13MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy A54 6GB & 128GB Variant");
						System.out.println("Rs. 35499");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy A54 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 35499);
								a.add("Samsung Galaxy A54 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy A54 8GB & 128GB Variant");
						System.out.println("Rs. 37499");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung A54 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 164999);
								a.add("Samsung Galaxy A54 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
		}
		System.out.println();
		System.out.println("========================================================");
		System.out.println("Press 1 to Change the Model");
		System.out.println("Press 0 to Change the Brand");
		System.out.println("========================================================");
		n = sc.nextInt();
		if (n == 1) 
		{
			a();
		}
		else 
		{
			S1();
		}
	}
}

class Fseries extends Samsung
{
	public void f() {	
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Samsung Galaxy F04");
		System.out.println("       2. Samsung Galaxy F14");
		System.out.println("       3. Samsung Galaxy F34");
		System.out.println("       4. Samsung Galaxy F54");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Samsung Galaxy F04");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.51cm (6.5inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Mediatek Helio P35");
				System.out.println("RAM: 4GB");
				System.out.println("Internal Storage: 64GB");
				System.out.println("Primary Camera: 13MP + 2MP");
				System.out.println("Secondary Camera: 5MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Rs. 6499");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				int q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Samsung Galaxy F04 4GB & 64GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 6499);
						a.add("Samsung Galaxy F04 " +q );
						System.out.println(a);
						System.out.println();
						System.out.println("Press 1 for Continue Shopping");
						System.out.println("Press 2 for Bill");
						q = sc.nextInt();
						switch(q)
						{
						case 1:
							S1();
							break;
							
						case 2:
							bill();
							cart();
							break;
						}
						
					case 2:
						S1();
						break;
				}
			case 2:
				System.out.println("Model Name: Samsung Galaxy F14");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.76cm(6.5inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Exynos 1330");
				System.out.println("RAM: 4GB & 6GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 2MP");
				System.out.println("Secondary Camera: 13MP");
				System.out.println("Battery Capacity: 6000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 4GB & 128GB");
				System.out.println("                    2. 6GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy F14 4GB & 128GB Variant");
						System.out.println("Rs. 11490");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy F14 4GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 11490);
								a.add("Samsung Galaxy F14 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy F14 8GB & 128GB Variant");
						System.out.println("Rs. 12490");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy F14 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 12490);
								a.add("Samsung Galaxy F14 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
			case 3:
				System.out.println("Model Name: Samsung Galaxy F34");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.51cm(6.5inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Exynos 1280");
				System.out.println("RAM: 6GB & 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 8MP + 2MP");
				System.out.println("Secondary Camera: 13MP");
				System.out.println("Battery Capacity: 6000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy F34 6GB & 128GB Variant");
						System.out.println("Rs. 16499");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy F34 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 16499);
								a.add("Samsung Galaxy F34 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy F344 8GB & 128GB Variant");
						System.out.println("Rs. 18499");
						break;
				}
				break;
				
			case 4:
				System.out.println("Model Name: Samsung Galaxy F54");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.02cm(6.7inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Exynos 1380");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 108MP + 8MP + 2MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 6000mAh");
				System.out.println();
				System.out.println("Rs. 24999");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Samsung Galaxy F54 8GB & 256GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 24999);
						a.add("Samsung Galaxy F54 " +q );
						System.out.println(a);
						System.out.println();
						System.out.println("Press 1 for Continue Shopping");
						System.out.println("Press 2 for Bill");
						q = sc.nextInt();
						switch(q)
						{
						case 1:
							S1();
							break;
							
						case 2:
							bill();
							cart();
							break;
						}
						
					case 2:
						S1();
						break;
				}
				break;
				
		}
		System.out.println();
		System.out.println("========================================================");
		System.out.println("Press 1 to Change the Model");
		System.out.println("Press 0 to Change the Brand");
		System.out.println("========================================================");
		n = sc.nextInt();
		if (n == 1) 
		{
			f();
		}
		else 
		{
			S1();
		}
	}
}

class Sseries extends Samsung
{
	public void s() {		
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Samsung Galaxy S21");
		System.out.println("       2. Samsung Galaxy S22");
		System.out.println("       3. Samsung Galaxy S23");
		System.out.println("       4. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("       ========================================================");
				System.out.println("       =           Select Samsung Galaxy S21 Varient          =");
				System.out.println("       ========================================================");
				Samsung_S21 s21 = new Samsung_S21();
				s21.Galaxy_S21();
				break;
			case 2:
				System.out.println("       ========================================================");
				System.out.println("       =           Select Samsung Galaxy S22 Varient          =");
				System.out.println("       ========================================================");
				Samsung_S22 s22 = new Samsung_S22();
				s22.Galaxy_S22();
				break;
			case 3:
				System.out.println("       ========================================================");
				System.out.println("       =           Select Samsung Galaxy S23 Varient          =");
				System.out.println("       ========================================================");
				Samsung_S23 s23 = new Samsung_S23();
				s23.Galaxy_S23();
				break;
				
			default:
				Galaxy();
				break;
		}
	}
}

class Samsung_S21 extends Sseries
{

	public void Galaxy_S21() 
	{
		System.out.println();
		System.out.println("       1. Select Samsung Galaxy S21 FE");
		System.out.println("       2. Select Samsung Galaxy S21 Plus");
		System.out.println("       3. Select Samsung Galaxy S21 Ultra");
		System.out.println("       4. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Samsung Galaxy S21 FE");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.26cm (6.4 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Qualcomm Snapdragon 888");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 12MP + 12MP + 8MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 4500mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy S21 FE 8GB & 128GB Variant");
						System.out.println("Rs. 32999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy 21 FE 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 32999);
								a.add("Samsung Galaxy S21 FE " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy S21 FE 8GB & 256GB Variant");
						System.out.println("Rs. 34999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S21 FE 12GB & 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 34999);
								a.add("Samsung Galaxy S21 FE " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
			case 2:
				System.out.println("Model Name: Samsung Galaxy S21 Plus");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.02cm (6.7 inch)");
				System.out.println("Operating System: Android 10");
				System.out.println("Processor Type: Exynos 2100 Processor");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 64MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 10MP");
				System.out.println("Battery Capacity: 4800mAh");
				System.out.println();
				System.out.println("Rs. 59990");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				int q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Samsung Galaxy S21 Plus 8GB & 128GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 164999);
						a.add("Samsung Galaxy Z Fold 5 " +q );
						System.out.println(a);
						System.out.println();
						System.out.println("Press 1 for Continue Shopping");
						System.out.println("Press 2 for Bill");
						q = sc.nextInt();
						switch(q)
						{
						case 1:
							S1();
							break;
							
						case 2:
							bill();
							cart();
							break;
						}
						
					case 2:
						S1();
						break;
				}
				break;
				
			case 3:
				System.out.println("Model Name: Samsung Galaxy S21 Ultra");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.27 cm (6.8 inch)");
				System.out.println("Operating System: Android 11");
				System.out.println("Processor Type: Samsung Exynos 2100");
				System.out.println("RAM: 12GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 108 MP + 10 MP + 10 MP + 12 MP");
				System.out.println("Secondary Camera: 40MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Rs. 66999");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Samsung Galaxy S21 Ultra 12GB & 256GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 164999);
						a.add("Samsung Galaxy S21 Ultra " +q );
						System.out.println(a);
						System.out.println();
						System.out.println("Press 1 for Continue Shopping");
						System.out.println("Press 2 for Bill");
						q = sc.nextInt();
						switch(q)
						{
						case 1:
							S1();
							break;
							
						case 2:
							bill();
							cart();
							break;
						}
						
					case 2:
						S1();
						break;
				}
				break;
				
			default:
				s();
				break;
		}
		
		System.out.println();
		System.out.println("========================================================");
		System.out.println("Press 1 to Change the Model");
		System.out.println("Press 0 to Change the Brand");
		System.out.println("========================================================");
		n = sc.nextInt();
		if (n == 1) 
		{
			s();
		}
		else 
		{
			S1();
		}
	}
}

class Samsung_S22 extends Sseries
{

	public void Galaxy_S22() 
	{
		System.out.println();
		System.out.println("       1. Select Samsung Galaxy S22");
		System.out.println("       2. Select Samsung Galaxy S22 Plus");
		System.out.println("       3. Select Samsung Galaxy S22 Ultra");
		System.out.println("       4. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Samsung Galaxy S22");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 15.49cm(6.1inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 8 Gen 1");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 12MP + 10MP");
				System.out.println("Secondary Camera: 10MP");
				System.out.println("Battery Capacity: 3700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy S22 8GB & 128GB Variant");
						System.out.println("Rs. 39999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S22 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 39999);
								a.add("Samsung Galaxy S22 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy S22 8GB & 256GB Variant");
						System.out.println("Rs. 50499");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S22 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 50499);
								a.add("Samsung Galaxy S22 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
						
			case 2:
				System.out.println("Model Name: Samsung Galaxy S22 Plus");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.76cm(6.6inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 8 Gen 1");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 12MP + 10MP");
				System.out.println("Secondary Camera: 10MP");
				System.out.println("Battery Capacity: 4500mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy S22 Plus 8GB & 128GB Variant");
						System.out.println("Rs. 85999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S22 Plus 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 85999);
								a.add("Samsung Galaxy S22 Plus " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy S22 Plus 8GB & 256GB Variant");
						System.out.println("Rs. 88999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S22 Plus 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 88999);
								a.add("Samsung Galaxy S22 Plus " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
						
			case 3:
				System.out.println("Model Name: Samsung Galaxy S22 Ultra");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.27cm(6.8inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 8 Gen 1");
				System.out.println("RAM: 12GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 108MP + 12MP + 10MP + 10MP");
				System.out.println("Secondary Camera: 40MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Rs. 85975");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				int q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Samsung Galaxy S22 Ultra 12GB & 256GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 85975);
						a.add("Samsung Galaxy S22 Ultra " +q );
						System.out.println(a);
						System.out.println();
						System.out.println("Press 1 for Continue Shopping");
						System.out.println("Press 2 for Bill");
						q = sc.nextInt();
						switch(q)
						{
						case 1:
							S1();
							break;
							
						case 2:
							bill();
							cart();
							break;
						}
						
					case 2:
						S1();
						break;
				}
				
			default:
				Galaxy();
				break;
		}
		
		System.out.println();
		System.out.println("========================================================");
		System.out.println("Press 1 to Change the Model");
		System.out.println("Press 0 to Change the Brand");
		System.out.println("========================================================");
		n = sc.nextInt();
		if (n == 1) 
		{
			s();
		}
		else 
		{
			S1();
		}
	}
}

class Samsung_S23 extends Sseries
{

	public void Galaxy_S23() 
	{
		System.out.println();
		System.out.println("       1. Select Samsung Galaxy S23");
		System.out.println("       2. Select Samsung Galaxy S23 Plus");
		System.out.println("       3. Select Samsung Galaxy S23 Ultra");
		System.out.println("       4. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Samsung Galaxy S23");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 15.49cm (6.1 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Qualcomm Snapdragon 8 Gen 2");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 10MP + 12MP");
				System.out.println("Secondary Camera: 12MP");
				System.out.println("Battery Capacity: 3900mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy S23 8GB & 128GB Variant");
						System.out.println("Rs. 74999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S23 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 74999);
								a.add("Samsung Galaxy S23 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy S23 8GB & 256GB Variant");
						System.out.println("Rs. 79999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S23 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 79999);
								a.add("Samsung Galaxy S23 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;		
			case 2:
				System.out.println("Model Name: Samsung Galaxy S23+");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.76cm (6.6 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Qualcomm Snapdragon 8 Gen 2");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 256GB & 512GB");
				System.out.println("Primary Camera: 50MP + 10MP + 12MP");
				System.out.println("Secondary Camera: 12MP");
				System.out.println("Battery Capacity: 4700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 256GB");
				System.out.println("                    2. 8GB & 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy S23+ 8GB & 256GB Variant");
						System.out.println("Rs. 94999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S23+ 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 94999);
								a.add("Samsung Galaxy S23+ " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy S23+ 8GB & 512GB Variant");
						System.out.println("Rs. 104999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S23+ 8GB & 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 104999);
								a.add("Samsung Galaxy S23+ " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;			
			case 3:
				System.out.println("Model Name: Samsung Galaxy S23 Ultra");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.27cm(6.8inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Qualcomm Snapdragon 8 Gen 2");
				System.out.println("RAM: 12GB");
				System.out.println("Internal Storage: 256GB, 512GB & 1TB");
				System.out.println("Primary Camera: 200MP + 10MP + 12MP + 10MP");
				System.out.println("Secondary Camera: 12MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 12GB & 256GB");
				System.out.println("                    2. 12GB & 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy S23 Ultra 12GB & 256GB Variant");
						System.out.println("Rs. 114999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S23 Ultra 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 114999);
								a.add("Samsung Galaxy S23 Ultra " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy S23 Ultra 12GB & 512GB Variant");
						System.out.println("Rs. 134999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S23 Ultra 12GB & 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 134999);
								a.add("Samsung Galaxy S23 Ultra " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
						
					case 3:
						System.out.println("Samsung Galaxy S23 Ultra 12GB & 1TB Variant");
						System.out.println("Rs. 154999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy S23 Ultra 12GB & 1TB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 154999);
								a.add("Samsung Galaxy S23 Ultra " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
			default:
				Galaxy();
				break;
		}
		
		System.out.println();
		System.out.println("========================================================");
		System.out.println("Press 1 to Change the Model");
		System.out.println("Press 0 to Change the Brand");
		System.out.println("========================================================");
		n = sc.nextInt();
		if (n == 1) 
		{
			s();
		}
		else 
		{
			S1();
		}
	}
}
class Zseries extends Samsung
{
	public void z() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Samsung Galaxy Z Flip 4");
		System.out.println("       2. Samsung Galaxy Z Fold 4");
		System.out.println("       3. Samsung Galaxy Z Flip 5");
		System.out.println("       4. Samsung Galaxy Z Fold 5");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Samsung Galaxy Z Flip 4");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.02cm(6.7inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 8+ Gen 1");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 12MP & 12MP");
				System.out.println("Secondary Camera: 10MP");
				System.out.println("Battery Capacity: 3700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy Z Flip 4 8GB & 128GB Variant");
						System.out.println("Rs. 79999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Flip 4 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 79999);
								a.add("Samsung Galaxy Z Flip 4 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy Z Flip 4 8GB & 256GB Variant");
						System.out.println("Rs. 94999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Flip 4 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 94999);
								a.add("Samsung Galaxy Z Flip 4 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
			case 2:
				System.out.println("Model Name: Samsung Galaxy Z Fold 4");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 19.3 cm (7.6 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 8+ Gen 1");
				System.out.println("RAM: 12GB");
				System.out.println("Internal Storage: 256GB & 512GB");
				System.out.println("Primary Camera: 50MP + 12MP + 10MP");
				System.out.println("Secondary Camera: 13MP");
				System.out.println("Battery Capacity: 4400mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 12GB & 256GB");
				System.out.println("                    2. 12GB & 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy Z Fold 4 12GB & 256GB Variant");
						System.out.println("Rs. 142999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Fold 4 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 142999);
								a.add("Samsung Galaxy Z Fold 4 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy Z Fold 4 12GB & 512GB Variant");
						System.out.println("Rs. 154999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Fold 4 12GB & 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 154999);
								a.add("Samsung Galaxy Z Fold 4 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
			case 3:
				System.out.println("Model Name: Samsung Galaxy Z Flip 5");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.02 cm (6.7 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Snapdragon 8 Gen 2");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 256GB & 512GB");
				System.out.println("Primary Camera: 12MP + 12MP ");
				System.out.println("Secondary Camera: 10MP");
				System.out.println("Battery Capacity: 3700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 256GB");
				System.out.println("                    2. 8GB & 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy Z Flip 5 8GB & 256GB Variant");
						System.out.println("Rs. 99999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Flip 5 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 99999);
								a.add("Samsung Galaxy Z Flip 5 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy Z Flip 5 8GB & 512GB Variant");
						System.out.println("Rs. 104999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Flip 5 8GB & 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 104999);
								a.add("Samsung Galaxy Z Flip 5 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
				
			case 4:
				System.out.println("Model Name: Samsung Galaxy Z Fold 5");
				System.out.println("Company Name: Samsung");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 15.75 cm (6.2 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Snapdragon 8 Gen 2");
				System.out.println("RAM: 12GB");
				System.out.println("Internal Storage: 256GB & 512GB");
				System.out.println("Primary Camera: 50MP + 12MP + 10MP");
				System.out.println("Secondary Camera: 10MP + 4MP");
				System.out.println("Battery Capacity: 4400mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 12GB & 256GB");
				System.out.println("                    2. 12GB & 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Samsung Galaxy Z Fold 5 12GB & 256GB Variant");
						System.out.println("Rs. 154999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Fold 5 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 154999);
								a.add("Samsung Galaxy Z Fold 5 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
					
					case 2:
						System.out.println("Samsung Galaxy Z Fold 5 12GB & 512GB Variant");
						System.out.println("Rs. 164999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Samsung Galaxy Z Fold 5 12GB & 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 164999);
								a.add("Samsung Galaxy Z Fold 5 " +q );
								System.out.println(a);
								System.out.println();
								System.out.println("Press 1 for Continue Shopping");
								System.out.println("Press 2 for Bill");
								q = sc.nextInt();
								switch(q)
								{
								case 1:
									S1();
									break;
									
								case 2:
									bill();
									cart();
									break;
								}
								
							case 2:
								S1();
								break;
						}
						break;
				}
				break;
		}
		System.out.println();
		System.out.println("========================================================");
		System.out.println("Press 1 to Change the Model");
		System.out.println("Press 0 to Change the Brand");
		System.out.println("========================================================");
		n = sc.nextInt();
		if (n == 1) 
		{
			z();
		}
		else 
		{
			S1();
		}
	}	
}
