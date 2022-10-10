package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	private int eid;
	private String ename;
	private int salary;
	
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(11221,"durga",50000));
		ls.add(new Employee(11222,"vinay",60000));
		ls.add(new Employee(11223,"surendra",70000));
		ls.add(new Employee(11224,"sandeep",80000));
		ls.add(new Employee(11225,"jithu",90000));
		Iterator<Employee> fr=ls.iterator();
		while(fr.hasNext()) {
			Employee tt = fr.next();
			if(tt.getSalary()==50000) {
				System.out.println(tt.getEid()+" "+tt.getEname()+" "+tt.getSalary());
			}
		}
	}

}
