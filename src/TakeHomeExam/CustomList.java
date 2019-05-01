package TakeHomeExam;

import java.util.List;
import TakeHomeExam.*;
public abstract class CustomList <T> {
	
	//hold the data
	protected List data;
	
	
	//holds the size of list
	protected int volume;
	
	//constructor of list
	public CustomList(){
		log("Custom List created");
	}
	
	//returns size of list
	abstract int size();  
	
	
	//sets the value of target index
	abstract void set(T target, T value);
	
	//gets the value of index
	abstract T get(int index);
	
	//inserts the value into list
	abstract void add (T val);
	
	//clears the whole list
	abstract boolean clear();
	
	//prints the whole list
	abstract void print();
	
	//inserts the value at target index
	abstract void insertAfter(int target, T value);
	
	//remove the value at target index
	abstract void removeAt(int target);
	
	//removes first value 
	abstract void removeFirst();
	
	//shorcut call for System.out.println
	public void log(Object str){
		if(str != null) System.out.println(str.toString());
		else System.out.println("Object is empty");
	}



}
