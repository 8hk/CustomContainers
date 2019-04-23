package HW2;

public class BinaryNode <T>{
	private BinaryNode left;
    private BinaryNode right;
    private T data;
    
    
    public BinaryNode(T data) {
        this.data = data;
    }
 
    public BinaryNode getLeft() {
        return left;
    }
    public void setLeft(BinaryNode left) {
        this.left = left;
    }
    public BinaryNode getRight() {
        return right;
    }
    public void setRight(BinaryNode right) {
        this.right = right;
    }
 
    public T getData() {
        return data;
    }
 
    public void setData(T data) {
        this.data = data;
    }
}
