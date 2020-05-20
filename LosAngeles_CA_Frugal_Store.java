
public class LosAngeles_CA_Frugal_Store {
	//Store Location Information
		 String location_Name = "Los Angeles Frugal Store";
		 int location_Zip = 90001;
		 String City = "Los Angeles";
		 
		 
		 
		 String[][] inventory = {{"Organic Milk","1.75"},
		 {"Organic Eggs","2.75"},
		 {"Vegan Hotdog","5.75"},
		 {"Gluten-free Bread","6.75"},
		 {"Vegan Steak","7.75"},
		 {"Vegan Cheese","1.75"},
		 {"Vegan Han","1.75"},
		 {"Vegan Pizza","1.75"}};
		 
		int counter = 1;
		
		
		//Store Gross Income
		 double income = 500000;
		 double cost = 200000;
		 
		 
		 public void printLocationDetail() {
			 System.out.println("Location Name: " + location_Name);
			 System.out.println(" Zip Code: " + location_Zip);
			 System.out.println(" City: " + City);


		 }
		 public void  printInventory() {
			 System.out.println("    ***  Frugal Grocery Store at " + location_Name + "***\n");
			 System.out.println("    *** Inventory List ***\n");
			 for (int row = 0; row < inventory.length; row++) {
					for (int col = 0; col < inventory[row].length; col++) 
					{ 	
						if(col == 0) {
							System.out.println("\tItem Code: " + counter);
							System.out.println("\tItem Name: " + inventory[row][col]);
							counter++;
						
						}else
						System.out.println("\tItem Price: $" + inventory[row][col] + "\n");
						} 
					}
		

			 
		 }
		 public void createLosAngeles_CA_Frugal_Store(LosAngeles_CA_Frugal_Store losAngeles_CA_Frugal_Store) {
			 losAngeles_CA_Frugal_Store.setLocation_Name(location_Name);
			 losAngeles_CA_Frugal_Store.setCost(cost);
			 losAngeles_CA_Frugal_Store.setCity(City);
			 losAngeles_CA_Frugal_Store.setIncome(income);
			 losAngeles_CA_Frugal_Store.setCost(cost);
			 losAngeles_CA_Frugal_Store.setInventory(inventory);
			 
		 }
		 public int getCounter() {
				return counter;
			}
		public void setCounter(int counter) {
				this.counter = counter;
			}
		public String getLocation_Name() {
			return location_Name;
		}
		public void setLocation_Name(String location_Name) {
			this.location_Name = location_Name;
		}
		public int getLocation_Zip() {
			return location_Zip;
		}
		public void setLocation_Zip(int location_Zip) {
			this.location_Zip = location_Zip;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String[][] getInventory() {
			return inventory;
		}
		public void setInventory(String[][] inventory) {
			this.inventory = inventory;
		}
		public double getIncome() {
			return income;
		}
		public void setIncome(double income) {
			this.income = income;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}

		
}
