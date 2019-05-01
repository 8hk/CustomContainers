package TakeHomeExam;

public class LinkedListQueue <T> extends CustomLinkedList<T>{

	//constructor of LinkedListQueue
	public LinkedListQueue(int volume) {
		super(volume);
	}
	
	///inserts the given value in list
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
	
	//clear method should be override due to bug fix.
	@Override
	boolean clear() {
		int size = size();
		while(size>=0){
			dequeue();
			size--;
		}
		removeFirst();
		return true;
	}
	

}
