package Database;

import java.util.Scanner;

import AdminPage.LoginPage;

public class IssueBook extends LoginPage {
	private String[] Book_Name;
	private String[] Author_Name;
	private String[] Department;
	private String [] Year_of_Publish;

	public void getBook_Name() {
		for (int i = 0; i < Book_Name.length; i++) {
			System.out.println(Book_Name[i]);
		}
	}
	public String[] geetBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String [] book_Name) {
		this.Book_Name = book_Name;
	}

	public void getAuthor_Name() {
		for (int i = 0; i < Author_Name.length; i++) {
			System.out.println(Author_Name[i]);
		}
	}

	public void setAuthor_Name(String [] author_Name) {
		this.Author_Name = author_Name;
	}

	public void getDepartment() {
		
		for (int i = 0; i < Department.length; i++) {
			System.out.println(Department[i]);
		}
	}

	public void setDepartment(String [] department) {
		this.Department = department;
	}

	public void getYear_of_Publish() {
		for (int i = 0; i < Year_of_Publish.length; i++) {
			System.out.println(Year_of_Publish[i]);
		}
	}

	@Override
	public String toString() {
		return "IssueBook [Book_Name=" + Book_Name + ", Author_Name=" + Author_Name + ", Department=" + Department
				+ ", Year_of_Publish=" + Year_of_Publish + "]";
	}

	public void setYear_of_Publish(String [] year_of_Publish) {
		this.Year_of_Publish = year_of_Publish;
	}

}
