/**
 * 
 */
package TakeHomeExam;

/**
 * @author sibumi
 *
 */
public class LinkedListStack <T> extends CustomLinkedList<T> {

	//constructor of LinkedListStack
	public LinkedListStack(int volume) {
		super(volume);
	}
	
	//insert new node to begining
	public void push(T val){
		add(val);
	}
	
	//deletes the first item of list and returns it
	public T pop(){
		T temp = get(0);
		removeFirst();
		return temp;
	}

}
