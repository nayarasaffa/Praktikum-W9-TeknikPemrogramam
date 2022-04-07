// The employee will be one that is an hourly employee but 
// also earns a commission on sales.

public class Commission extends Hourly {
	double totalSales;			// total sales the employee has made
	double commissionRate;		// e commission rate for the employee
	
	// Constructor
	public Commission(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double eCommissionRate) {
		super (eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = eCommissionRate;
	}
	
	// Instance variable representing total sales
	public void addSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	// Compute the pay for hours worked then add to that the 
	// pay from commission on sales
	public double pay() {
		double payment = super.pay() + commissionRate*totalSales;
		commissionRate = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " +totalSales;
		result += "\nCommission rate: " + commissionRate;
		return result;
	}
}
