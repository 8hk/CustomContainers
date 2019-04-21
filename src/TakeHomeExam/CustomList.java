package TakeHomeExam;

import java.util.List;
import TakeHomeExam.*;
public abstract class CustomList {
	
	//hold the data
	List data;
	
	
	//holds the size of list
	int volume;
	
	//constructor of list
	CustomList(){
		log("Custom List created");
	}
	
	//returns size of list
	abstract int size();  
	
	
	//sets the value of target index
	abstract void set(int target, int value);
	
	//gets the value of index
	abstract int get(int index);
	
	//inserts the value into list
	abstract void add (int val);
	
	//clears the whole list
	abstract boolean clear();
	
	//prints the whole list
	abstract void print();
	
	
	//shorcut call for System.out.println
	void log(Object str){
		System.out.println(str.toString());
	}

}
