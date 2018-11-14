
public class Compare3 {
	
	// determines the largest of three Comparable objects
	  public static <T extends Comparable<T>> T largest(T x, T y, T z) {
	    T max = x; 

	    if (y.compareTo(max) > 0)
	      max = y; 

	    if (z.compareTo(max) > 0)
	      max = z; 

	    return max; 
	  } 

/*	public static void largest(String str1, String str2, String str3) {

		if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0) {
			System.out.println("str1 is less than str2 and str3");
		}
		if (str2.compareTo(str3) < 0) {
			System.out.println("str2 is less than str3");
		}
		if (str3) {

		}
	}*/
}