package demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter2 {
	public static void main(String[] args) {
		SchoolManager sm = new SchoolManager();
		sm.printAllEmployees(new CollegeManager());
	}
}

// school employee (who is associated with school not with individual colleges)
class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

class CollegeManager {
	// return all the employees that are assocaited with the college
	public List<CollegeEmployee> getAllEmployees() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();

		for (int i = 0; i < 10; i++) {
			CollegeEmployee ce = new CollegeEmployee();
			ce.setId("College Employee id = " + i);
			list.add(ce);
		}
		return list;
	}

	public void printEmployees() {
		List<CollegeEmployee> list1 = getAllEmployees();
		System.out.println("----------------------College Employees-----------------------------");
		for (CollegeEmployee ce : list1) {
			System.out.println(ce.getId());
		}
	}
}

class SchoolManager {
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < 5; i++) {
			Employee e = new Employee();
			e.setId("School Employee Id: " + i);
			list.add(e);
		}
		return list;
	}

	void printAllEmployees(CollegeManager cm) {
		cm.printEmployees();

		List<Employee> list2 = this.getAllEmployees();
		System.out.println("----------------------Scohool Employees-----------------------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}