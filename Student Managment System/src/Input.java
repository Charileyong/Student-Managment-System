import java.util.ArrayList;
import java.util.Scanner;
public class Input {
	public static ArrayList<Student> studentcollection = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	int studentcode;
	String studentClass;
	
	static Student[] student = new Student[100];
	static int countStudent = 0;
	public void giveValue() {
		if(student[0]==null) {
		for(int i = 0;i<student.length;i++) {
			student[i] = new Student();
		}
		}
	}
	public void inputstudent(int max) throws InterruptedException {
		 for(int i=0;i<max;i++) {
			 if(student.length>countStudent) {
			 Thread.sleep(1000);
			 
	        System.out.print("Name:");
	        name = sc.nextLine();
	        System.out.print("Age:");
	        age = sc.nextInt(); 
	        sc.nextLine(); // Consume the leftover newline character
	        System.out.print("StudentCode:");
	        studentcode = sc.nextInt();
	        sc.nextLine(); // Consume the leftover newline character
	        System.out.print("StudentClass:");
	        studentClass = sc.nextLine(); // Use nextLine() instead of next()

		
		student[countStudent].addStudent(name, age, studentcode, studentClass,countStudent);
		
		
		studentcollection.add(student[countStudent]);
		System.out.println("===============");
		countStudent++;
			 }
			 else {
				 System.out.println("Error Message: exceed 100 students");
			 }
		 }
	}
	public void displayStudent() {
		for(Student e : studentcollection) {
			int index = studentcollection.indexOf(e);
			System.out.print(index+1+". ");
			System.out.print("Name: " + e.name+ " ");
			System.out.print("Age: " +e.age+ " ");
			System.out.print("StudentCode: " +e.studentcode+" ");
			System.out.print("StudentClass: " +e.studentClass+ " ");
			System.out.println();
	}
}
	private void displayStudent(int a) {
			Student student = studentcollection.get(a);
			//int index = studentcollection.indexOf(e);
			System.out.print(a+1+". ");
			System.out.print("Name: " + student.name+ " ");
			System.out.print("Age: " +student.age+ " ");
			System.out.print("StudentCode: " +student.studentcode+" ");
			System.out.print("StudentClass: " +student.studentClass+ " ");
			System.out.println();
	}
	public static void removeStudent(int a) {
		if(a>=0&&a<studentcollection.size()) {
		a-=1;
		studentcollection.remove(a);
		}
		else {
			System.out.println("Unsuccesful because of unknow error");
		}
		
	}
	public void searchStudent(String name,int result) {
		
		for(int i = 0;i<studentcollection.size();i++) {
			if(name.equalsIgnoreCase(student[i].name)) {
				int a = studentcollection.indexOf(student[i]);
				displayStudent(a);
				
			}
			
		}
	}
public void searchStudent(int studentcode,int result) {
		
		for(int i = 0;i<studentcollection.size();i++) {
			if(studentcode==student[i].studentcode) {
				int a = studentcollection.indexOf(student[i]);
				displayStudent(a);
				
			}
			
		}
	}
public void searchStudent(int studentcount) {
	studentcount-=1;
	if (studentcount >= 0 && studentcount < studentcollection.size()) {
        displayStudent(studentcount);
    } else {
        System.out.println("Invalid student index");
    }
	}

public void pressenter() {
	System.out.println("Press enter to exit");
	String enter = sc.nextLine();
}
public void checkfunc() {
	for(int i = 0;i<studentcollection.size()-1;i++) {
			int a = studentcollection.indexOf(student[i]);
			displayStudent(a);
			pressenter();
			
	}
}

}

