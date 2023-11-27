package Marathon_Project;

public class Motorola extends shop{

	public void Moto() {
		System.out.println("       =                                                      =");
		System.out.println("       =              Please Selected The Series              =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Motorola g Series");
		System.out.println("       2. Motorola Edge Series");
		System.out.println("       3. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("       ========================================================");
				System.out.println("       =                   Motorola g Series                  =");
				System.out.println("       =                                                      =");
				gSeries gS = new gSeries();
				gS.g();
				break;
			
			case 2:
				System.out.println("       ========================================================");
				System.out.println("       =                 Motorola Edge Series                 =");
				System.out.println("       =                                                      =");
				Edge E = new Edge();
				E.Eg();
				break;
				
			default:
				S1();
				break;
		}
	}	
}

class gSeries extends Motorola
{
	public void g() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       Motorola g14");
		System.out.println("       Motorola g54");
		System.out.println("       Motorola g84");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Motorola g14");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.51 cm (6.5 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Unisoc T616");
				System.out.println("RAM: 4GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 2MP");
				System.out.println("Secondary Camera: 8MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Rs. 8499");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				int q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Motorola g14 4GB & 256GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 8499);
						a.add("Motorola g14 " +q );
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
				System.out.println("Model Name: Motorola g54");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.51 cm (6.5 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 7020");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 8MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 6000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Motorola g54 8GB & 128GB Variant");
						System.out.println("Rs. 13999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola g54 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 13999);
								a.add("Motorola g54 " +q );
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
						System.out.println("Motorola g54 12GB & 256GB Variant");
						System.out.println("Rs. 15999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola g54 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 15999);
								a.add("Motorola g54 " +q );
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
				System.out.println("Model Name: Motorola g84");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.51 cm (6.5 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: ");
				System.out.println("RAM: 12GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 50MP + 8MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 6000mAh");
				System.out.println();
				System.out.println("Rs. 18999");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Motorola g84 12GB & 256GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 18999);
						a.add("Motorola g84 " +q );
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
			g();
		}
		else 
		{
			S1();
		}
	}
}

class Edge extends Motorola
{
	public void Eg() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Motorola Edge 30");
		System.out.println("       2. Motorola Edge 30 Fusion");
		System.out.println("       3. Motorola Edge 30 Ultra");
		System.out.println("       4. Motorola Edge 40 Neo");
		System.out.println("       5. Motorola Edge 40");
		System.out.println("       6. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Motorola Edge 30");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.64 cm (6.55 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 778G Plus");
				System.out.println("RAM: 6GB & 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 50MP +2MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 4020mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Motorola Edge 30 6GB & 128GB Variant");
						System.out.println("Rs. 24999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola Edge 30 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 24999);
								a.add("Motorola Edge 30 " +q );
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
						System.out.println("Motorola Edge 30 8GB & 256GB Variant");
						System.out.println("Rs. 26999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola Edge 30 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 26999);
								a.add("Motorola Edge 30 " +q );
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
				System.out.println("Model Name: Motorola Edge 30 Fusion");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.64 cm (6.55 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 888+");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 13MP + 2MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 4400mAh");
				System.out.println();
				System.out.println("Rs. 34999");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				int q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Motorola Edge 30 Fusion 8GB & 128GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 34999);
						a.add("Motorola Edge 40 " +q );
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
				System.out.println("Model Name: Motorola Edge 30 ultra");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.94 cm (6.67 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 8+ Gen 1");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 200MP + 50MP + 12MP");
				System.out.println("Secondary Camera: 60MP");
				System.out.println("Battery Capacity: 4610mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Motorola Edge 30 Ultra 6GB & 128GB Variant");
						System.out.println("Rs. 49999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola Edge 30 Ultra 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 49999);
								a.add("Motorola Edge 30 Ultra " +q );
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
						System.out.println("Motorola Edge 30 Ultra 8GB & 256GB Variant");
						System.out.println("Rs. 54999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola Edge 30 Ultra 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 54999);
								a.add("Motorola Edge 30 Ultra " +q );
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
				System.out.println("Model Name: Motorola Edge 40 Neo");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.64 cm (6.55 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 7030");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 13MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Motorola Edge 40 Neo 8GB & 128GB Variant");
						System.out.println("Rs. 22999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola Edge 40 Neo 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 22999);
								a.add("Motorola Edge 40 Neo " +q );
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
						System.out.println("Motorola Edge 40 Neo 12GB & 256GB Variant");
						System.out.println("Rs. 24999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Motorola Edge 40 Neo 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 24999);
								a.add("Motorola Edge 40 Neo " +q );
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
				
			case 5:
				System.out.println("Model Name: Motorola Edge 40");
				System.out.println("Company Name: Motorola");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.51 cm (6.5 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 8020");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 50MP + 13MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 4400mAh");
				System.out.println();
				System.out.println("Rs. 27999");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Motorola Edge 40 8GB & 256GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 27999);
						a.add("Motorola Edge 40 " +q );
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
			Eg();
		}
		else 
		{
			S1();
		}
	}	

}
