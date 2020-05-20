import java.util.*;

import java.text.DecimalFormat;

public class ShoppingCart extends Concord_NC_Frugal_Store {
	Scanner kb = new Scanner(System.in);
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static DecimalFormat df4 = new DecimalFormat("#.####");
	
	Concord_NC_Frugal_Store shopping_Cart = new Concord_NC_Frugal_Store();
	
	
	String[][] cart = new String[10][2];
	int user_Cart = 1;
	double total_Price = 0;
	double TAX = 0.0675;
	
	

	public String[][] addCart() {
		System.out.println("Enter the grocery item to add to cart");
		do {
			System.out.println("Please enter your item\n");
			int user_Choice = kb.nextInt();
			
			if((user_Choice >=1)&&(user_Choice <=8) == true) {
			cart[user_Choice-1][0]= shopping_Cart.inventory[user_Choice-1][0];
			cart[user_Choice-1][1]= shopping_Cart.inventory[user_Choice-1][1];
			System.out.println(cart[user_Choice-1][0] + " added to Cart!");
			}
			else {
				System.out.println("Item Not Aviable!");
			}
			System.out.println("Do you want more items? Enter 1 to ADD or Enter 0 to Checkout");
			user_Cart = kb.nextInt();
			
			}while(user_Cart == 1);
		
		return cart;
		
	}
	
	public void  printCart() {
		 System.out.println("    *** Frugal Customer Shopping cart ***\n");
		 for (int row = 0; row < cart.length; row++) {
				for (int col = 0; col < cart[row].length; col++) { 	
					
					if(cart[row][0] == null) {
						break;
					}
					if(col == 0) {
						System.out.println("\tItem Code: " + (row + 1));
						System.out.println("\tItem Name: " + cart[row][col]);
						
						counter++;
					}
					else{
					System.out.println("\tItem Price: $" + cart[row][col] + "\n");
					} 
					
				}
			}
	}
	public String[][] doCheckout() {
		
		 System.out.println("    *** Frugal Customer Reciept ***\n");
		 for (int row = 0; row < cart.length; row++) {
				for (int col = 0; col < cart[row].length; col++) { 	
					
					if(cart[row][0] == null) {
						break;
					}
					if(col == 0) {
						System.out.println("\tItem Code: " + (row + 1));
						System.out.println("\tItem Name: " + cart[row][col]);
						
						counter++;
					}
					else{
					System.out.println("\tItem Price: $" + cart[row][col] + "\n");
					total_Price = total_Price + Double.parseDouble(cart[row][col]);
					} 
					
				}
			}
		 if(total_Price != 0) {
			 System.out.println("\tYour total before taxes is $" + df2.format(total_Price));
			 System.out.println("\tSales taxe applied " + df4.format(TAX));
			 System.out.println("\tYour total after taxes is $" + df2.format((total_Price + (total_Price* TAX))));
		 	}
		 	else {
		 		System.out.println();
		 	}
		
		
		return cart;
		
	}
	 public void createConcord_NC_Frugal_Store_Cart(ShoppingCart shopping_Cart) {
		 shopping_Cart.setCart(cart);
		 
	 }
	
	public String[][] getCart() {
		return cart;
	}
	public void setCart(String[][] cart) {
		this.cart = cart;
	}
	public int getUser_Cart() {
		return user_Cart;
	}

	public void setUser_Cart(int user_Cart) {
		this.user_Cart = user_Cart;
	}
	
	

}
