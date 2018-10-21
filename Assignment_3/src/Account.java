import java.text.NumberFormat;

public class Account {

	private double balance = 0;
	private int acctNum = 0;
	private String name;

	public double withdraw(double withdraw) {
		balance = balance - withdraw;
		return balance;
	}

	public double deposit(double deposit) {
		balance = balance + deposit;
		return balance;
	}

	public Account(double balance, int acctNum, String name) {
		this.balance = balance;
		this.acctNum = acctNum;
		this.name = name;
	} 

	public double getBalance() {
		return this.balance;
	}
	
	/*public void chargeFee() {
		int fee = 10;
		 balance = balance - fee;
	}*/

	public double chargeFee() {
		int fee = 10;
		return balance = balance - fee;
	}

	public String changeName(String newName) {
		name = newName;
		return name;
	}

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return "\nAccount Statement:\n" + "Name: " + name + "\nAccount #: " + acctNum + "\n" + "Balance: "
				+ fmt.format(getBalance());

	}

}
