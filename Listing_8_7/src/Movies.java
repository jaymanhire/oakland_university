
public class Movies {

	// Creates DVD collection object and adds some DVD's to it. Prints
	// reports on the status of the collection.

	public static void main(String[] args) {

		DVDCollection movies = new DVDCollection();

		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);

		System.out.println(movies);

		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);

		System.out.println(movies);

	} 

}
