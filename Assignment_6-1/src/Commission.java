
public class Commission extends Hourly {

	private double totalSales = 0;
	private double commissionRate = 0.0;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
			double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.setCommissionRate(commissionRate);

	}

	public void addSales(double sales) {
		this.totalSales += sales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String toString() {
		String result = super.toString();
		result += "\nTotal sales: " + totalSales;
		return result;
	}

	public double pay() {
		double payment = super.pay() + totalSales;
		return payment;
	}

}
