package Database;

import java.util.Scanner;

import AdminPage.LoginPage;
import WelocmePage.WelcomeWindow;

public class SignUp extends LoginPage {
	
	Scanner sc= new Scanner(System.in);
	
    public String[] signUp() {
    	System.out.println("Please enter User Id");
    	String a= sc.nextLine();
    	System.out.println("Please enter User Password");
    	String b= sc.nextLine();
    	System.out.println("****** You have Successfully Registered ******");
    	login();
    	String arr[]= {a,b};
    	
    	
    	return arr;
    	
    }
			

}
