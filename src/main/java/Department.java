import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Department")
public class Department {
	@Id
	@GeneratedValue
	@Column(name="DepartmentId")
	private long dept_id;
	@Column(name="DepartmentName")
	private String nameofdepartment;
	@OneToMany(mappedBy="department")
	private List<Employee> employees;
	public long getDept_id() {
		return dept_id;
	}
	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}
	public String getNameofdepartment() {
		return nameofdepartment;
	}
	public void setNameofdepartment(String nameofdepartment) {
		this.nameofdepartment = nameofdepartment;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Department() {
		super();
	}

}
