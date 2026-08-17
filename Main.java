package System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();

		while (true) {
			System.out.println();
			System.out.println("=====Student management System=========");
			System.out.println();

			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Student ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Student Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Student Age: ");
				int age = sc.nextInt();
				System.out.print("Enter Student Marks: ");
				double marks = sc.nextDouble();

				Student student = new Student(id, name, age, marks);
				service.addstudent(student);
				break;

			case 2:
				service.viewstudent();
				break;

			case 3:
				System.out.println("Enter student id");
				int sid = sc.nextInt();
				service.deletestudent(sid);
				break;

			case 4:
				System.out.print("Enter Student ID to update: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter New Name: ");
				String newName = sc.nextLine();
				System.out.print("Enter New Age: ");
				int newAge = sc.nextInt();
				System.out.print("Enter New Marks: ");
				double newMarks = sc.nextDouble();

				service.updatestudent(updateId, newName, newAge, newMarks);
				break;

			case 5:
				System.out.println("Thank you for using the application!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Try again.");

			}
		}
	}
}
