package java8.features.lamda.defaultmethods;

public interface A {
	default void m1() {
		System.out.println("m1 inside A");
	}
}
