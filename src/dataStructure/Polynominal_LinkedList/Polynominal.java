package dataStructure.Polynominal_LinkedList;

import dataStructure.LinkedList.MySingleLinkedList;
import dataStructure.LinkedList.Node;

public class Polynominal {

	public char name;
	public MySingleLinkedList<Term> terms;
	
	public Polynominal(char name) {
		this.name = name;
		terms = new MySingleLinkedList<>();
	}
	
	public void addTerm(int coef, int expo) {
		if (coef == 0) {
			return;
		}
		Node<Term> p = terms.head, q = null;
		while(p != null && p.data.expo > expo) {
			q = p;
			p = p.next;
		}
		if (p != null && p.data.expo == expo) {
			p.data.coef += coef;
			if (p.data.coef == 0) {
				if (q == null) {
					terms.removeFirst();
				}
				terms.removeAfter(q);
			}
		} else {
			Term t = new Term(coef, expo);
			if (q == null) {
				terms.addFirst(t);
			} else {
				terms.addAfter(q, t);
			}
		}
	}
	
	public static void main(String[] args) {

	}

}
