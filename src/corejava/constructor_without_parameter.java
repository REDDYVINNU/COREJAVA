package corejava;

public class constructor_without_parameter {
	int id;
	double salary;
	String name;
	String company_name;
	
	constructor_without_parameter(){
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
		constructor_without_parameter e = new constructor_without_parameter();
		e.employee_details();
	}

}
