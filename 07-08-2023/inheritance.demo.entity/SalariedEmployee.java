package inheritance.demo.entitty;

import org.hibernate.sql.ast.spi.AbstractSqlAstTranslator;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity
//@DiscriminatorValue("Salaried")

public class SalariedEmployee extends Employee{

	@Column(name="emp_sal")
	private double salary ;
	
	public SalariedEmployee() {
	
}
	public SalariedEmployee(int employeeId , String employeeName , double Salary )
	{
		super(employeeId , employeeName);
		this.salary = salary;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
	
