package courseRegistration.P9005;

import java.util.Scanner;

public class Menu {
	boolean[] subject = new boolean[5]; // 0 : korean, 1 : math, 2 : english, 3 : Social Studies, 4: Science
	
	public int printMainMenu() {
		int ret = 0;
		System.out.println("#Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		Scanner sc = new Scanner(System.in);
		ret = sc.nextInt();
		return ret;
	}
	
	public void printCourseList() {
		int ret = 0;
		System.out.println("#Course List");
		System.out.println("1. Korea");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to Main");
		Scanner sc = new Scanner(System.in);
		ret = sc.nextInt();
		if (ret > 0) {
			subject[ret - 1] = true;
			printResult(getSubjectName(ret));
		}
	}
	
	public String getSubjectName(int num) {
		String subjectName="";
		if (num == 1) {
			subjectName="Korean";
		} else if (num == 2) {
			subjectName="Math";
		} else if (num == 3) {
			subjectName="English";
		} else if (num == 4) {
			subjectName="Social Studies";
		} else if (num == 5) {
			subjectName="Science";
		}
		return subjectName;
	}
	
	public void printResult(String subjectName) {
		System.out.println("\"" + subjectName + "\" is registered.\n");
	}
	
	public void printMyCourse() {
		int cnt=1;
		for (int i=0; i<subject.length; i++) {
			if (subject[i]) {
				System.out.println(cnt + ". " + getSubjectName(i+1));
				cnt++;
			}
		}
		System.out.println("- End -\n");
	}
}

