package Marathon_Project;

public class Vivo extends shop{
	public void VV() {
		System.out.println("       =                                                      =");
		System.out.println("       =              Please Selected The Series              =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Vivo V Series");
		System.out.println("       2. Vivo X Series");
		System.out.println("       3. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("       ========================================================");
				System.out.println("       =                     Vivo V Series                    =");
				System.out.println("       =                                                      =");
				VSeries Vs = new VSeries();
				Vs.v();
				break;
				
			case 2:
				System.out.println("       ========================================================");
				System.out.println("       =                     Vivo X Series                    =");
				System.out.println("       =                                                      =");
				XSeries Xs = new XSeries();
				Xs.x();
				break;
							
			default:
				S1();
				break;
		}
	}
}

class VSeries extends Vivo
{
	public void v() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Vivo V27");
		System.out.println("       2. Vivo V27 Pro");
		System.out.println("       3. Vivo V29e");
		System.out.println("       4. Vivo V29");
		System.out.println("       5. Vivo V29 Pro");
		System.out.println("       6. Back");
		
		int n = sc.nextInt(); 
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Vivo V27");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 Inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 7200");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 8MP + 2MP");
				System.out.println("Secondary Camera: 50MP");
				System.out.println("Battery Capacity: 4600mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Vivo V27 8GB & 128GB Variant");
						System.out.println("Rs. 30999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V27 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 30999);
								a.add("Vivo V27 " +q );
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
						System.out.println("Vivo V27 12GB & 256GB Variant");
						System.out.println("Rs. .35999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V27 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 35999);
								a.add("Vivo V27 " +q );
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
				System.out.println("Model Name: Vivo V27 Pro");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 8200");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 8MP + 2MP ");
				System.out.println("Secondary Camera: 50MP");
				System.out.println("Battery Capacity: 4600mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				System.out.println("                    3. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Vivo V27 Pro 8GB & 128GB Variant");
						System.out.println("Rs. 35990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V27 Pro 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 35999);
								a.add("Vivo V27 Pro " +q );
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
						System.out.println("Vivo V27 Pro 8GB & 256GB Variant");
						System.out.println("Rs. .37999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V27 Pro 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 37999);
								a.add("Vivo V27 Pro " +q );
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
						System.out.println("Vivo V27 Pro 12GB & 256GB Variant");
						System.out.println("Rs. 42999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V27 Pro 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 42999);
								a.add("Vivo V27 Pro " +q );
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
				}
				break;
				
			case 3:
				System.out.println("Model Name: Vivo V29e");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Snapdragon 695");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 64MP + 8MP");
				System.out.println("Secondary Camera: 50MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Vivo V29e 8GB & 128GB Variant");
						System.out.println("Rs. 26999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V29e 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 26999);
								a.add("Vivo V29e " +q);
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
						System.out.println("Vivo V29e 8GB & 256GB Variant");
						System.out.println("Rs. .28999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V29e 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 28999);
								a.add("Vivo V29e " +q );
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
				System.out.println("Model Name: Vivo V29");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Snapdragon 778G");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 8MP + 2MP");
				System.out.println("Secondary Camera: 50MP");
				System.out.println("Battery Capacity: 4600mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Vivo V29 8GB & 128GB Variant");
						System.out.println("Rs. 32999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V29 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 32999);
								a.add("Vivo V29 " +q );
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
						System.out.println("Vivo V29 12GB & 256GB Variant");
						System.out.println("Rs. .36999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V29 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 36999);
								a.add("Vivo V29 " +q );
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
				System.out.println("Model Name: Vivo V29 Pro");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 8200");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 50MP + 12MP + 8MP");
				System.out.println("Secondary Camera: 50MP");
				System.out.println("Battery Capacity: 4600mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 256GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Vivo V29 Pro 8GB & 256GB Variant");
						System.out.println("Rs. 39999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V29 Pro 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 39999);
								a.add("Vivo V29 Pro " +q );
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
						System.out.println("Vivo V29 Pro 12GB & 256GB Variant");
						System.out.println("Rs. .42999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo V29 Pro 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 42999);
								a.add("Vivo V29 Pro " +q );
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
			v();
		}
		else 
		{
			S1();
		}
	}
}

class XSeries extends Vivo
{
	public void x() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Vivo X90");
		System.out.println("       2. Vivo X90 Pro");
		System.out.println("       3. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: Vivo X90");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 9200");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 50MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 4810mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 256GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Vivo X90 8GB & 256GB Variant");
						System.out.println("Rs. 59999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo X90 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 59999);
								a.add("Vivo X90 " +q );
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
						System.out.println("Vivo X90 12GB & 256GB Variant");
						System.out.println("Rs. 63999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected Vivo X90 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 63999);
								a.add("Vivo X90 " +q );
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
				System.out.println("Model Name: Vivo X90 Pro");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 9200");
				System.out.println("RAM: 12GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 50MP + 50MP + 12MP");
				System.out.println("Secondary Camera: 32MP");
				System.out.println("Battery Capacity: 4870mAh");
				System.out.println();
				System.out.println("Rs. 77419");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				int q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected Vivo X90 Pro 12GB & 256GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 77419);
						a.add("Vivo X90 Pro " +q );
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
			x();
		}
		else 
		{
			S1();
		}
	}

}
