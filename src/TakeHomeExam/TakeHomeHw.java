package TakeHomeExam;
//main driver class
import TakeHomeExam.CustomLinkedList;
import TakeHomeExam.CustomList;

public class TakeHomeHw {

	public static void main(String[] args) {
		CustomLinkedList list= new CustomLinkedList(2);
//		System.out.println(list.size());
		Node tmp = new Node(1,null);
		Node tmp2 = new Node(3,null);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.print();
		list.removeAt(5);
		list.print();
		list.removeAt(1);
		list.print();
		list.insertAfter(4, 2);
		list.print();
		list.removeAt(2);
		list.set(6, 12);
		list.print();
		list.add(2);
		list.add(1);
		list.add(5);
		list.print();
		list.clear();
//		System.out.println(list.get(2));
//		System.out.println(list.size());
		
		
	}

}
