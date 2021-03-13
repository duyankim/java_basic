package javabasic;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 5;
		
		//직각삼각형
		for (int i=1; i<=line; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//삼각트리
		for (int i=1; i<=line; i++) {
			for (int k=0; k<line-i; k++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i-1; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		System.out.println();
		
		//거꾸로트리
		for (int i=0; i<=line; i++) {
			for (int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*line-2*i-1; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}

}
