package features.giraffe;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import features.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void test3で割り切れる() {
		FizzBuzz fizzBuzz = new features.giraffe.FizzBuzz();
		assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
		assertThat(fizzBuzz.fizzBuzz(6), is("Fizz"));
	}

	@Test
	public void test5で割り切れる() {
		FizzBuzz fizzBuzz = new features.giraffe.FizzBuzz();
		assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
	}

	@Test
	public void test3と5で割り切れる() {
		FizzBuzz fizzBuzz = new features.giraffe.FizzBuzz();
		assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
		assertThat(fizzBuzz.fizzBuzz(30), is("FizzBuzz"));
	}

	@Test(expected = RuntimeException.class)
	public void test正の整数でない() {
		FizzBuzz fizzBuzz = new features.giraffe.FizzBuzz();
		fizzBuzz.fizzBuzz(-1);		
	}

	@Test(expected = RuntimeException.class)
	public void testゼロの場合() {
		FizzBuzz fizzBuzz = new features.giraffe.FizzBuzz();
		fizzBuzz.fizzBuzz(0);		
	}

	@Test
	public void test3でも5でも割り切れない() {
		FizzBuzz fizzBuzz = new features.giraffe.FizzBuzz();
		assertThat(fizzBuzz.fizzBuzz(8), is("8"));
		assertThat(fizzBuzz.fizzBuzz(11), is("11"));
	}

}

	
	