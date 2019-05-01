package HW2;
import TakeHomeExam.*;
public class ArrayListQueue <T> extends CustomArrayList<T>{
	
	//constructor of ArrayListQueue
	public ArrayListQueue(){
		super();
	}
	
	//inserts the given value in list
	public void enqueue(T val){
		insertAfter(0, val);
	}
	
	//deletes the last item of array and returns it
	public T dequeue(){
		int size = size();
		T temp = get(size);
		removeAt(size-1);
		return temp;
	}

}
