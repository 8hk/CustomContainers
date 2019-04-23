package TakeHomeExam;

public class CustomArrayList<T> extends CustomList<T> {
	private Object data[];

	private int index;

	private int size;
	
	public static final int VOLUME = 1;
	
	
	public CustomArrayList(){
		this.data=new Object[VOLUME];
		this.size=VOLUME;
	}
	
	

	@Override
	int size() {
		return size;
	}


	@Override
	void set(T target, T value) {
		data[(int) target] = value;
		
	}


	@Override
	T get(int index) {
		return (T) data[index];
	}


	@Override
	void add(T val) {
		if(this.index==this.size-1){
			increaseSize();
		}
		data[this.index]=val;
		this.index++;
		
	}


	@Override
	boolean clear() {
		for (int i =0;i <size-1;i++){
			if(data[i] != null){
				data[i] = null;
			}
			index = 0;
		}
		return true;
	}


	@Override
	void print() {
		for (int i =0;i<size-1;i++){
			System.out.println((data[i]).toString());
		}
	}
	
	
	
void removeAt(int target){
	CustomArrayList temp = new CustomArrayList();
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
 *TODOS 
void copyObj(CustomArrayList target){
	Object tmp[] = new Object[index];
	int j = 0;
	for (int i = 0; i < size-1; i++) {
		target.
		target.data[i]=  data[i];
		// else{
		// j--;
		// }
		// j++;
	}
//	this.data = tmp;
//	this.index--;
//	this.size--;
		
}

*/



	
void insertAfter(int target, T value) {
	CustomArrayList temp = new CustomArrayList();
	int j = 0;
	for (int i = 0; i < size; i++) {
		if (i != target) {
			temp.increaseSize();
			temp.data[j] = data[i];
			j++;
		}
		else{
			temp.increaseSize();
			temp.data[j]=value;
			temp.increaseSize();
			j++;
			temp.data[j] = data[i];
			j++;
		}
	}
	this.data = temp.data;
	this.index=temp.index;
	this.size++;
}
	
	
	
void removeFirst() {
	removeAt(0);
}
	
private void increaseSize() {
	this.size = this.size + VOLUME;
	Object newData[] = new Object[this.size];
	for (int i = 0; i < data.length; i++) {
		newData[i] = data[i];
	}
	this.data = newData;
}
	
	
	

}
