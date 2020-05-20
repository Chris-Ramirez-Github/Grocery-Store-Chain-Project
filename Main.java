import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int ui; 
		
		System.out.println("Frugal Grocery Locations");
		
		
		
		
		Concord_NC_Frugal_Store concord_NC_Frugal_Store = new Concord_NC_Frugal_Store();
		concord_NC_Frugal_Store.createConcord_NC_Frugal_Store(concord_NC_Frugal_Store);
		
		concord_NC_Frugal_Store.printLocationDetail();
		
		LosAngeles_CA_Frugal_Store losAngeles_CA_Frugal_Store = new LosAngeles_CA_Frugal_Store();
		losAngeles_CA_Frugal_Store.createLosAngeles_CA_Frugal_Store(losAngeles_CA_Frugal_Store);
		
		losAngeles_CA_Frugal_Store.printLocationDetail();
		
		System.out.println();
		System.out.println();

		System.out.println("Locate nearest Store");
		System.out.println("Enter a Zip Code: ");
		ui = Integer.parseInt(kb.nextLine());
		
		if(ui == losAngeles_CA_Frugal_Store.location_Zip) {
			LosAngeles_CA_Frugal_Store inventory = new LosAngeles_CA_Frugal_Store();
			inventory.createLosAngeles_CA_Frugal_Store(inventory);
			
			ShoppingCart2 shopping_Checkout = new ShoppingCart2();
			shopping_Checkout.createLosAngeles_CA_Frugal_Store_Cart(shopping_Checkout);
			
			inventory.printInventory();
			shopping_Checkout.addCart();
			shopping_Checkout.printCart();
			shopping_Checkout.doCheckout();
			System.out.println("\nThank you for Frugaling at " + losAngeles_CA_Frugal_Store.location_Name);

		}
		else if(ui == concord_NC_Frugal_Store.location_Zip) {
			Concord_NC_Frugal_Store inventory = new Concord_NC_Frugal_Store();
			inventory.createConcord_NC_Frugal_Store(inventory);
			
			ShoppingCart shopping_Checkout = new ShoppingCart();
			shopping_Checkout.createConcord_NC_Frugal_Store_Cart(shopping_Checkout);
			
			inventory.printInventory();
			shopping_Checkout.addCart();
			shopping_Checkout.printCart();
			shopping_Checkout.doCheckout();
			System.out.println("\nThank you for Frugaling at " + concord_NC_Frugal_Store.location_Name);
			
		}
		else {
			System.out.println("Location under Construction");
		}
			
		kb.close();
	}

}
