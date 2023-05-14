import java.util.*;



public class productMenu {

		public static void main (String [] args ) {
			
			Scanner input = new Scanner(System.in);
			
			int choice = 0;
			while (choice != 8) {
				System.out.println("Welcome! Please select a category: ");
				System.out.println("1. Men's Clothing ");
				System.out.println("2. Women's Clothing ");
				System.out.println("3. Infant Clothing ");
				System.out.println("4. Kids Wear for Girls");
				System.out.println("5. Kids Wear for Boys");
				System.out.println("6. Home Merchandise ");
				System.out.println("7. Gadget ");
				System.out.println("8. Exit ");
				choice = input.nextInt();
				
				switch (choice) {
				case 1:
					showMensClothing();
					break;
				case 2:
					showWomensClothing();
					break;
				case 3:
					showInfantClothing();
					break;
				case 4:
					showKidsWearGirls();
					break;
				case 5:
					showKidsWearBoys();
					break;
				case 6:
					showHomeMerchandise();
					break;
				case 7:
					showGadgets();
					break;
				case 8:
					System.out.println("Thank you for shopping with us!");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			}
		}
		
		public static void showMensClothing() {
			System.out.println("MEN'S CLOTHING");
			System.out.println("1. T-shirt");
			String mensproduct1 = "T-shirt"; int mensprice1 = 390;
			System.out.println("2. Polo shirt");
			String mensproduct2 = "Polo shirt"; int mensprice2 = 590;
			System.out.println("3. Dress shirt");
			String mensproduct3 = "Dress shirt"; int mensprice3 = 800;
			System.out.println("4. Jeans");
			String mensproduct4 = "Jeans"; int mensprice4 = 420;
			System.out.println("5. Shorts");
			String mensproduct5 = "Shorts"; int mensprice5 = 125;
			System.out.println("6. Underwear");
			String mensproduct6 = "Underwear"; int mensprice6 = 100;
			System.out.println("7. Back to Menu");
			int choice = 0;
			Scanner input = new Scanner(System.in);
			while (choice != 7) {
				System.out.println("Please select an item: ");
				choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println(mensproduct1 + " - ₱" + mensprice1);
			break;
			case 2:
				System.out.println(mensproduct2 + " - ₱" + mensprice2);
			break;
			case 3:
				System.out.println(mensproduct3 + " - ₱" + mensprice3);
			break;
			case 4:
				System.out.println(mensproduct4 + " - ₱" + mensprice4);
			break;
			case 5:
				System.out.println(mensproduct5 + " - ₱" + mensprice5);
			break;
			case 6:
				System.out.println(mensproduct6 + " - ₱" + mensprice6);
			break;
			case 7:
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			break;
			
			}
			}
		}
			public static void showWomensClothing() {
				System.out.println("WOMEN'S CLOTHING");
				System.out.println("1. T-shirt");
				String womenproduct1 = "T-shirt"; int womenprice1 = 290;
				System.out.println("2. Blouse");
				String womenproduct2 = "Blouse"; int womenprice2 = 250;
				System.out.println("3. Dress");
				String womenproduct3 = "Dress"; int womenprice3 = 700;
				System.out.println("4. Jeans");
				String womenproduct4 = "Jeans"; int womenprice4 = 500;
				System.out.println("5. Skirt");
				String womenproduct5 = "Skirt"; int womenprice5 = 400;
				System.out.println("6. Underwear");
				String womenproduct6 = "Underwear"; int womenprice6 = 100;
				System.out.println("7. Back to Menu");
				int choice = 0;
				Scanner input = new Scanner(System.in);
				while (choice != 7) {
					System.out.println("Please select an item: ");
					choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println(womenproduct1 + " - ₱" + womenprice1);
				break;
				case 2:
					System.out.println(womenproduct2 + " - ₱" + womenprice2);
				break;
				case 3:
					System.out.println(womenproduct3 + " - ₱" + womenprice3);
				break;
				case 4:
					System.out.println(womenproduct4 + " - ₱" + womenprice4);
				break;
				case 5:
					System.out.println(womenproduct5 + " - ₱" + womenprice5);
				break;
				case 6:
					System.out.println(womenproduct6 + " - ₱" + womenprice6);
				break;
				case 7:
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				break;
			}
				}
			}
			public static void showInfantClothing() {
				System.out.println("INFANT CLOTHING");
				System.out.println("1. Leggings");
				String infantproduct1 = "Leggings"; int infantprice1 = 180;
				System.out.println("2. Tops");
				String infantproduct2 = "Tops"; int infantprice2 = 200;
				System.out.println("3. Bodysuits");
				String infantproduct3 = "Bodysuits"; int infantprice3 = 290;
				System.out.println("4. One-Pieces");
				String infantproduct4 = "One-Pieces"; int infantprice4 = 400;
				System.out.println("5. Pajamas");
				String infantproduct5 = "Pajamas"; int infantprice5 = 350;
				System.out.println("6. Innerwear");
				String infantproduct6 = "Innerwear"; int infantprice6 = 260;
				System.out.println("7. Socks");
				String infantproduct7 = "Socks"; int infantprice7 = 100;
				System.out.println("8. Back to Menu");
				int choice = 0;
				Scanner input = new Scanner(System.in);
				while (choice != 8) {
					System.out.println("Please select an item: ");
					choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println(infantproduct1 + " - ₱" + infantprice1);
				break;
				case 2:
					System.out.println(infantproduct2 + " - ₱" + infantprice2);
				break;
				case 3:
					System.out.println(infantproduct3 + " - ₱" + infantprice3);
				break;
				case 4:
					System.out.println(infantproduct4 + " - ₱" + infantprice4);
				break;
				case 5:
					System.out.println(infantproduct5 + " - ₱" + infantprice5);
				break;
				case 6:
					System.out.println(infantproduct6 + " - ₱" + infantprice6);
				break;
				case 7:
					System.out.println(infantproduct7 + " - ₱" + infantprice7);
					break;
				case 8:
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				break;
			}
	}
			}
			
			public static void showKidsWearGirls() {
				System.out.println("KIDS WEAR FOR GIRLS");
				System.out.println("1. Skirts");
				String girlproduct1 = "Skirts"; int girlprice1 = 200;
				System.out.println("2. Dresses");
				String girlproduct2 = "Dresses"; int girlprice2 = 250;
				System.out.println("3. Jumpsuits");
				String girlproduct3 = "Jumpsuitss"; int girlprice3 = 200;
				System.out.println("4. Tops");
				String girlproduct4 = "Tops"; int girlprice4 = 180;
				System.out.println("5. Bodysuits");
				String girlproduct5 = "Bodysuits"; int girlprice5 = 250;
				System.out.println("6. Underwear");
				String girlproduct6 = "Underwear"; int girlprice6 = 100;
				System.out.println("7. Back to Menu");
				int choice = 0;
				Scanner input = new Scanner(System.in);
				while (choice != 7) {
					System.out.println("Please select an item: ");
					choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println(girlproduct1 + " - ₱" + girlprice1);
				break;
				case 2:
					System.out.println(girlproduct2 + " - ₱" + girlprice2);
				break;
				case 3:
					System.out.println(girlproduct3 + " - ₱" + girlprice3);
				break;
				case 4:
					System.out.println(girlproduct4 + " - ₱" + girlprice4);
				break;
				case 5:
					System.out.println(girlproduct5 + " - ₱" + girlprice5);
				break;
				case 6:
					System.out.println(girlproduct6 + " - ₱" + girlprice6);
				break;
				case 7:
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				break;
			}
	}
			}
			public static void showKidsWearBoys() {
				System.out.println("KIDS WEAR FOR BOYS");
				System.out.println("1. T-shirt");
				String boyproduct1 = "T-shirt"; int boyprice1 = 150;
				System.out.println("2. Polo");
				String boyproduct2 = "Polo"; int boyprice2 = 280;
				System.out.println("3. Jogger");
				String boyproduct3 = "Jogger"; int boyprice3 = 250;
				System.out.println("4. Shorts");
				String boyproduct4 = "Shorts"; int boyprice4 = 120;
				System.out.println("5. Formal Suits");
				String boyproduct5 = "Formal Suits"; int boyprice5 = 800;
				System.out.println("6. Underwear");
				String boyproduct6 = "Underwear"; int boyprice6 = 100;
				System.out.println("7. Back to Menu");
				int choice = 0;
				Scanner input = new Scanner(System.in);
				while (choice != 7) {
					System.out.println("Please select an item: ");
					choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println(boyproduct1 + " - ₱" + boyprice1);
				break;
				case 2:
					System.out.println(boyproduct2 + " - ₱" + boyprice2);
				break;
				case 3:
					System.out.println(boyproduct3 + " - ₱" + boyprice3);
				break;
				case 4:
					System.out.println(boyproduct4 + " - ₱" + boyprice4);
				break;
				case 5:
					System.out.println(boyproduct5 + " - ₱" + boyprice5);
				break;
				case 6:
					System.out.println(boyproduct6 + " - ₱" + boyprice6);
				break;
				case 7:
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				break;
				}
				}
			}
			
			public static void showHomeMerchandise() {
				System.out.println("HOME MERCHANDISE");
				System.out.println("1. Vacuum Cleaner");
				String HMproduct1 = "Vacuum Cleaner"; int HMprice1 = 6000;
				System.out.println("2. Mattress");
				String HMproduct2 = "Mattress" ;int HMprice2 = 2500;
				System.out.println("3. Paper Towel");
				String HMproduct3 = "Paper Towel"; int HMprice3 = 100;
				System.out.println("4. Baking Sheet Pan");
				String HMproduct4 = "Baking Sheet"; int HMprice4 = 260;
				System.out.println("5. Plunger");
				String HMproduct5 = "Plunger"; int HMprice5 = 75;
				System.out.println("6. Broom");
				String HMproduct6 = "Broom"; int HMprice6 = 45;
				System.out.println("7. Food Storage Container");
				String HMproduct7 = "Food Storage Container"; int HMprice7 = 190;
				System.out.println("8. Sponge");
				String HMproduct8 = "Sponge"; int HMprice8 = 25;
				System.out.println("9. Oven Glove");
				String HMproduct9 = "Oven Glove"; int HMprice9 = 193;
				System.out.println("10. First Aid Kit");
				String HMproduct10 = "First Aid Kit"; int HMprice10 = 194;
				System.out.println("11. Dish Soap");
				String HMproduct11 = "Dish Soap"; int HMprice11 = 50;
				System.out.println("12. Mop");
				String HMproduct12 = "Mop"; int HMprice12 = 207;
				System.out.println("13. Cutting Board");
				String HMproduct13 = "Cutting Board"; int HMprice13 = 89;
				System.out.println("14. Coffee Maker");
				String HMproduct14 = "Coffee Maker"; int HMprice14 = 1850;
				System.out.println("15. Measuring Cup");
				String HMproduct15 = "Measuring Cup"; int HMprice15 = 299;
				System.out.println("16. Refrigerator");
				String HMproduct16 = "Refrigerator"; int HMprice16 = 5500;
				System.out.println("17. Electric Battery");
				String HMproduct17 = "Electric Battery"; int HMprice17 = 99;
				System.out.println("18. Lamps");
				String HMproduct18 = "Lamps"; int HMprice18 = 4000;
				System.out.println("19. Bed");
				String HMproduct19 = "Bed"; int HMprice19 = 4800;
				System.out.println("20. Kitchen Stove");
				String HMproduct20 = "Kitchen Stove"; int HMprice20 = 3300;
				System.out.println("21. Measuring Spoon");
				String HMproduct21 = "Measuring Spoon"; int HMprice21 = 79;
				System.out.println("22. Curtain");
				String HMproduct22 = "Curtain"; int HMprice22 = 199;
				System.out.println("23. Soap");
				String HMproduct23 = "Soap"; int HMprice23 = 63;
				System.out.println("24. Back to Menu");
				int choice = 0;
				Scanner input = new Scanner(System.in);
				while (choice != 24) {
					System.out.println("Please select an item: ");
					choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println(HMproduct1 + " - ₱" + HMprice1);
				break;
				case 2:
					System.out.println(HMproduct2 + " - ₱" + HMprice2);
					break;
				case 3:
					System.out.println(HMproduct3 + " - ₱" + HMprice3);
				break;
				case 4:
					System.out.println(HMproduct4+ " - ₱" + HMprice4);
				break;
				case 5:
					System.out.println(HMproduct5 + " - ₱" + HMprice5);
				break;
				case 6:
					System.out.println(HMproduct6 + " - ₱" + HMprice6);
				break;
				case 7:
					System.out.println(HMproduct7 + " - ₱" + HMprice7);
				break;
				case 8:
					System.out.println(HMproduct8 + " - ₱" + HMprice8);
				break;
				case 9:
					System.out.println(HMproduct9 + " - ₱" + HMprice9);
				break;
				case 10:
					System.out.println(HMproduct10 + " - ₱" + HMprice10);
				break;
				case 11:
					System.out.println(HMproduct11 + " - ₱" + HMprice11);
				break;
				case 12:
					System.out.println(HMproduct12 + " - ₱" + HMprice12);
				break;
				
				case 13:
					System.out.println(HMproduct13 + " - ₱" + HMprice13);
				break;
				case 14:
					System.out.println(HMproduct14 + " - ₱" + HMprice14);
				break;
				case 15:
					System.out.println(HMproduct15 + " - ₱" + HMprice15);
				break;
				case 16:
					System.out.println(HMproduct16 + " - ₱" + HMprice16);
				break;
				case 17:
					System.out.println(HMproduct17 + " - ₱" + HMprice17);
				break;
				case 18:
					System.out.println(HMproduct18 + " - ₱" + HMprice18);
				break;
				case 19:
					System.out.println(HMproduct19 + " - ₱" + HMprice19);
				break;
				case 20:
					System.out.println(HMproduct20 + " - ₱" + HMprice20);
				break;
				case 21:
					System.out.println(HMproduct21 + " - ₱" + HMprice21);
				break;
				case 22:
					System.out.println(HMproduct22 + " - ₱" + HMprice22);
				break;
				case 23:
					System.out.println(HMproduct23 + " - ₱" + HMprice23);
				break;
				case 24:
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				break;
			}
	}
			}
			
			public static void showGadgets() {
				System.out.println("GADGETS");
				System.out.println("1. Smart Phone");
				System.out.println("2. Camera");
				System.out.println("3. HeadPhone");
				System.out.println("4. Laptop");
				System.out.println("5. Back to Menu");
		        int choice = 0;
				Scanner input = new Scanner(System.in);
				while (choice != 5) {
					System.out.println("Please select an item: ");
					choice = input.nextInt();
				switch (choice) {
				case 1:
					showSmartphone();
					
				break;
				case 2:
					showCamera();
					break;
				case 3:
					showHeadphones();
					break;
				case 4:
				    showLaptop();
					break;
				case 5:
				    break;
				default:
					System.out.println("Invalid choice. Please try again.");
				break;
			}
	}
			}
			public static void showSmartphone()
			{
			    System.out.println("1. Redmi Note 12 Pro");
			    String cpproduct1 = "Redmi Note 12 Pro"; int cpprice1 = 18203;
				System.out.println("2. Samsung Galaxy S23 Ultra");
				String cpproduct2 = "Samsung Galaxy S23 Ultra"; int cpprice2 = 89990;
				System.out.println("3. Huawei P60 Pro");
				String cpproduct3 = "Huawei P60 Pro"; int cpprice3 = 69999;
				System.out.println("4. Realme C55");
				String cpproduct4 = "Realme C55"; int cpprice4 = 10999;
				System.out.println("5. iPhone 14 Pro Max");
				String cpproduct5 = "iPhone 14 Pro Max"; int cpprice5 = 77990;
				System.out.println("6. Vivo V27 Series 5G");
				String cpproduct6 = "Vivo V27 Series 5G"; int cpprice6 = 24999;
				System.out.println("7. Back");
                
                int cpchoice = 0;
				Scanner input = new Scanner(System.in);
				while (cpchoice != 7) {
					System.out.println("Please select an item: ");
					cpchoice = input.nextInt();
				switch (cpchoice) {
				case 1:
					System.out.println(cpproduct1 + " - ₱" + cpprice1);
					
				    break;
				case 2:
					System.out.println(cpproduct2 + " - ₱" + cpprice2);
					break;
				case 3:
					System.out.println(cpproduct3 + " - ₱" + cpprice3);
				    break;
				case 4:
				    System.out.println(cpproduct4 + " - ₱" + cpprice4);
					break;
				case 5:
				    System.out.println(cpproduct5 + " - ₱" + cpprice5);
				    break;
				case 6:
				    System.out.println(cpproduct6 + " - ₱" + cpprice6);
				    break;
				case 7:
				    showGadgets();
				    break;
				default:
					System.out.println("Invalid choice. Please try again.");
				    break;
			}
	}
			}
        	public static void showCamera()
			{
			    System.out.println("1. Sony RX100 VII Compact Camera, Unrivaled AF");
			    String cmproduct1 = "Sony RX100 VII Compact Camera, Unrivaled AF"; int cmprice1 = 74999;
				System.out.println("2. Canon EOS 4000D");
				String cmproduct2 = "Canon EOS 4000D"; int cmprice2 = 61808;
				System.out.println("3. Nikon D7500");
				String cmproduct3 = "Nikon D7500"; int cmprice3 = 123896;
				System.out.println("4. Sony Alpha A7");
				String cmproduct4 = "Sony Alpha A7"; int cmprice4 = 95217;
				System.out.println("5. Canon EOS 1300D");
				String cmproduct5 = "Canon EOS 1300D"; int cmprice5 = 28500;
				System.out.println("6. Nikon D5600");
				String cmproduct6 = "Nikon D5600"; int cmprice6 = 150717;
				System.out.println("7. Back");
                
                int cmchoice = 0;
				Scanner input = new Scanner(System.in);
				while (cmchoice != 7) {
					System.out.println("Please select an item: ");
					cmchoice = input.nextInt();
				switch (cmchoice) {
				case 1:
					System.out.println(cmproduct1 + " - ₱" + cmprice1);
					
				    break;
				case 2:
					System.out.println(cmproduct2 + " - ₱" + cmprice2);
					break;
				case 3:
					System.out.println(cmproduct3 + " - ₱" + cmprice3);
				    break;
				case 4:
				    System.out.println(cmproduct4 + " - ₱" + cmprice4);
					break;
				case 5:
				    System.out.println(cmproduct5 + " - ₱" + cmprice5);
				    break;
				case 6:
				    System.out.println(cmproduct6 + " - ₱" + cmprice6);
				    break;
				case 7:
				    showGadgets();
				    break;
				default:
					System.out.println("Invalid choice. Please try again.");
				    break;
			}
	}
			}	
		public static void showHeadphones()
			{
			    System.out.println("1. Marshall Major IV");
			    String hpproduct1 = "Marshall Major IV"; int hpprice1 = 13038;
				System.out.println("2. Apple Airpods Pro 2nd Generation");
				String hpproduct2 = "Apple Airpods Pro 2nd Generation"; int hpprice2 = 17278;
				System.out.println("3. Samsung Galaxy Buds Live");
				String hpproduct3 = "Samsung Galaxy Buds Live"; int hpprice3 = 75901;
				System.out.println("4. Sony WH-1000XM5");
				String hpproduct4 = "Sony WH-1000XM5"; int hpprice4 = 34949;
				System.out.println("5. Lenovo LP40 Wireless Headphones");
				String hpproduct5 = "Lenovo LP40 Wireless Headphones"; int hpprice5 = 4390;
				System.out.println("6. JBL TUNE 220TWS True Wireless Earbuds");
				String hpproduct6 = "JBL TUNE 220TWS True Wireless Earbuds"; int hpprice6 = 8884;
				System.out.println("7. Back");
                
                int hpchoice = 0;
				Scanner input = new Scanner(System.in);
				while (hpchoice != 7) {
					System.out.println("Please select an item: ");
					hpchoice = input.nextInt();
				switch (hpchoice) {
				case 1:
					System.out.println(hpproduct1 + " - ₱" + hpprice1);
					
				    break;
				case 2:
					System.out.println(hpproduct2 + " - ₱" + hpprice2);
					break;
				case 3:
					System.out.println(hpproduct3 + " - ₱" + hpprice3);
				    break;
				case 4:
				    System.out.println(hpproduct4 + " - ₱" + hpprice4);
					break;
				case 5:
				    System.out.println(hpproduct5 + " - ₱" + hpprice5);
				    break;
				case 6:
				    System.out.println(hpproduct6 + " - ₱" + hpprice6);
				    break;
				case 7:
				    showGadgets();
				    break;
				default:
					System.out.println("Invalid choice. Please try again.");
				    break;
			}
	}
			}
		public static void showLaptop()
			{
			    System.out.println("1. Apple Macbook Air M1 2020");
			    String lpproduct1 = "Apple Macbook Air M1 2020"; int lpprice1 = 119268;
				System.out.println("2. Huawei Matebook D 15");
				String lpproduct2 = "Huawei Matebook D 15"; int lpprice2 = 61176;
				System.out.println("3. ASUS Vivobook 16X M1603a");
				String lpproduct3 = "ASUS Vivobook 16X M1603a"; int lpprice3 = 64155;
				System.out.println("4. Acer Nitro 5 15-inch AN515-58-50YE");
				String lpproduct4 = "Acer Nitro 5 15-inch AN515-58-50YE"; int lpprice4 = 66999;
				System.out.println("5. DELL Latitude 7000 E7470");
				String lpproduct5 = "DELL Latitude 7000 E7470"; int lpprice5 = 105582;
				System.out.println("6. Lenovo Legion 5i Pro");
				String lpproduct6 = "Lenovo Legion 5i Pro"; int lpprice6 = 91875;
				System.out.println("7. Back");
                
                int lpchoice = 0;
				Scanner input = new Scanner(System.in);
				while (lpchoice != 7) {
					System.out.println("Please select an item: ");
					lpchoice = input.nextInt();
				switch (lpchoice) {
				case 1:
					System.out.println(lpproduct1 + " - ₱" + lpprice1);
					
				    break;
				case 2:
					System.out.println(lpproduct2 + " - ₱" + lpprice2);
					break;
				case 3:
					System.out.println(lpproduct3 + " - ₱" + lpprice3);
				    break;
				case 4:
				    System.out.println(lpproduct4 + " - ₱" + lpprice4);
					break;
				case 5:
				    System.out.println(lpproduct5 + " - ₱" + lpprice5);
				    break;
				case 6:
				    System.out.println(lpproduct6 + " - ₱" + lpprice6);
				    break;
				case 7:
				    showGadgets();
				default:
					System.out.println("Invalid choice. Please try again.");
				    break;
			}
	}
			}
	}

