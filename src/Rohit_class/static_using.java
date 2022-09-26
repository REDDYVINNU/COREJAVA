package Rohit_class;

class student{
	int rollno;
	String branch;
	static String college_name;
}
class staff{
	String name;
	String deling_subject;
}
public class static_using {

	public static void main(String[] args) {
		staff s = new staff();
		s.name="Ayyapa";
		s.deling_subject="Thermal";
		System.out.println("staff name :"+s.name);
		System.out.println("deling subject :"+s.deling_subject);
		student vinay =new student();
		vinay.rollno=309;
		vinay.branch="Mechanical";
		student.college_name="MIST";
		System.out.println("student roll no :"+vinay.rollno);
		System.out.println( "branch :"+vinay.branch);
		System.out.println("college name :"+student.college_name);
		
		student surendra = new student();
		surendra.rollno=310;
		surendra.branch="metrology";
		System.out.println("student name :"+surendra.rollno);
		System.out.println("branch :"+surendra.branch);
		System.out.println("college name :"+student.college_name);
		


	}

}
