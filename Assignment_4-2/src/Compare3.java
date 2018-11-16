
public class Compare3 {

	public static void largest(String str1, String str2, String str3) {

		int var1 = str1.compareTo(str2);
		int var2 = str1.compareTo(str3);
		int var3 = str2.compareTo(str1);
		int var4 = str2.compareTo(str3);
		int var5 = str3.compareTo(str1);
		int var6 = str3.compareTo(str2);

		if (var1 > 0 && var2 > 0)
			System.out.println("\"" + str1 + "\" is largest");
		/*
		 * System.out.println(var1); System.out.println(var2);
		 */

		if (var3 > 0 && var4 > 0)
			System.out.println("\"" + str2 + "\" is largest");
		/*
		 * System.out.println(var3); System.out.println(var4);
		 */

		if (var5 > 0 && var6 > 0)
			System.out.println("\"" + str3 + "\" is largest");
		/*
		 * System.out.println(var5); System.out.println(var6);
		 */

	}

	public static void largestInt(String str1, String str2, String str3) {
		
		Integer obj1 = new Integer(str1);
		Integer obj2 = new Integer(str2);
		Integer obj3 = new Integer(str3);			
		
		
		int var1 = obj1.compareTo(obj2);
		int var2 = obj1.compareTo(obj3);
		int var3 = obj2.compareTo(obj1);
		int var4 = obj2.compareTo(obj3);
		int var5 = obj3.compareTo(obj1);
		int var6 = obj3.compareTo(obj2);
		
		if (var1 > 0 && var2 > 0)
			System.out.println("\"" + str1 + "\" is largest");
		/*
		 * System.out.println(var1); System.out.println(var2);
		 */

		if (var3 > 0 && var4 > 0)
			System.out.println("\"" + str2 + "\" is largest");
		/*
		 * System.out.println(var3); System.out.println(var4);
		 */

		if (var5 > 0 && var6 > 0)
			System.out.println("\"" + str3 + "\" is largest");
		/*
		 * System.out.println(var5); System.out.println(var6);
		 */
	}

}
