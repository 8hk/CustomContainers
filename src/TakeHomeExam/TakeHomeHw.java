package TakeHomeExam;
//main driver class
import TakeHomeExam.CustomLinkedList;
import HW2.*;
import TakeHomeExam.CustomList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import TakeHomeExam.*;
public class TakeHomeHw {

	public static void main(String[] args) {
		
		System.out.println("******** CustomLinkedList Integer ********");
		CustomLinkedList <Integer >list= new CustomLinkedList(0);
		System.out.println(list.size());
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
		list.print();
		log(list.get(2));
		log(list.size());
		
		
		
		log("******** CustomLinkedList String ********");
		CustomLinkedList <String > StringList= new CustomLinkedList(0);
		log("******** CustomLinkedList String ********");
		StringList.add("Mete Han");
		StringList.add("Attila");
		StringList.add("Istemi Yabgu");
		StringList.add("Gazneli Mahmud");
		StringList.set("Istemi Yabgu", "Alparslan");
		
		
		StringList.insertAfter(2, "Timur");
		log("3th index :"+StringList.get(3));
		StringList.print();
		StringList.removeFirst();
		StringList.print();
		StringList.clear();
		StringList.print();
		log(StringList.size());
		
		
		log("******** LinkedListStack String ********");
		LinkedListStack <String> StringStack = new LinkedListStack<String>(0);
		StringStack.push("FSM");
		StringStack.print();
		System.out.println(StringStack.pop());
		log(StringStack.size());
		StringStack.print();
		StringStack.push("YSS");
		StringStack.push("KSS");
		StringStack.push("Murad");
		StringStack.print();
		StringStack.clear();
		StringStack.print();
		
		log("******** LinkedListQueue String ********");
		LinkedListQueue <String> q = new LinkedListQueue<String>(0);
		q.enqueue("Timur");
		q.enqueue("Atatürk");
		q.print();
		log(q.size());
		q.dequeue();
		q.print();
		log("clear queue");
		q.clear();
		q.print();
		log(q.size());
		
		log("******** CustomArrayList ********");
		CustomArrayList<String> arrayl = new CustomArrayList<String>();
		arrayl.add("Osman");
		arrayl.add("Giray");
		arrayl.add("Balamir");
		arrayl.print();
		arrayl.insertAfter(2, "Kerem");
		arrayl.removeFirst();
		arrayl.print();
		log(arrayl.get(2));
		
		
		log("******** ArrayListStack ********");
		ArrayListStack<Integer> arrayStack = new ArrayListStack<Integer>();
		arrayStack.push(3);
		arrayStack.push(1);
		arrayStack.print();
		arrayStack.push(2);
		arrayStack.print();
		log("poped: "+arrayStack.pop());
		arrayStack.clear();
		arrayStack.print();
	
		log("******** ArrayListQueue ********");
		ArrayListQueue <String> arrayq = new ArrayListQueue<String>();
		arrayq.enqueue("Cihangir");
		arrayq.enqueue("Cengiz");
		arrayq.enqueue("Kaan");
		arrayq.print();
		System.out.println("dequeued: "+arrayq.dequeue());
		arrayq.clear();
		arrayq.print();
		
		
		log("******** BSTree <Integer> ********");
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.insert(10);
		tree.insert(1);
		tree.insert(8);
		tree.insert(9);
		tree.insert(7);
		tree.inOrderTraversal();
		tree.delete(8);
		tree.inOrderTraversal();
		
		log("******** BSTree <String> ********");
		BSTree<String> tree2 = new BSTree<String>();
		tree2.insert("Cihandar");
		tree2.insert("Humayun");
		tree2.insert("Cihan");
		tree2.insert("Bahadır");
		tree2.delete("Humayun");
		tree2.inOrderTraversal();
	}
	
	public static void log(Object str){
		if(str != null) System.out.println(str.toString());
		else System.out.println("Object is empty");
	}

}
