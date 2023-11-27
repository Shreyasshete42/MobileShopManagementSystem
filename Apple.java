package Marathon_Project;

public class Apple extends shop{
	public void iPhone() {
		System.out.println("       =                                                      =");
		System.out.println("       =                  Selected The Series                 =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. iPhone 12");
		System.out.println("       2. iPhone 13");
		System.out.println("       3. iPhone 14");
		System.out.println("       4. iPhone 15");
		System.out.println("       5. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("       ========================================================");
				System.out.println("       =                       Iphone 12                      =");
				System.out.println("       =                                                      =");
				iPhone12 ip12 = new iPhone12();
				ip12.iPh12();
				break;
			
			case 2:
				System.out.println("       ========================================================");
				System.out.println("       =                       Iphone 13                      =");
				System.out.println("       =                                                      =");
				iPhone13 ip13 = new iPhone13();
				ip13.iPh13();
				break;
				
			case 3:
				System.out.println("       ========================================================");
				System.out.println("       =                       Iphone 14                      =");
				System.out.println("       =                                                      =");
				iPhone14 ip14 = new iPhone14();
				ip14.iPh14();
				break;
				
			case 4:
				System.out.println("       ========================================================");
				System.out.println("       =                       Iphone 15                      =");
				System.out.println("       =                                                      =");
				iPhone15 ip15 = new iPhone15();
				ip15.iPh15();
				break;
				
			case 5:
				S1();
				break;
			
			default:
				S1();
				break;
		}
	}
}

