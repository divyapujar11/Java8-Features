package java8.features.methodref.contructor;

public class MyClass {
	String s;
	
	MyClass(String s){
		this.s = s;
		System.out.println("Inside Constructor: "+ s);
	}
}
