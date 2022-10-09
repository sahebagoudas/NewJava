package AdminPage;

import java.util.Scanner;

import WelocmePage.WelcomeWindow;

public class SignUpTest extends WelcomeWindow{
	
	Scanner sc = new Scanner(System.in);
	private String User_Name ;
	private String Password;
	
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
	public static void main(String[] args) {
		SignUpTest f= new SignUpTest();
		System.out.println(f.getUser_Name());
	}
	
		
	public void signUp() {
		System.out.println("Creat Your User Name");
		String u = sc.next();
		System.out.println("Creat Your Password");
		String v = sc.next();
        System.out.println("You have Successfully Signedup Please remember your User Id= "+u+"  and Password= "+v);
       
		System.out.println("You want to Login? Y/N");
		String a=sc.next();
		if (a.equalsIgnoreCase("y")){

		    
		    LoginPage lp= new LoginPage();
		    SignUpTest supt=new SignUpTest();
	    	System.out.println("Enter The User Id= ");
	    	String x=sc.next();
	    	System.out.println("Enter Password= ");
	    	String y=sc.next();
	        
	    	if (x.equals(u) && y.equals(v)){
	    		lp.inSideLogin();
	    	}
	    	else {
	    		System.out.println("Invalid User Details");
	    		welome();
	    	}
	    	
	    	
	    
		}
	
	}
	

}
