import java.text.NumberFormat;

public class ManageAccounts {

	public static void main(String[] args) {
		
		Account account1 = new Account(1000, 1111, "Sally");
		Account account2 = new Account(500, 1112, "Joe");			
			
		System.out.println(account1.chargeFee());
		System.out.println(account2.chargeFee());
		
		account2.changeName("Joseph");
		
		account2.deposit(100.00);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println(fmt.format(account2.getBalance()));
		
		account1.withdraw(50.00);
		NumberFormat fmt2 = NumberFormat.getCurrencyInstance();
		System.out.println(fmt2.format(account1.getBalance()));
		
		System.out.println(account1.toString());
		System.out.println(account2.toString());		
	}
}
