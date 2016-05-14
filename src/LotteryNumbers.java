import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
		int rand = new Random().nextInt(101);
		System.out.println(rand);
		}
	}

}