class iPhone12 extends Apple{
	public void iPh12() 
	{
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Iphone 12 Mini");
		System.out.println("       2. Iphone 12 ");
		System.out.println("       3. Iphone 12 Pro");
		System.out.println("       4. Iphone 12 Pro Max");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n) 
		{
			case 1:
				System.out.println("       Model Name: iPhone 12 Mini");
				System.out.println("       Company Name: Apple");
				System.out.println("       SIM Type: Dual SIM");
				System.out.println("       Display Size: 13.72cm(5.4 inch)");
				System.out.println("       Operating System: iOS 14");
				System.out.println("       Processor Type: A14 Bionic Chip");
				System.out.println("       Internal Storage: 64GB, 128GB & 256GB");
				System.out.println("       Primary Camera: 12MP + 12MP");
				System.out.println("       Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("       Select The Variant: 1. 64GB");
				System.out.println("                           2. 128GB");
				System.out.println("                           3. 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 12 Mini 64GB Variant");
						System.out.println("Rs. 36999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Mini 64GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 36999);
								a.add("iPhone 12 Mini " +q );
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
						System.out.println("iPhone 12 Mini 128GB Variant");
						System.out.println("Rs. 42999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Mini 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 42999);
								a.add("iPhone 12 Mini " +q );
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
						System.out.println("iPhone 12 Mini 256GB Variant");
						System.out.println("Rs. 56999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Mini 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 56999);
								a.add("iPhone 12 Mini " +q );
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
				System.out.println("Model Name: iPhone 12");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 14");
				System.out.println("Processor Type: A14 Bionic Chip");
				System.out.println("Internal Storage: 64GB, 128GB & 256GB");
				System.out.println("Primary Camera: 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("Select The Variant: 1. 64GB");
				System.out.println("                    2. 128GB");
				System.out.println("                    3. 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 12 64GB Variant");
						System.out.println("Rs. 39999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 64GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 39999);
								a.add("iPhone 12 " +q );
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
						System.out.println("iPhone 12 128GB Variant");
						System.out.println("Rs. 43999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 43999);
								a.add("iPhone 12 " +q );
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
						System.out.println("iPhone 12 256GB Variant");
						System.out.println("Rs. 63999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 63999);
								a.add("iPhone 12 " +q );
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
				System.out.println("Model Name: iPhone 12 Pro");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 14");
				System.out.println("Processor Type: A14 Bionic Chip");
				System.out.println("Internal Storage: 256GB & 512GB");
				System.out.println("Primary Camera: 12MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 12 Pro 128GB Variant");
						System.out.println("Rs. 78999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Pro 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 78999);
								a.add("iPhone 12 Pro " +q );
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
						System.out.println("iPhone 12 Pro 256GB Variant");
						System.out.println("Rs. 88999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Pro 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 88999);
								a.add("iPhone 12 Pro " +q );
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
				System.out.println("Model Name: iPhone 12 Pro Max");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 17.02cm(6.7 inch)");
				System.out.println("Operating System: iOS 14");
				System.out.println("Processor Type: A14 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB & 512GB");
				System.out.println("Primary Camera: 12MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 12 Pro Max 128GB Variant");
						System.out.println("Rs. 95599");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Pro Max 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 95599);
								a.add("iPhone 12 Pro Max " +q );
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
						System.out.println("iPhone 12 Pro Max 256GB Variant");
						System.out.println("Rs. 129900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Pro Max 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 129900);
								a.add("iPhone 12 Pro Max " +q );
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
						System.out.println("iPhone 12 Pro Max 512GB Variant");
						System.out.println("Rs. 123299");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 12 Pro Max 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 123299);
								a.add("iPhone 12 Mini " +q );
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
				iPhone();
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
			iPh12();
		}
		else 
		{
			S1();
		}
	}
}

class iPhone13 extends Apple{

	public void iPh13() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Iphone 13 Mini");
		System.out.println("       2. Iphone 13 ");
		System.out.println("       3. Iphone 13 Pro");
		System.out.println("       4. Iphone 13 Pro Max");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: iPhone 13 Mini");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 13.72cm(5.4 inch)");
				System.out.println("Operating System: iOS 15");
				System.out.println("Processor Type: A15 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB & 512GB");
				System.out.println("Primary Camera: 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 13 Mini 128GB Variant");
						System.out.println("Rs. 61999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Mini 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 61999);
								a.add("iPhone 13 Mini " +q );
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
						System.out.println("iPhone 13 Mini 256GB Variant");
						System.out.println("Rs. 71999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Mini 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 71999);
								a.add("iPhone 13 Mini " +q );
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
						System.out.println("iPhone 13 Mini 512GB Variant");
						System.out.println("Rs. 91999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Mini 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 91999);
								a.add("iPhone 13 Mini " +q );
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
				System.out.println("Model Name: iPhone 13");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 15");
				System.out.println("Processor Type: A15 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB & 512GB");
				System.out.println("Primary Camera: 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 2815mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 13 128GB Variant");
						System.out.println("Rs. 51999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 51999);
								a.add("iPhone 13 " +q );
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
						System.out.println("iPhone 13 256GB Variant");
						System.out.println("Rs. 61499");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 61499);
								a.add("iPhone 13 " +q );
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
						System.out.println("iPhone 13 512GB Variant");
						System.out.println("Rs. 69499");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 69499);
								a.add("iPhone 13 " +q );
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
				System.out.println("Model Name: iPhone 13 Pro");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 15");
				System.out.println("Processor Type: A15 Bionic Chip");
				System.out.println("Internal Storage: 256GB, 512GB & 1TB");
				System.out.println("Primary Camera: 12MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("Select The Variant: 1. 256GB");
				System.out.println("                    2. 512GB");
				System.out.println("                    3. 1TB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 13 Pro 256GB Variant");
						System.out.println("Rs. 119999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Pro 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 119999);
								a.add("iPhone 13 Pro " +q );
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
						System.out.println("iPhone 13 Pro 512GB Variant");
						System.out.println("Rs. 129999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Pro 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 129999);
								a.add("iPhone 13 Pro " +q );
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
						System.out.println("iPhone 13 Pro 1TB Variant");
						System.out.println("Rs. 135999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Pro 1TB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 135999);
								a.add("iPhone 13 Pro " +q );
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
				System.out.println("Model Name: iPhone 13 Pro Max");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 17.02cm(6.7 inch)");
				System.out.println("Operating System: iOS 14");
				System.out.println("Processor Type: A14 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB, 512GB & 1TB");
				System.out.println("Primary Camera: 12MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				System.out.println("                    4. 1TB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 13 Pro Max 128GB Variant");
						System.out.println("Rs. 105999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Pro Max 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 105999);
								a.add("iPhone 13 Pro Max " +q );
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
						System.out.println("iPhone 13 Pro Max 256GB Variant");
						System.out.println("Rs. 115999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Pro Max 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 115999);
								a.add("iPhone 13 Pro Max " +q );
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
						System.out.println("iPhone 13 Pro Max 512GB Variant");
						System.out.println("Rs. 125999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Pro Max 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 125999);
								a.add("iPhone 13 Pro Max " +q );
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
						
					case 4: 
						System.out.println("iPhone 13 Pro Max 1TB Variant");
						System.out.println("Rs. 135999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 13 Pro Max 1TB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 135999);
								a.add("iPhone 13 Pro Max " +q );
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
				
			default:
				iPhone();
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
			iPh13();
		}
		else 
		{
			S1();
		}
	}
}

class iPhone14 extends Apple{

	public void iPh14() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Iphone 14");
		System.out.println("       2. Iphone 14 Plus ");
		System.out.println("       3. Iphone 14 Pro");
		System.out.println("       4. Iphone 14 Pro Max");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n) 
		{
			case 1:
				System.out.println("Model Name: iPhone 14");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 16");
				System.out.println("Processor Type: A15 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB & 512GB");
				System.out.println("Primary Camera: 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 14 128GB Variant");
						System.out.println("Rs. 56999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 56999);
								a.add("iPhone 14 " +q );
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
						System.out.println("iPhone 14 256GB Variant");
						System.out.println("Rs. 66999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 66999);
								a.add("iPhone 14 " +q );
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
						System.out.println("iPhone 14 512GB Variant");
						System.out.println("Rs. 86999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 86999);
								a.add("iPhone 14 " +q );
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
				System.out.println("Model Name: iPhone 14 Plus");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 16");
				System.out.println("Processor Type: A15 Bionic Chip");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 4323mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 14 Plus 128GB Variant");
						System.out.println("Rs. 64999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Plus 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 64999);
								a.add("iPhone 14 Plus " +q );
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
						System.out.println("iPhone 14 Plus 256GB Variant");
						System.out.println("Rs. 74999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Plus 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 74999);
								a.add("iPhone 14 Plus " +q );
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
				System.out.println("Model Name: iPhone 14 Pro");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 16");
				System.out.println("Processor Type: A15 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB, 512GB & 1TB");
				System.out.println("Primary Camera: 48MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 3200mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 14 Pro 128GB Variant");
						System.out.println("Rs. 108999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Pro 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 108999);
								a.add("iPhone 14 Pro " +q );
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
						System.out.println("iPhone 14 Pro 256GB Variant");
						System.out.println("Rs. 129999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Pro 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 129999);
								a.add("iPhone 14 Pro " +q );
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
						System.out.println("iPhone 14 Pro 512GB Variant");
						System.out.println("Rs. 149900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Pro 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 149900);
								a.add("iPhone 14 Pro " +q );
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
				System.out.println("Model Name: iPhone 14 Pro Max");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 17.02cm(6.7 inch)");
				System.out.println("Operating System: iOS 16");
				System.out.println("Processor Type: A15 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB & 512GB");
				System.out.println("Primary Camera: 48MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 4323mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 14 Pro Max 128GB Variant");
						System.out.println("Rs. 127999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Pro Max 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 127999);
								a.add("iPhone 14 Pro Max " +q );
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
						System.out.println("iPhone 14 Pro Max 256 Variant");
						System.out.println("Rs. 137999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Pro Max 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 137999);
								a.add("iPhone 14 Pro Max " +q );
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
						System.out.println("iPhone 14 Pro Max 512GB Variant");
						System.out.println("Rs. 157999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 14 Pro Max 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 157999);
								a.add("iPhone 14 Pro Max " +q );
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
				iPhone();
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
			iPh14();
		}
		else 
		{
			S1();
		}
	}
}

class iPhone15 extends Apple{

	public void iPh15() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. Iphone 15");
		System.out.println("       2. Iphone 15 Plus");
		System.out.println("       3. Iphone 15 Pro");
		System.out.println("       4. Iphone 15 Pro Max");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n) 
		{
			case 1:
				System.out.println("Model Name: iPhone 15");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 17");
				System.out.println("Processor Type: A16 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB & 512GB");
				System.out.println("Primary Camera: 48MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 3279mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 15 128GB Variant");
						System.out.println("Rs. 79900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 79900);
								a.add("iPhone 15 " +q );
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
						System.out.println("iPhone 15 256GB Variant");
						System.out.println("Rs. 89900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 89900);
								a.add("iPhone 15 " +q );
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
						System.out.println("iPhone 15 512GB Variant");
						System.out.println("Rs. 109900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 109900);
								a.add("iPhone 15 " +q );
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
				System.out.println("Model Name: iPhone 15 Plus");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 17.02cm(6.7 inch)");
				System.out.println("Operating System: iOS 17");
				System.out.println("Processor Type: A16 Bionic Chip");
				System.out.println("Internal Storage: 128GB, 256GB & 512GB");
				System.out.println("Primary Camera: 48MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 3279mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 15 Plus 128GB Variant");
						System.out.println("Rs. 89900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Plus 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 89900);
								a.add("iPhone 15 Plus " +q );
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
						System.out.println("iPhone 15 Plus 256GB Variant");
						System.out.println("Rs. 99900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Plus 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 99900);
								a.add("iPhone 15 Plus " +q );
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
						System.out.println("iPhone 15 Plus 512GB Variant");
						System.out.println("Rs. 119900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Plus 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 119900);
								a.add("iPhone 15 Plus " +q );
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
				System.out.println("Model Name: iPhone 15 Pro");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 15.49cm(6.1 inch)");
				System.out.println("Operating System: iOS 17");
				System.out.println("Processor Type: A17 Pro Chip");
				System.out.println("Internal Storage: 128GB, 256GB, 512GB & 1TB");
				System.out.println("Primary Camera: 48MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 3279mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 128GB");
				System.out.println("                    2. 256GB");
				System.out.println("                    3. 512GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 15 Pro 128GB Variant");
						System.out.println("Rs. 134900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Pro 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 134900);
								a.add("iPhone 15 Pro Max " +q );
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
						System.out.println("iPhone 15 Pro 256GB Variant");
						System.out.println("Rs. 144900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Pro 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 144900);
								a.add("iPhone 15 Pro " +q );
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
						System.out.println("iPhone 15 Pro 512GB Variant");
						System.out.println("Rs. 164900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Pro 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 164900);
								a.add("iPhone 15 Pro " +q );
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
				System.out.println("Model Name: iPhone 15 Pro Max");
				System.out.println("Company Name: Apple");
				System.out.println("SIM Type: Dual SIM");
				System.out.println("Display Size: 17.02cm(6.7 inch)");
				System.out.println("Operating System: iOS 17");
				System.out.println("Processor Type: A17 Pro Chip");
				System.out.println("Internal Storage: 256GB, 512GB & 1TB");
				System.out.println("Primary Camera: 48MP + 12MP + 12MP");
				System.out.println("Secondary Camera: 12MP Front Camera");
				System.out.println("Battery Capacity: 3279mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 256GB");
				System.out.println("                    2. 512GB");
				System.out.println("                    3. 1TB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("iPhone 15 Pro Max 256GB Variant");
						System.out.println("Rs. 159900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Pro Max 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 159900);
								a.add("iPhone 15 Pro Max " +q );
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
						System.out.println("iPhone 15 Pro Max 512GB Variant");
						System.out.println("Rs. 179900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Pro Max 512GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 179900);
								a.add("iPhone 15 Pro Max " +q );
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
						System.out.println("iPhone 15 Pro Max 1TB Variant");
						System.out.println("Rs. 199900");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected iPhone 15 Pro Max 1TB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 199900);
								a.add("iPhone 15 Pro Max " +q );
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
			iPh15();
		}
		else 
		{
			S1();
		}
	}
}

