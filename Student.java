package department;

public class Student extends Department {

    public void studentName() {
		System.out.println("Sangeetha");

	}

	public void studentDept() {
		System.out.println("CSE");

	}

	public void studentId() {
		System.out.println("09cse45");

	}

	public static void main(String[] args) {
		
		Student details=new Student();
	
		details.departmentName();
		details.studentName();
		details.studentDept();
		details.studentId();

	}

}

