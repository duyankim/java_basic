package baekjoon.algorithmn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Stack10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop, i = 0, idx = 0, num = 0;
		loop = Integer.parseInt(br.readLine());
		
		String[] cmds = {"push", "pop", "size", "empty", "top"};
		Stack<Integer> stack = new Stack<>();

		while (true) {
			
			String input = br.readLine();
			
			for (int j = 0; j < cmds.length; j++) {
				if (input.contains(cmds[j])) idx = j;
			} 
			
			switch(idx) {
			case 0 :
				num = Integer.parseInt(input.substring(5));
				stack.push(num);
				break;
			case 1 :
				try {
					System.out.println(stack.peek());
					stack.pop();
				} catch (EmptyStackException e) {
					System.out.println(-1);
				}
				break;
			case 2 :
				System.out.println(stack.size());
				break;
			case 3 :
				int result = stack.isEmpty() ? 1 : 0;
				System.out.println(result);
				break;
			case 4 :
				try {
					System.out.println(stack.peek());
				} catch (EmptyStackException e) {
					System.out.println(-1);
				}
				break;
			default :
				break;
			}
			i++;
			if (i == loop) break;
		}
	}
}
