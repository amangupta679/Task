package eighteenjuly;

public class Employee {

	private int employeeId ; 
	private String employeeName ; 
	private double salary ; 
	public Employee() {}
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	
    @Override

    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";

    }

}
	
	
	
	

