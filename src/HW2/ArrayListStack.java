package HW2;

import TakeHomeExam.*;
public class ArrayListStack <T> extends CustomArrayList<T>{
	
	//constructor of ArrayListStack
	public ArrayListStack(){
		super();
	}
	//insert new node to begining
	public void push(T val){
		insertAfter(0, val);
		
	}
	
	//deletes the first item of list and returns it
	public T pop(){
		T temp = get(0);
		removeFirst();
		return temp;
	}
	
	

}
