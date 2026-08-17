package System;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentService {

	ArrayList<Student> students = new ArrayList<>();

	// add students
	public void addstudent(Student s) {
		students.add(s);
		System.out.println("Student added successfully");
	}

	// view students
	public void viewstudent() {
		for (Student s : students) {
			System.out.println();
			System.out.println(s);
			
		}

		if (students.isEmpty()) {
			System.out.println("no students found");
			return;
		}
	}

	// update student1`
	public void updatestudent(int id, String name, int age, double marks) {

		ListIterator<Student> itr = students.listIterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			if (s.getId() == id) {
				Student updatestd = new Student(id, name, age, marks);
				itr.set(updatestd);
				System.out.println("Student updates successfully");
				return;
			}
		}

		System.out.println("Student not found");

	}
	
	// DELETE
	
	public void deletestudent(int id) {
		Iterator<Student> itr=students.iterator();
		
		while(itr.hasNext()) {
			Student s=itr.next();
			if(s.getId()==id) {
				itr.remove();
				System.out.println("Student deleted successfully...!");
				return;
			}
		}
		System.out.println("student not found!");
	}
	

}
