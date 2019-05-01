package HW2;

public class BinaryNode<T extends Comparable<T>>{
	
	private BinaryNode <T> left;
	
	private BinaryNode <T> right;
	private T data;

	//constructor of Binary Node
	public BinaryNode (T data) {
		this.data = data;
	}

	//get left child
	public BinaryNode getLeft() {
		return left;
	}

	//set left child
	public void setLeft(BinaryNode <T> left) {
		this.left = left;
	}

	//get right child
	public BinaryNode <T> getRight() {
		return right;
	}

	//set right child
	public void setRight(BinaryNode <T> right) {
		this.right = right;
	}

	//get data of node
	public T getData() {
		return data;
	}

	//set the value of node
	public void setData(T data) {
		this.data = data;
	}

	/*there are 3 important strange cases we should consider
	 * 1 ) deleting a node that has no children. just link the node to null and DONE
	 * 2 ) deleting a node that has 1 child. cut the line between node and 
	 * root & and make new connection between root and child
	 * 3 )  deleting a node that has 12 little children. find lowest value of right tree and assign it as root
	 * and make swap operation until tree has proper allign
	 * */
	public boolean remove(T value, BinaryNode <T> parent) {

		if (this.data.compareTo(value)< 0) {
			if (left != null)
				return left.remove(value, this);
			else
				return false;
		} else if (this.data.compareTo(value)< 0) {
			if (right != null)
				return right.remove(value, this);
			else
				return false;
		} 
		else {
			if (left != null && right != null) {
				this.data = right.minValue();
				right.remove(this.data, this);
			} 
			else if (parent.left == this) {
				parent.left = (left != null) ? left : right;
			} 
			else if (parent.right == this) {
				parent.right = (left != null) ? left : right;
			}
			return true;
		}
	}

	//find min value of node
	public T minValue() {
		if (left == null)
			return data;
		else
			return left.minValue();

	}
	
	
	//compares the value regarding its type
	public int compareTo(Object o) {
	    if(!(o instanceof BinaryNode )) throw new IllegalArgumentException();
	    String n1 = ((String) this.data).toLowerCase();
	    String n2 = ((String) ((BinaryNode) o).data).toLowerCase();
	    for(int i = 0; i< n1.length() && i< n2.length() ; i++ ){
	        if(n1.charAt(i) > n2.charAt(i)) return 1;
	        if(n2.charAt(i) > n1.charAt(i)) return -1;
	    }
	    if(n1.length() > n2.length()) return -1;
	    if(n2.length() > n1.length()) return 1;

	    return 0;
	}

}
