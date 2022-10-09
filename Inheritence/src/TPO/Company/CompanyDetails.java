package TPO.Company;

import TPO.Staff.StaffData;

public class CompanyDetails extends StaffData{
	
	//StaffData sd= new StaffData();
	
	public int eccess(int Access) {
		setEccessibility(15);
		return getStaffAccess()+getEccessibility();
	}
	
	public void companyData() {
		setName("TOYOTA");
		setMb_No ("HR MB NO: 9110253775");
		
		System.out.println("Company Name= "+getName());
		System.out.println("Company Contact = "+getMb_No());
		System.out.println("Company Accessibilty= "+eccess(15));
		
	}

}
