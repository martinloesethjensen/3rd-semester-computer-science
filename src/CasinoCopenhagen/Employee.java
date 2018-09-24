package CasinoCopenhagen;

public class Employee extends User {
	private String password;
	private int employeeNummber;

	public Employee(String name, String cpr, String password, int employeeNummber) {
		super(name, cpr);
		this.password = password;
		this.employeeNummber = employeeNummber;
	}

	@Override
	public String toString() {
		return "Employee{" +
			super.toString() +
			"password='" + password + '\'' +
			", employeeNummber=" + employeeNummber +
			'}';
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEmployeeNummber() {
		return employeeNummber;
	}

	public void setEmployeeNummber(int employeeNummber) {
		this.employeeNummber = employeeNummber;
	}
}
