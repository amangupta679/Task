package inheritance.demo.entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;


@Entity
//@DiscriminatorColumn(name="emp_type")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
abstract public class Employee {
@Id
@Column(name="emp_id")
private int employeeId;

@Column(name="emp_name")

private String employeeName ; 

public Employee() {
	
}

public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}





}
