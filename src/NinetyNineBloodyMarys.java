public class NinetyNineBloodyMarys {
	public static void main(String[] args) {
		for (int i = 98; i > -1; i--) {
			if (i > 1) {

				System.out.println(i + " Bloody Marys on the ceiling, " + i + " Bloody Marys.");
				System.out.println("Take one down, sacrifice it to the dark lord so he can continue torturing his subjects, " + (i - 1) + " Bloody Marys on the ceiling");

				System.out.println("");
			}

			else if (i == 1) {
				System.out.println(i + " Bloody Mary on the ceiling, " + i + " Bloody Mary.");
				System.out.println("Take one down, sacrifice it to the dark lord so he can continue torturing his subjects, no more Bloody Marys on the ceiling.");
				System.out.println("");
			}

		}
		System.out.println("No more Bloody Marys on the ceiling, no more Bloody Marys.");
		System.out.println("Go the high class brewing company and buy some more, 99 Bloody Marys on the ceiling");

	}

}
