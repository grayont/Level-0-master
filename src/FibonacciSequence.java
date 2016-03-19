
public class FibonacciSequence {
	public static void main(String[] args) {
		int A = 0;
		int B = 1;
		int C = 0;

		for (int i = 0; i < 12; i++) {
			System.out.println(A);
			C = A + B;
			A = B;
			B = C;

		}
	}

}
