
public class Compare3 {

	public static void largest(String str1, String str2, String str3) {
		
		 int var1 = str1.compareTo( str2 );
		 int var2 = str1.compareTo( str3 );
		 int var3 = str2.compareTo( str1 );
		 int var4 = str2.compareTo( str3 );
		 int var5 = str3.compareTo( str1 );
		 int var6 = str3.compareTo( str2 );

		if (var1 > 0 && var2 > 0)
			System.out.println("\"" + str1 + "\" is largest");
		/*System.out.println(var1);
		System.out.println(var2);*/

		if (var3 > 0 && var4 > 0)
			System.out.println("\"" + str2 + "\" is largest");
		/*System.out.println(var3);
		System.out.println(var4);*/

		if (var5 > 0 && var6 > 0)
			System.out.println("\"" + str3 + "\" is largest");
		/*System.out.println(var5);
		System.out.println(var6);*/

		
		// Or, as Below
	/*	if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0)
			System.out.println("\"" + str1 + "\" is largest");

		else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0)
			System.out.println("\"" + str2 + "\" is largest");

		else
			System.out.println("\"" + str3 + "\" is largest");

	}*/

	}
}