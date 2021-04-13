package software05.hong;

public class Test {

	public static void main(String[] args) {
		
		String[] str=new String[] {
                "abcde",
                "abc!@#",
                "abc가나다def",
                "한글이다",                
                "abc!@#한글이다",
                "special characters ★○",
                "chinese characters 甲",
                "japanese characters キーワード"
        };
		
		for (int i = 0; i < str.length; i++) {
			boolean found = false;
			
			for (int j=0; str[i] != null && j < str[i].length(); j++) {
				if (Character.getType(str[i].charAt(j)) == Character.OTHER_LETTER) {
					found = true;
					break;
				}
			}
			
			if (found) System.out.println(str[i] + " -> including other letters");
			else System.out.println(str[i] + " -> only ascii");
			
		}

	}

}
