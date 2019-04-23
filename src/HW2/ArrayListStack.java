package HW2;

import TakeHomeExam.*;
public class ArrayListStack <T> extends CustomArrayList<T>{
	public ArrayListStack(){
		super();
	}
	
	public void push(T val){
		insertAfter(0, val);
		
	}
	public T pop(){
		T temp = get(0);
		removeFirst();
		return temp;
	}
	
	

}
