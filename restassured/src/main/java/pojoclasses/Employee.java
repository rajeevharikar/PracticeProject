package pojoclasses;

public class Employee {
	
	private String Firstname;
	private String Lastname;
	private double salary;
	private int age;
	private boolean marriage;
	private String gender;
	
	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setFirstname(String Firstname) {
		this.Firstname=Firstname;
		
	}

	public String getFirstname() {
		return Firstname;
	}
}
