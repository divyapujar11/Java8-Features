package java8.features.methodref.contructor;

public class Test {

	public static void main(String[] args) {
		MyInterface f = s -> new MyClass(s);
		f.get("using lamdas");

		MyInterface f1 = MyClass::new; // new maps to constructor of MyCLass class
		f1.get("using constructor mapping");
	}

}
