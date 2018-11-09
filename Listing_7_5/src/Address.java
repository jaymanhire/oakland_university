
public class Address {

	private String streetAddress;
	private String city;
	private String state;
	private long zipCode;

	public Address(String streetAddress, String city, String state, long zipCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String toString() {
		String result;
		
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		return result;
	}

}
