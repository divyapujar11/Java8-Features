package java8.features.predicates.joins;

import java.util.function.Predicate;

public class PedricatesJoin2 {

	public static void main(String[] args) {
		int[] x = { 0, 7, 10, 20, 30, 40, 50, 60, 70, 73 };
		Predicate<Integer> p1 = i -> i > 10;
		System.out.println("Greater than 10:");
		method1(p1, x);
	}

	static void method1(Predicate<Integer> p, int[] x) {
		for (int eachValue : x) {
			if (p.test(eachValue)) {
				System.out.println(eachValue);
			}
		}
	}

}
