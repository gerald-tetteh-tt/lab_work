import java.util.Random;

class QuestionFour {
	public static void main(String args[]) {
		genWithWhile();
		System.out.println("\n\n");
		genWithDoWhile();
	}

	public static void genWithWhile() {
		Random random = new Random();
		int min = -3;
		int max = 3;
		int number = 1;
		while (number != 0) {
			number = (random.nextInt(max - min)) + min;
                        System.out.println(number);
		}
	}

	public static void genWithDoWhile() {
		Random random = new Random();
                int min = -3;
                int max = 3;
                int number = 0;
                do {
                        number = (random.nextInt(max - min)) + min;
                        System.out.println(number);
                } while (number != 0);
	}
}
