package Choice_program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class linkedn{
	private String Username;
	private int Password;
	private String forgot_Password;
	
	public linkedn(String username, int password, String forgot_Password) {
		super();
		Username = username;
		Password = password;
		this.forgot_Password = forgot_Password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}
	public String getForgot_Password() {
		return forgot_Password;
	}
	public void setForgot_Password(String forgot_Password) {
		this.forgot_Password = forgot_Password;
	}
	
}
public class Stream_Own_theme {

	public static void main(String[] args) {
	List<linkedn> ld = new ArrayList<linkedn>();
	ld.add(new linkedn ("Surendr@",1212121121,"Surendr@123"));
	ld.add(new linkedn ("durg@",123456123,"Durg@123"));
	ld.add(new linkedn ("sathy@",12562356,"Sathy@123"));
	List<linkedn>fl=ld.stream().filter(y->y.getPassword()==1212121121).collect(Collectors.toList());
	fl.forEach(u->System.out.println(u.getForgot_Password()+" "+u.getPassword()+" "+u.getUsername()));

	}

}
