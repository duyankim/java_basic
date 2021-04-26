package sw2;

public class P27 {

	public static void main(String[] args) {
		/* CastingEx2 2021-04-26 kopo03 김도연 */
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

		b = 10;
		i = (int)b;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		b = -2;
		i = (int)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		System.out.printf("i=" + Integer.toBinaryString(i));
	}

}
