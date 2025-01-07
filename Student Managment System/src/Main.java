import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws InterruptedException {
		while(true){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Credit: Charlie Yong");
		System.out.println("1. add student");
		System.out.println("2. display student");
		System.out.println("3. remove student");
		System.out.println("4. search student");
		System.out.println("5. Exit ");
		System.out.println("The maximum amount of students allowed in one time are 100");
		System.out.print("ans: ");
		int ans = sc.nextInt();
		sc.nextLine();
		
		if(ans==5) {
			exitmethod();
		}
		
		
		Input inputstudent = new Input();
		inputstudent.giveValue();
		if(ans==1) {
		System.out.print("How many student do you want to input: ");
		int count = sc.nextInt();
		inputstudent.inputstudent(count);
		}
		else if(ans==2) {
			inputstudent.displayStudent();
			System.out.println("Press enter to exit");
			String enter = sc.nextLine();
		}
		else if(ans==3) {
			System.out.println("Please enter the student value : ");
			int value = sc.nextInt();
			inputstudent.removeStudent(value);
		}
		else if(ans==4) {
			System.out.println("Please enter the type of value: ");
			System.out.println("1. student name");
			System.out.println("2. student code");
			System.out.println("3. student value");
			int students = sc.nextInt();
			sc.nextLine();
			if(students==1) {
				System.out.println("Please enter the name: ");
				String name = sc.nextLine();
				inputstudent.searchStudent(name, students);
				inputstudent.pressenter();
			}
			else if(students==2) {
				System.out.println("Please enter the code: ");
				int code = sc.nextInt();
				inputstudent.searchStudent(code, students);
				inputstudent.pressenter();
			}
			else if(students==3) {
				System.out.println("Please enter the value: ");
				int value = sc.nextInt();
				inputstudent.searchStudent(value);
				inputstudent.pressenter();
			}
			else {
				System.out.println("Error input");
				inputstudent.checkfunc();
			}
			
			
		}
		
	}
	}
	public static void exitmethod() {
		System.exit(0);
	}

}
