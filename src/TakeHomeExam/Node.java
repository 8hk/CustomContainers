package TakeHomeExam;

public class Node {
	//holds the value
	int value;
	
	//holds the next Node
	Node next;
	
	//constructor of node class
	Node(int v, Node n) {
		value = v;
		next = n;
	}
}
