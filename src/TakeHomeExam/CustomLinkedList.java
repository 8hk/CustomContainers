package TakeHomeExam;
import TakeHomeExam.CustomList;
public class CustomLinkedList extends CustomList {

	Node head =null;
	public CustomLinkedList(int volume) {
		this.volume = volume;
		log("Custom Linked List created");
		log("size is: "+volume);
	}
	
	@Override
	void add(int val) {
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
	void set(int target, int value) {
		/* TODO
		 * check the if list empty or not*/
		for (Node tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.value == target) {
				tmp.value = value;
				return;
			}
		}
	}

	@Override
	int get(int index) {
		/* TODO
		 * check the if list empty or not*/
		int i = 0;
		Node tmp = head;
		while(i!=0){
			tmp = tmp.next;
			i++;
		}
		return tmp.value;

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
			Node tmpNode = head ;
			int index = 0;
			while (tmpNode != null) {
				log("index: "+index+" value: "+tmpNode.value + " " );
			index++;
			tmpNode = tmpNode.next;
			}
			log("");
		
		
	}
	
	void insertAfter(int target, int value) {
		for (Node tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.value == target) {
				Node node = new Node(value, tmp.next);
				tmp.next = node;
				return;
			}
		}
	}
	
	void removeAt(int target){
		for (Node tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.next.value == target) {
//				Node node = new Node(value, tmp.next);
				tmp.next = tmp.next.next;
				return;
			}
		}
	}

}
