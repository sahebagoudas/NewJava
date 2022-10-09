package TPO.Staff;

import TPO.TpoData;

public class StaffData extends TpoData {
	private int StaffAccess=5;
	//TpoData td=new TpoData();
	
	public int getStaffAccess() {
		return getEccessibility()-StaffAccess;
	}
	
	public void staffDetails() {
		setName("Sahebagouda");
		setMb_No("9110253771");
		setDepartment("TPO");
		setEmail_ID("sahebagoudas@gmail.com");
		
		setName("Abhishek");
		setMb_No("91102535451");
		setDepartment("Elelctrical");
		setEmail_ID("Abi253@gmail.com");
		
		
	}
	
	public void data() {
		setName("Anand");
		setMb_No("9449595634");
		
		System.out.println("Name of Staff"+getName());
		System.out.println("Staff Mobile Number"+getMb_No());
		System.out.println("Staff Accessiblity= "+getStaffAccess());
		
	}

}
