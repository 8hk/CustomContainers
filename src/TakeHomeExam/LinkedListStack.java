/**
 * 
 */
package TakeHomeExam;

/**
 * @author sibumi
 *
 */
public class LinkedListStack <T> extends CustomLinkedList<T> {

	public LinkedListStack(int volume) {
		super(volume);
	}
	
	
	void push(T val){
		add(val);
	}
	
	T pop(){
		T temp = get(0);
		removeFirst();
		return temp;
	}

}
