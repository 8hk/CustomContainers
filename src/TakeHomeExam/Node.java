package TakeHomeExam;

public class Node <T>{
	//holds the value
	T value;
	
	//holds the next Node
	Node next;
	
	//constructor of node class
	Node(T v, Node n) {
		value = v;
		next = n;
	}
}
