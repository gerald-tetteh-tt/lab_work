import java.util.Random;

class QuestionSix {
	public static void main(String args[]) {
		for (int i = 0; i < 6; i++) {
			// 1 to 49
			System.out.println(genNumber(50));
		}

	}

	public static int genNumber(int upperBound) {
		Random random = new Random();
		return random.nextInt(upperBound - 1) + 1;
	}
}
