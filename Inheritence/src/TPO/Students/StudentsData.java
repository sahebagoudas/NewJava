package TPO.Students;

import TPO.TpoData;

public class StudentsData extends TpoData {
     private float Total_Percentage;
     
     
	 //TpoData td= new TpoData();
    public void feedStdData() {
    	setName("Ravi Patil");
    	setMb_No("9535446522");
    	setDepartment("Mechanical");
    	Total_Percentage=52.45f;
    	
    	setName("Geeta Horte");
    	setMb_No("9535444545");
    	setDepartment("Computer Science");
    	Total_Percentage=96.89f;
    	
    	setName("Mohan Pagal");
    	setMb_No("655444545");
    	setDepartment("Electrical");
    	Total_Percentage=61.58f;
    }
}
