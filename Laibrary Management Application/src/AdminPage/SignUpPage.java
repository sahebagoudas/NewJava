package AdminPage;

import java.util.Scanner;

import WelocmePage.WelcomeWindow;

public class SignUpPage extends WelcomeWindow{
	
	Scanner sc= new Scanner(System.in);
	
	private String User_Name ;
	private String Password;
	
    public SignUpPage(String user_Name, String password) {
		super();
		User_Name = user_Name;
		Password = password;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	    
}
