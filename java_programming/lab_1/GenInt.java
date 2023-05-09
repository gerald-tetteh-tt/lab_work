import java.util.Random;

class GenInt {
	public static void main(String args[]) {
		Random random = new Random();
		checkGenNumber(random.nextInt(101));
	}

	public static void checkGenNumber(int number) {
		if (number == 0) {
			System.out.println("frozen");
		} else if (number >= 1 && number <= 14) {
			System.out.println("cold");
		} else if (number >= 15 && number <= 24) {
			System.out.println("cool");
		} else if (number >= 25 && number <= 40) {
			System.out.println("warm");
		} else if (number >= 41 && number <= 60) {
			System.out.println("hot");
		} else if (number >= 61 && number <= 80) {
			System.out.println("very hot");
		} else if (number >= 81 && number <= 99) {
			System.out.println("extremely hot");
		} else {
			System.out.println("boiling");
		}
	}
}
