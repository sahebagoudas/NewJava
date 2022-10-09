package AdminPage;

import java.util.Scanner;

import WelocmePage.WelcomeWindow;

public class AdminPage extends WelcomeWindow{
	private String Admin_Name="Anand";
	private String User_Id= "123";
	private String Password="123";
	
	Scanner sc= new Scanner(System.in);
	
	public String getAdmin_Name() {
		return Admin_Name;
	}
	public String getUser_Id() {
		return User_Id;
	}
	public String getPassword() {
		return Password;
	}
	
	public void adminpage() {
		System.out.println("****  ADMIN PAGE  ****");
		LoginPage lp= new LoginPage();
		System.out.println("Entre User Id");
		String a=sc.nextLine(); 
		System.out.println("Entre Password");
		String b=sc.nextLine(); 
		if (a.equals(this.User_Id) && b.equals(this.Password)) {
			lp.inSideLogin();
		}
		else {
			System.out.println("Invalid User Details");
			welome();
		}
	}
}
