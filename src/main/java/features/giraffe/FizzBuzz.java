package features.giraffe;

public class FizzBuzz implements features.FizzBuzz {

	@Override
	public String fizzBuzz(int arg0) {
		if (arg0 <= 0) {
			throw new RuntimeException();
		}

		boolean isFizz = (arg0 % 3 == 0);
		boolean isBuzz = (arg0 % 5 == 0);

		if (isFizz && isBuzz) {
			return "FizzBuzz";
		}
		if (isFizz) {
			return "Fizz";
		}
		if (isBuzz) {
			return "Buzz";
		}

		return String.valueOf(arg0);
	}

}
