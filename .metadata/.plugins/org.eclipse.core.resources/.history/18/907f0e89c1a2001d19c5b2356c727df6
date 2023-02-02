package java8.features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLower {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		
		l1.add("DIVYA");
		l1.add("JIM");
		l1.add("KIM");
		
		System.out.println(l1);
		
		List<String> list = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
