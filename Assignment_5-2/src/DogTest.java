
public class DogTest {

	public static void main(String[] args) {

		{
			Dog dog = new Dog("Spike");
			System.out.println(dog.getName() + " says " + dog.speak());

			Yorkshire yorky = new Yorkshire("Yorky");
			System.out.println(yorky.getName() + " says " + yorky.speak());

			Labrador lab = new Labrador("Lab", "yellow");
			System.out.println("The " + lab.getColor() + " " + lab.getName() + " says " + lab.speak());

		}

	}
}
