package java8.features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumbers2 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}

		System.out.println("list of numbers: " + l1);

		List<Integer> list = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("list of even filtered numbers: " + list);

		long count = l1.stream().filter(i -> i % 2 == 0).count();
		System.out.println("number of even numbers in list: " + count);

		List<Integer> sorted = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted numbers: " + sorted);

		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);

		List<Integer> comparedSort = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println("sorted numbers with comparator: " + comparedSort);

		Integer min = l1.stream().min(comp).get();
		System.out.println("min number in the list: " + min);

		Integer max = l1.stream().max(comp).get();
		System.out.println("max number in the list: " + max);

	}

}
