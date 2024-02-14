package test_1;

public class Jerry implements Tom {

	public void test() {
		System.out.println("Test() running in Jerry class");

	}

	public void sample() {
		System.out.println("Sample() running in Jerry class");
	}

	public static void main(String[] args) {
		Jerry jerry = new Jerry();
		jerry.test();
		jerry.sample();
	}
}
