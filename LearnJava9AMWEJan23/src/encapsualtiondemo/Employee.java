package encapsualtiondemo;
//pojo  plain old java object
public class Employee {

	private int age;
	private String uid;
	private String name;
	private String department;
	private String org= "Google";

	public String getOrg() {
		return org;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=18 && age<=60) {
			this.age = age;
		}else {
			this.age = -1;
		}
		
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
