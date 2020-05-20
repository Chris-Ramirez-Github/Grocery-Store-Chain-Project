
abstract public class Frugal {
	//Store Detail Information
	protected String location_Name;
	protected int location_Zip;
	protected String City;
	protected double TAX;
	
	
	//Store Gross Income
	protected double income;
	protected double cost;
	protected double revenue;
	
	public double store_Revenue() {
		revenue = income - cost;
		return revenue;
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
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	

}
