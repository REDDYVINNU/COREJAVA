package corejava;

public class employee {
	int id;
	double salary;
	String name;
	String company_name;
	
	employee(){
		id=25152;
		salary=12500;
		name="ramu";
		company_name="ITC";
	}
	
	void employee_details() {
		System.out.println("employee id :"+id);
		System.out.println("employee salary :"+salary);
		System.out.println("employee name :"+name);
		System.out.println("company name :"+company_name);
	}
	

	public static void main(String[] args) {
		employee e = new employee();
		e.employee_details();
	}

}
