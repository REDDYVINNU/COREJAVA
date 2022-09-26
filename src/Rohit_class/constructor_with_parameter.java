package Rohit_class;

public class constructor_with_parameter {
	int eid;
	int salary;
	String company;
	
	constructor_with_parameter(int id,int money,String name ){
		this.eid=id;
		this.salary=money;
		this.company=name;
	}
	void details() {
		System.out.println("employeee id is = "+eid);
		System.out.println("employeee salary is = "+salary);
		System.out.println("company name is = "+company);
	}

	public static void main(String[] args) {
		constructor_with_parameter ss = new constructor_with_parameter(507,25000,"vivo");
		ss.details();
	}

}
