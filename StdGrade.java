import java.util.Scanner;

public class StdGrade {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you marks Between 10 TO 90");
		int result = sc.nextInt();
		char grade;
		if (result >= 90) {
			grade = 'a';
		} else if (result >= 80) {
			grade = 'b';
		} else if (result >= 70) {
			grade = 'c';
		} else if (result >= 60) {
			grade = 'd';
		} else {
			grade = 'f';
		}
		System.out.println("Grade of the student with the marks " + result + " is " + grade);
	}
}
