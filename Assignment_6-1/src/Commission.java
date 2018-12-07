
public class Commission extends Hourly {

	private double totalSales;
	private double commissionRate;
	private double commission;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
			double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
		commission = 0;

	}

	public void addSales(double sales) {
		this.totalSales += sales;
	}

	// -----------------------------------------------------------------
	public void awardCommission(double commBonus) {
		commission = totalSales * commissionRate;
	}


	public double pay() {
		double payment = super.pay() + commission;
		commission = 0;
		return payment;
	}

	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		result += "\nCommission: " + (totalSales * commissionRate);
		return result;
	}

}
