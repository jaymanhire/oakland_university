
public class SeasonTester {

	public static void main(String[] args) {

		// Iterates through the values of the Season enumerated type.
		for (Season time : Season.values()) {
			System.out.println(time + "\t" + time.getSpan());
		}
		
		System.out.println();
		
		Season time1, time2;
		time1 = Season.summer;
		time2 = Season.fall;
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time1.name());
		System.out.println(time1.ordinal());
		System.out.println(time2.ordinal());
		System.out.println(time2.getSpan());

	}
}
