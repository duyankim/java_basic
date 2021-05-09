package dataStructure.Polynominal_LinkedList;

public class Term {
	public int coef;
	public int expo;
	
	public Term (int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int calc(int x) {
		return coef * (int)Math.pow(x, expo);
	}
	
	public String toString() {
		return coef + "X^" + expo;
	}
}
