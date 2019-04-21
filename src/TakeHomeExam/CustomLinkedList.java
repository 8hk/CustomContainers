package TakeHomeExam;
import TakeHomeExam.CustomList;
public class CustomLinkedList<T> extends CustomList <T>{

	Node head =null;
	public CustomLinkedList(int volume) {
		this.volume = volume;
		log("Custom Linked List created");
		log("size is: "+volume);
	}
	
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
	
	@Override
	int size() {
		int size = 0;
		Node tmp =head;
		while(tmp!=null){
			tmp = tmp.next;
			size++;
		}
//		for (Node tmp = head; tmp == null; tmp = tmp.next) {
//			
//			size ++;
//		}
		return size;
	}

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

	@Override
	T get(int index) {
		/* TODO
		 * check the if list empty or not*/
		int i = 0;
		Node tmp = head;
		while(i!=0){
			tmp = tmp.next;
			i++;
		}
		return (T) tmp.value;

	}
	@Override
	boolean clear() {
		Node tmp = head;
		while(tmp.next != null){
			
			tmp = tmp.next;
			head =null;
			
		}
		return true;
	}

	@Override
	void print() {
		/*
		 * TODO add different mode of printing
		 */
			Node tmpNode = head ;
			int index = 0;
			while (tmpNode != null) {
				log("index: " + index + " value: " + tmpNode.value + " ");
				index++;
				tmpNode = tmpNode.next;
			}
			log("");
		
		
	}
	
	void insertAfter(int target, int value) {
		for (Node tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.value.equals(target)) {
				Node node = new Node(value, tmp.next);
				tmp.next = node;
				return;
			}
		}
	}
	
	void removeAt(int target){
		int index = 1;
		for (Node tmp = head; tmp != null && tmp.next != null; tmp = tmp.next) {
			if(target == 0){
				head = tmp.next;
				return;
			}
			if (index == target) {
//				Node node = new Node(value, tmp.next);
//				if(tmp.next == null) {
//					return;
//				}
				tmp.next = tmp.next.next;
				return;
			}
			index++;
		}
	}
	
	void removeFirst(){
		Node tmp = head;
		head = tmp.next;
	}

}
