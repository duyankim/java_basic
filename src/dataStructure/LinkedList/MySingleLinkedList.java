package dataStructure.LinkedList;

public class MySingleLinkedList<T> {

	public Node<T> head;
	public int size;
	
	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(T item) {
		Node<T> newNode = new Node<T>(item);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;
		before.next = temp;
		size++;
	}
	
	public T removeFirst() {
		if (head == null) {
			return null;
		} 
		
		T temp = head.data;
		head = head.next;
		return temp;
	}
	
	public void add(int index, T item) { // insert
		
	}
	
	public void remove(int index) { // delete
		
	}
	
	public int indexOf(T item) { // search
		return -1;
	}
	
	public T get(int index) {
		return null;
	}
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>();
		

	}

}
