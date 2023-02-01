package java8.features.methodref;

public class MyClass2 {
	
	public void myMethod2(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		MyInterface f = i -> System.out.println(i);
		f.myMethod(10);
		
		MyClass2 c = new MyClass2();
		MyInterface f1 = c::myMethod2;
		f1.myMethod(20);
		
	}

}
