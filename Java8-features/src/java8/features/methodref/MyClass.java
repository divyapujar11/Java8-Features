package java8.features.methodref;

public class MyClass {

	public static void main(String[] args) {
		MyInterface f = i -> System.out.println(i);
		f.myMethod(10);
	}

}
