import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long emp_id;
	@Column(name= "EmployeeName")
	private String employee_name;
	@ManyToOne
	@JoinColumn(name="DepartmentId")
	private Department department;
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(String employee_name) {
		super();
		this.employee_name=employee_name;
	}
	

}
