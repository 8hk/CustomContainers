package HW2;

public class BinaryNode{
	private BinaryNode left;
	private BinaryNode right;
	private Integer data;

	public BinaryNode(Integer data) {
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

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public boolean remove(int value, BinaryNode parent) {

		if (value < this.data) {
			if (left != null)
				return left.remove(value, this);
			else
				return false;
		} else if (value > this.data) {
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

	public int minValue() {
		if (left == null)
			return data;
		else
			return left.minValue();

	}

}
