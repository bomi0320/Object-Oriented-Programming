package lab04Package;

public class DoubleTester {

	public static void main(String[] args) {

		double probability = 8.70;
		int percentage = (int) (Math.round(100 * probability)); // Math.round()메쏘드를 사용해서 소수 첫째 자리에서 반올림함.
		System.out.println(percentage);
	}

}
