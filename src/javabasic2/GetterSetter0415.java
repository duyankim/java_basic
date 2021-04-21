package javabasic2;

import java.util.ArrayList;

public class GetterSetter0415 {

	public static void main(String[] args) {

		ArrayList<StudentInfo0415> infoArray = new ArrayList<StudentInfo0415>();

		StudentInfo0415 info = null;

		for (int i = 0; i < 5; i++) {

			info = new StudentInfo0415();
			info.setName("곽두팔" + i);
			info.setId(123450 + i);
			info.setBirth(210101 + i);
			info.address = "제주 서귀포시";
			info.setScore(4.5);
			info.bloodType = 'O';

			infoArray.add(info);
		}
		System.out.println("이름\t학번\t생일\t");
		for (int j = 0; j < infoArray.size(); j++) {
			System.out.printf("%s\t%d\t%d\n", infoArray.get(j).getName(), infoArray.get(j).getId(),
					infoArray.get(j).getBirth());
		}
	}
}
