package AdminPage;

import java.util.Scanner;

import Database.IssueBook;
import Database.IssueBookTest1;
import WelocmePage.WelcomeWindow;

public class LoginPage extends WelcomeWindow{
	Scanner sc= new Scanner(System.in);
	
	 public void inSideLogin() {
		 IssueBookTest1 Ibt= new IssueBookTest1();
		 System.out.println(" ****WELOCME TO ADMIN PAGE*** ");
		 System.out.println("Login Successuful");
		 
		 System.out.println("1 - Add Books");
		 System.out.println("2 - Show Books");
		 System.out.println("3 - Exit");
		 int a=sc.nextInt();
		 switch (a) {
		case 1:
			Ibt.addBook();
			break;
		}
	 }
	
	 public void login() {
		    
		    LoginPage lp= new LoginPage();
		    SignUpTest supt=new SignUpTest();
	    	System.out.println("Enter The User Id= ");
	    	String x=sc.next();
	    	System.out.println("Enter Password= ");
	    	String y=sc.next();
	        
	    	if (x.equals(supt.getUser_Name()) && y.equals(supt.getPassword())){
	    		lp.inSideLogin();
	    	}
	    	else {
	    		System.out.println("Invalid User Details");
	    		welome();
	    	}
	    	
	    	
	    }

}
