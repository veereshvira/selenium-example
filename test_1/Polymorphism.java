package test_1;

public class Polymorphism extends Runtime {
	
	@Override
	public void test() {
		System.out.println("Polymorphism--");
	}
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.test();
		polymorphism.test("ndsjn");
	}
}
