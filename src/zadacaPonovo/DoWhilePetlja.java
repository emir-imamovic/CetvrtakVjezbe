package zadacaPonovo;

public class DoWhilePetlja {
	public static void main(String[] args) {
		// do while petlja/

		System.out.println("Ispis brojeva sa while petljom.");
		int counter = 0;
		do {
			System.out.printf("%d ", ++counter);
		} while (counter <= 10);

	}
}
