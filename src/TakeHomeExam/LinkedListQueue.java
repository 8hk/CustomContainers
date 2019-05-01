package TakeHomeExam;

public class LinkedListQueue <T> extends CustomLinkedList<T>{

	public LinkedListQueue(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}
	void enqueue(T val){
		insertAfter(0, val);
	}
	
	T dequeue(){
		int size = size();
		T temp = get(size);
		removeAt(size-1);
		return temp;
	}
	@Override
	boolean clear() {
		int size = size();
		while(size>=-0){
			dequeue();
			size--;
		}
		removeFirst();
		return true;
	}
	

}
