package java8.features.lamda.parameter;

public class Test {
	public static void main(String[] args) {
		Sum s = (x,y) -> System.out.println("Sum of 2 numbers: "+ (x+y));
		s.sum(10, 20);
	}
}
