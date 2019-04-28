package HW2;

public class BinaryNode<T extends Comparable<T>>{
	private BinaryNode <T> left;
	private BinaryNode <T> right;
	private T data;

	public BinaryNode (T data) {
		this.data = data;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode <T> left) {
		this.left = left;
	}

	public BinaryNode <T> getRight() {
		return right;
	}

	public void setRight(BinaryNode <T> right) {
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

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
		} else {
			if (left != null && right != null) {
				this.data = right.minValue();
				right.remove(this.data, this);
			} else if (parent.left == this) {
				parent.left = (left != null) ? left : right;
			} else if (parent.right == this) {
				parent.right = (left != null) ? left : right;
			}
			return true;
		}
	}

	public T minValue() {
		if (left == null)
			return data;
		else
			return left.minValue();

	}
	
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
