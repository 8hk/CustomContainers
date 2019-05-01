package TakeHomeExam;
import TakeHomeExam.CustomList;
public class CustomLinkedList<T> extends CustomList <T>{

	Node head =null;
	//constructor of CustomLinkedList
	public CustomLinkedList(int volume) {
		this.volume = volume;
		log("Custom Linked List created");
		log("size is: "+volume);
	}
	//insert new node at beginning
	@Override
	void add(T val) {
		if(head ==null){
			Node newNode = new Node(val,null);
			head = newNode;
		}
		else {
			Node newNode = new Node(val,head);
			head = newNode;
		}
	}
	//calculates the size of linked list by moving start to end.
	@Override
	int size() {
		int size = 0;
		Node tmp =head;
		while(tmp!=null){
			tmp = tmp.next;
			size++;
		}
		return size;
	}
	//changes the targeted value by given value by searching the targeted element in the list
	@Override
	void set(T target, T value) {
		/* TODO
		 * check the if list empty or not*/
		for (Node tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.value.equals(target)) {
				tmp.value = value;
				return;
			}
		}
	}
	// get the value of index by iterating until desired index
	@Override
	T get(int index) {
		if(head == null){ 
			log("linked list empty please insert some item");
			return null;
		}
		int i = 1;
		Node tmp = head;
		while(i != index && index != 0){
			tmp = tmp.next;
			i++;
		}
		return (T) tmp.value;

	}
	//clears whole list
	@Override
	boolean clear() {
		Node tmp = head;
		while(tmp.next != null){
			
			tmp = tmp.next;
			head =null;
			
		}
		log(this.getClass().toString()+"list is empty now");
		return true;
	}
	//prints the whole list by searchin whole list
	@Override
	void print() {
		/*
		 * TODO add different mode of printing
		 */
		Node tmpNode = head ;
		if(tmpNode == null) {
			log(this.getClass().toString()+" list is empty");
			return;
		}
			
			int index = 0;
			while (tmpNode != null) {
				index++;
				log("index: " + index + " value: " + tmpNode.value + " ");
				tmpNode = tmpNode.next;
			}
			log("");
			
	}
	//insert the value at desired target
	@Override
	void insertAfter(int target, T value) {
		Node tmp = head;
		for ( int i = 0;i<size();i++) {
			if (i==target) {
				Node node = new Node(value, tmp.next);
				tmp.next = node;
				return;
			}
		}
		if(target == 0) {
			add(value);
		}
	}
	//removes the value at targeted index
	@Override	
	void removeAt(int target){
		int index = 1;
		for (Node tmp = head; tmp != null && tmp.next != null; tmp = tmp.next) {
			if(target == 0){
				head = tmp.next;
				return;
			}
			if (index == target) {
				tmp.next = tmp.next.next;
				return;
			}
			index++;
		}
	}
	//removes the head
	@Override
	void removeFirst(){
		Node tmp = head;
		head = tmp.next;
	}
}
