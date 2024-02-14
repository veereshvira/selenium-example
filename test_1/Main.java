package test_1;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Tom");
		employee.setDepartment("Tester");
		employee.setSalary(40000);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDepartment());
		System.out.println(employee.getSalary());
	}
}
