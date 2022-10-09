package WelocmePage;

import java.util.Scanner;

import AdminPage.AdminPage;
import AdminPage.SignUpPage;
import AdminPage.SignUpTest;
import AdminPage.TestAdmin;

public class WelcomeWindow {
	Scanner sc= new Scanner(System.in);
	public void welome() {
		System.out.println("****WELCOME TO THE LAIBRARY MANAGEMENT SYSTEM****");
		
		WelcomeWindow wd= new WelcomeWindow();
		TestAdmin tadm= new TestAdmin();
		SignUpTest sp= new SignUpTest();
		
		System.out.println("1- Login");
		System.out.println("2- Sign Up");
		System.out.println("3- Exit");
		int p=sc.nextInt();
		
		if (p==1) tadm.loginChoice();
		else if(p==2) sp.signUp();
		else {
			System.out.println("Invalid Entry");
			System.out.println("Thanks for using Laibrary Management Syastem");
		}
		
	}

}
