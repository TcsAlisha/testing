package testing;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public float add(float a, float b) {
		if(a>b) {
			System.out.println("Some Message");
		}
		return a+b;
	}
	public float divide(int a, int b) {
		return a/b;
	}
}
