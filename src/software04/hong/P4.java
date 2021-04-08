package software04;

public class P4 {

	public static void main(String[] args) {
		// if문 1번 2021-04-02 kopo03 김도연
		int score = 80; //할당
		if (score > 60) { //점수가 60초과면 true
			System.out.println("합격입니다."); //출력
		}
		
		// if문 2번 2021-04-02 kopo03 김도연
		if (score > 60)  //점수가 60초과면 true
			System.out.println("합격입니다."); //출력
		
		// if문 3번 2021-04-02 kopo03 김도연
		if (score > 60) { //점수가 60초과면 true
			System.out.println("합격입니다."); //출력
		} else { //점수가 60점 이하면 해당
			System.out.println("불합격입니다."); //출력
		}
		
		// if문 4번 2021-04-02 kopo03 김도연
		int num = -1; //변수 할당 
		if(num > 0) { //조건 : 양수일 때 true
			System.out.println("양수입니다."); //출력
		} else if (num < 0) {//조건 : 음수일때 true
			System.out.println("음수입니다."); //출력
		} else {//조건 : 양수도 음수도 아닐때 즉 0일때
			System.out.println("영입니다."); //출력
		}
		
		// if문 5번 2021-04-02 kopo03 김도연
		if(score >= 90) {//조건 : 점수가 90이상
			System.out.println("A등급"); //출력
		} else if (score >= 80 && score < 90) {//조건 : 점수가 80이상 90미만
			System.out.println("B등급"); //출력
		} else if (score >= 70 && score < 80) {//조건 : 점수가 70이상 80미만
			System.out.println("C등급"); //출력
		} else {//점수가 70점 미만일 때
			System.out.println("F등급");
		}
	}

}
