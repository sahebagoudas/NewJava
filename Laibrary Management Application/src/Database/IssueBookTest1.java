package Database;

import java.util.Scanner;

public class IssueBookTest1 {
	Scanner sc = new Scanner(System.in);

	public void addBook() {
		System.out.println("How many Book you want Add");
		int n = sc.nextInt();

		IssueBook Ib = new IssueBook();
		String book[] = new String[n];
		String author[] = new String[n];
		String depart[] = new String[n];
		String year[] = new String[n];
		int j = 1;
		for (int i = 0; i < n; i++) {
			System.out.println("Add " + (j) + " Book Name - ");
			String a = sc.next();
			book[i] = a;
			System.out.println("Add " + (j) + "Athour Name- ");
			String b = sc.next();
			author[i] = b;
			System.out.println("Enter " + (j) + "Department-");
			String c = sc.next();
			depart[i] = c;
			System.out.println("Enter " + (j) + "Book Year of Publication");
			String d = sc.next();
			year[i] = d;
			j++;
		}
		Ib.setBook_Name(book);
		Ib.setAuthor_Name(author);
		Ib.setDepartment(depart);
		Ib.setYear_of_Publish(year);

		System.out.println(" Would you like to add one more Book? Y/N");
		String z = sc.next();
		if (z.equalsIgnoreCase("y")) {
			addBook();
		} else {
			IssueBookTest1 Ibt = new IssueBookTest1();
			IssueBook ib = new IssueBook();
			System.out.println("1 - Add Books");
			System.out.println("2 - Show Books");
			System.out.println("3 - Exit");
			int aa = sc.nextInt();
			switch (aa) {
			case 1:
				Ibt.addBook();
				System.out.println("Would you like to add more Books(Y/N)?");
				String cc = sc.next();
				if (cc.equalsIgnoreCase("y")) {
					Ibt.addBook();
				} else if (cc.equalsIgnoreCase("n"))
					ib.welome();
				else {
					System.out.println("Invalid Entry Please Try Again");
					ib.inSideLogin();
				}
				break;
			case 2:
				Ib.getBook_Name();
				System.out.println();
				Ib.getAuthor_Name();
				System.out.println();
				Ib.getDepartment();
				System.out.println();
				Ib.getYear_of_Publish();
			}
		}

	}

}
