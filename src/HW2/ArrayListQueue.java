package HW2;
import TakeHomeExam.*;
public class ArrayListQueue <T> extends CustomArrayList<T>{
	public ArrayListQueue(){
		super();
	}
	public void enqueue(T val){
		insertAfter(0, val);
	}
	
	public T dequeue(){
		int size = size();
		T temp = get(size);
		removeAt(size-1);
		return temp;
	}

}
