package TPO;

public class TpoData {
	private String Name;
	private String Mb_No;
	private String Department;
	private String section;
	private String Email_ID;
	private int Eccessibility=10;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMb_No() {
		return Mb_No;
	}
	public void setMb_No(String mb_No) {
		Mb_No = mb_No;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getEmail_ID() {
		return Email_ID;
	}
	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}
	public int getEccessibility() {
		return Eccessibility;
	}
	public void setEccessibility(int eccessibility) {
		Eccessibility = eccessibility;
	}
	

}
