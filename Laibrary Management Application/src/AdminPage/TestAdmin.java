package AdminPage;

import java.util.Scanner;

public class TestAdmin {
	
	Scanner sc= new Scanner(System.in);
	
    public void loginChoice() {
    	  
    	  AdminPage ad=new AdminPage();
		  LoginPage lp= new LoginPage();
		  System.out.println("1- Admin Login");
		  System.out.println("2- User Login");
		  int a=sc.nextInt();
		  if (a==1)ad.adminpage();
		  else if(a==2)lp.login();
	       
	      else {
	    	  System.out.println("Invalid Entry");
	    	  ad.welome();}
	}
}
