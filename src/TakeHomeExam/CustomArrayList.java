package TakeHomeExam;

public class CustomArrayList<T> extends CustomList<T> {
	protected Object data[];

	protected int index;

	protected int size;

	protected static final int VOLUME = 1;
	//constructor of CustomLinkedList
	public CustomArrayList() {
		this.data = new Object[VOLUME];
		this.size = VOLUME;
	}
	//returns current size of arraylist
	@Override
	protected int size() {
		return size;
	}
	//changes the targeted value by given value in the list
	@Override
	void set(T target, T value) {
		data[(int) target] = value;

	}
	// get the value of index by iterating until desired index
	@Override
	protected T get(int index) {
		return (T) data[index];
	}
	//insert new node at beginning
	@Override
	protected void add(T val) {
		if (this.index == this.size - 1) {
			increaseSize();
		}
		data[this.index] = val;
		this.index++;

	}
	//clears whole list
	@Override
	protected boolean clear() {
		for (int i = 0; i < size - 1; i++) {
			if (data[i] != null) {
				data[i] = null;
			}
			index = 0;
		}
		return true;
	}
	//prints the whole list index by index
	@Override
	protected void print() {
		for (int i = 0; i < size - 1; i++) {
			if(data[i] != null) System.out.println((data[i]).toString());
			else System.out.println("list is empty please fill it with proper data");
		}
	}
	//removes the value at targeted index
	@Override
	protected void removeAt(int target) {
		CustomArrayList <T>temp = new CustomArrayList<T>();
		int j = 0;
		for (int i = 0; i < size; i++) {
			if (i != target) {
				temp.increaseSize();
				temp.data[j] = data[i];
				j++;
			}
		}
		this.data = temp.data;
		this.index--;
		this.size--;

	}
	/*
	 * TODOS void copyObj(CustomArrayList target){ Object tmp[] = new
	 * Object[index]; int j = 0; for (int i = 0; i < size-1; i++) { target.
	 * target.data[i]= data[i]; // else{ // j--; // } // j++; } // this.data =
	 * tmp; // this.index--; // this.size--;
	 * 
	 * }
	 * 
	 */
	
	//insert the value at desired target
	@Override
	protected void insertAfter(int target, T value) {
		CustomArrayList temp = new CustomArrayList();
		int j = 0;
		for (int i = 0; i < size; i++) {
			if (i != target) {
				temp.increaseSize();
				temp.data[j] = data[i];
				j++;
			} else {
				temp.increaseSize();
				temp.data[j] = value;
				temp.increaseSize();
				j++;
				temp.data[j] = data[i];
				j++;
			}
		}
		this.data = temp.data;
		this.index = temp.index;
		this.size++;
	}
	//removes the head
	@Override
	protected void removeFirst() {
		removeAt(0);
	}

	protected void increaseSize() {
		this.size = this.size + VOLUME;
		Object newData[] = new Object[this.size];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
	}

}
