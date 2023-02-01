package java8.features.function;

import java.util.function.Function;

public class FunctionsTest {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("bharath"));
		System.out.println(f.apply("divya"));
	}

}
