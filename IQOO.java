package Marathon_Project;

public class IQOO extends shop{
	public void Q() {
		System.out.println("       =                                                      =");
		System.out.println("       =              Please Selected The Series              =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. IQOO 9 Series");
		System.out.println("       2. IQOO Z Series");
		System.out.println("       3. IQOO Neo Series");
		System.out.println("       4. Back");
		System.out.println();
		
		int n = sc.nextInt();
		switch(n) 
		{
			case 1:
				System.out.println("       ========================================================");
				System.out.println("       =                     IQOO 9 Series                    =");
				System.out.println("       =                                                      =");
				Serie9 S9 = new Serie9();
				S9.s9();
				break;
				
			case 2:
				System.out.println("       ========================================================");
				System.out.println("       =                     IQOO Z Series                    =");
				System.out.println("       =                                                      =");
				ZSeries zs = new ZSeries();
				zs.zs1();
				break;
			
			case 3:
				System.out.println("       ========================================================");
				System.out.println("       =                    IQOO Neo Series                   =");
				System.out.println("       =                                                      =");
				Neo N = new Neo();
				N.n1();
				break;
				
			default:
				S1();
				break;
		}
	}
}

class Serie9 extends IQOO
{
	public void s9() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. IQOO 9");
		System.out.println("       2. IQOO 9 SE");
		System.out.println("       3. IQOO 9 Pro");
		System.out.println("       4. IQOO 9T");
		System.out.println("       5. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: IQOO 9");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.66 cm (6.56 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 888+");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 48MP + 48MP + 13MP + 13MP");
				System.out.println("Secondary Camera: 16MP + 16MP");
				System.out.println("Battery Capacity: 4350mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO 9 8GB & 128GB Variant");
						System.out.println("Rs. 29990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 29990);
								a.add("IQOO 9 " +q );
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
						System.out.println("IQOO 9 12GB & 256GB Variant");
						System.out.println("Rs. 33990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 33990);
								a.add("IQOO 9 " +q );
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
				System.out.println("Model Name: IQOO 9 SE");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.81 cm (6.62 inch)");
				System.out.println("Operating System: Andriod 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 888");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256Gb");
				System.out.println("Primary Camera: 48MP + 48MP + 13MP + 2MP");
				System.out.println("Secondary Camera: 16MP + 16MP");
				System.out.println("Battery Capacity: 4500mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO 9 SE 8GB & 128GB Variant");
						System.out.println("Rs. 33990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9 SE 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 33990);
								a.add("IQOO 9 SE " +q );
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
						System.out.println("IQOO 9 SE 12GB & 256GB Variant");
						System.out.println("Rs. 37990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9 SE 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 37990);
								a.add("IQOO 9 SE " +q );
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
				System.out.println("Model Name: IQOO 9 Pro");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Qualcomm Snapdragon 8 Gen 1");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 256GB");
				System.out.println("Primary Camera: 50MP + 50MP + 16MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 4700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 256GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO 9 Pro 8GB & 256GB Variant");
						System.out.println("Rs. 39990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9 Pro 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 39990);
								a.add("IQOO 9 Pro " +q );
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
						System.out.println("IQOO 9 Pro 12GB & 256GB Variant");
						System.out.println("Rs. 44990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9 Pro 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 44990);
								a.add("IQOO 9 Pro " +q );
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
				System.out.println("Model Name: IQOO 9T");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 8+ Gen 1");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 13MP + 12MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 4700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO 9T 8GB & 128GB Variant");
						System.out.println("Rs. 49999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9T 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 49999);
								a.add("IQOO 9T " +q );
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
						System.out.println("IQOO 9T 12GB & 256GB Variant");
						System.out.println("Rs. 54999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO 9T 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 54999);
								a.add("IQOO 9T " +q );
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
			s9();
		}
		else 
		{
			S1();
		}
	}	
}

class ZSeries extends IQOO
{
	public void zs1() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. IQOO Z6 Lite");
		System.out.println("       2. IQOO Z6");
		System.out.println("       3. IQOO Z6 Pro");
		System.out.println("       4. IQOO Z7");
		System.out.println("       5. IQOO Z7s");
		System.out.println("       6. IQOO Z7 Pro");
		System.out.println("       7. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: IQOO Z6 Lite");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.97 cm (6.68 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 4 Gen 1");
				System.out.println("RAM: 6GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 2MP");
				System.out.println("Secondary Camera: 8MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Rs. 13999");
				System.out.println();
				System.out.println("Press 1 for Buy");
				System.out.println("Press 2 for back to shop");
				int q = sc.nextInt();
				switch(q)
				{
					case 1:
						System.out.println("You have Selected IQOO Z6 Lite 6GB & 128GB Variant");
						System.out.println();
						System.out.println("Enter the quantity");
						q = sc.nextInt();
						bill = bill + (q * 13999);
						a.add("IQOO Z6 Lite " +q );
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
				System.out.println("Model Name: IQOO Z6");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.71 cm (6.58 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 695");
				System.out.println("RAM: 4GB, 6GB & 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 50MP + 2MP + 2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 4GB & 128GB");
				System.out.println("                    2. 6GB & 128GB");
				System.out.println("                    3. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Z6 4GB & 128GB Variant");
						System.out.println("Rs. 19999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z6 4GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 19999);
								a.add("IQOO Z6 " +q );
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
						System.out.println("IQOO Z6 6GB & 128GB Variant");
						System.out.println("Rs. 20999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z6 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 20999);
								a.add("IQOO Z6 " +q );
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
						System.out.println("IQOO Z6 8GB & 128GB Variant");
						System.out.println("Rs. 21999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z6 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 21999);
								a.add("IQOO Z6 " +q );
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
				System.out.println("Model Name: IQOO Z6 Pro");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.36 cm (6.44 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 778G");
				System.out.println("RAM: 6GB, 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 64MP + 8MP + 2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 4700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 128GB");
				System.out.println("                    3. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Z6 Pro 6GB & 128GB Variant");
						System.out.println("Rs. 27990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z6 Pro 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 27990);
								a.add("IQOO Z6 Pro " +q );
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
						System.out.println("IQOO Z6 Pro 8GB & 128GB");
						System.out.println("Rs. 29990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z6 Pro 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 29990);
								a.add("IQOO Z6 Pro " +q );
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
					case 3:
						System.out.println("IQOO Z6 Pro 12GB & 256GB Variant");
						System.out.println("Rs. 33990");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z6 Pro 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 33990);
								a.add("IQOO Z6 Pro " +q );
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
				System.out.println("Model Name: IQOO Z7");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.21 cm (6.38 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: MediaTek Dimensity 920");
				System.out.println("RAM: 6GB & 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 64MP + 2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 4500mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Z7 6GB & 128GB Variant");
						System.out.println("Rs. 21999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z7 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 21999);
								a.add("IQOO Z7 " +q );
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
						System.out.println("IQOO Z7 8GB & 128GB Variant");
						System.out.println("Rs. 23999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z7 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 23999);
								a.add("IQOO Z7 " +q );
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
				System.out.println("Model Name: IQOO Z7s");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Sim Dual");
				System.out.println("Display Size: 16.21 cm (6.38 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Qualcomm Snapdragon 695");
				System.out.println("RAM: 6GB & 8GB");
				System.out.println("Internal Storage: 128GB");
				System.out.println("Primary Camera: 64MP + 2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 4500mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 6GB & 128GB");
				System.out.println("                    2. 8GB & 128GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Z7s 6GB & 128GB Variant");
						System.out.println("Rs. 15999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z7s 6GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 15999);
								a.add("IQOO Z7s " +q );
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
						System.out.println("IQOO Z7s 8GB & 128GB Variant");
						System.out.println("Rs. 16999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z7s 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 16999);
								a.add("IQOO Z7s " +q );
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
				
			case 6:
				System.out.println("Model Name: IQOO Z7 Pro");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: MediaTek Dimensity 7200");
				System.out.println("RAM: 8GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 64MP + 2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 4600mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 8GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Z7 Pro 8GB & 128GB Variant");
						System.out.println("Rs. 23999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z7 Pro 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 23999);
								a.add("IQOO Neo 7 Pro " +q );
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
						System.out.println("IQOO Z7 Pro 8GB & 256GB Variant");
						System.out.println("Rs. 24999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Z7 Pro 8GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 24999);
								a.add("IQOO Neo Z7 Pro " +q );
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
				Q();
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
			zs1();
		}
		else 
		{
			S1();
		}
	}
}

class Neo extends IQOO
{
	public void n1() {
		System.out.println("       =                                                      =");
		System.out.println("       =                   Select The Model                   =");
		System.out.println("       ========================================================");
		System.out.println();
		System.out.println("       1. IQOO Neo 6");
		System.out.println("       2. IQOO Neo 7");
		System.out.println("       3. IQOO Neo 7 Pro");
		System.out.println("       4. Back");
		
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Model Name: IQOO Neo 6");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 16.81 cm (6.62 inch)");
				System.out.println("Operating System: Android 12");
				System.out.println("Processor Type: Qualcomm Snapdragon 870");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 64MP+8MP+2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 4700mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Neo 6 8GB & 128GB Variant");
						System.out.println("Rs. 34999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int j = sc.nextInt();
						switch(j)
						{
							case 1:
								System.out.println("You have Selected IQOO Neo 6 8GB & 128GB Variant ");
								System.out.println();
								System.out.println("Enter the quantity");
								int q = sc.nextInt();
								bill = bill + (q * 34999);
								a.add("IQOO Neo 6 " +q );
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
						System.out.println("IQOO Neo 6 12GB & 256GB Variant");
						System.out.println("Rs. 39999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Neo 6 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 39999);
								a.add("IQOO Neo 6 " +q );
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
				System.out.println("Model Name: IQOO Neo 7");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Mediatek Dimensity 8200");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 64MP + 2MP + 2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Neo 7 8GB & 128GB Variant");
						System.out.println("Rs. 26999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Neo 7 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 26999);
								a.add("IQOO Neo 7 " +q );
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
						System.out.println("IQOO Neo 7 12GB & 256GB Variant");
						System.out.println("Rs. 30999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Neo 7 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 30999);
								a.add("IQOO Neo 7 " +q );
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
				System.out.println("Model Name: IQOO Neo 7 Pro");
				System.out.println("Company Name: Vivo");
				System.out.println("SIM Type: Dual Sim");
				System.out.println("Display Size: 17.22 cm (6.78 inch)");
				System.out.println("Operating System: Android 13");
				System.out.println("Processor Type: Qualcomm Snapdragon 8+ Gen 1");
				System.out.println("RAM: 8GB & 12GB");
				System.out.println("Internal Storage: 128GB & 256GB");
				System.out.println("Primary Camera: 50MP + 8MP + 2MP");
				System.out.println("Secondary Camera: 16MP");
				System.out.println("Battery Capacity: 5000mAh");
				System.out.println();
				System.out.println("Select The Variant: 1. 8GB & 128GB");
				System.out.println("                    2. 12GB & 256GB");
				
				n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("IQOO Neo 7 Pro 8GB & 128GB Variant");
						System.out.println("Rs. 33999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						int q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Neo 7 Pro 8GB & 128GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 33999);
								a.add("IQOO Neo 7 Pro " +q );
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
						System.out.println("IQOO Neo 7 Pro 12GB & 256GB Variant");
						System.out.println("Rs. 36999");
						System.out.println();
						System.out.println("Press 1 for Buy");
						System.out.println("Press 2 for back to shop");
						q = sc.nextInt();
						switch(q)
						{
							case 1:
								System.out.println("You have Selected IQOO Neo 7 Pro 12GB & 256GB Variant");
								System.out.println();
								System.out.println("Enter the quantity");
								q = sc.nextInt();
								bill = bill + (q * 36999);
								a.add("IQOO Neo 7 Pro " +q );
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
			n1();
		}
		else 
		{
			S1();
		}
	}

}
