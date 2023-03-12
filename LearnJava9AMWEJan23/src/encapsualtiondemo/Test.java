package encapsualtiondemo;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAge(150);
		System.out.println(emp.getAge());
		emp.setDepartment("QA");
		System.out.println(emp.getDepartment());
		
		System.out.println(emp.getOrg());
	}

}
