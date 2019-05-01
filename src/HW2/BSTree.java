package HW2;

import HW2.BinaryNode;

public class BSTree<T extends Comparable<T>>  {
	
	private BinaryNode <T> root;

	//check if tree is empty
	public boolean isEmpty() {

		return (this.root == null);
	}
	
	//root getter
	public BinaryNode <T> getRoot() {
		return this.root;
	}

	//high level method to insert given data into tree
	public void insert(T data) {

		System.out.print("{{input: " + data + "}}");
		if (root == null) {
			this.root = new BinaryNode(data);
			System.out.println(" -> inserted: " + data);
			return;
		}

		insertNode(this.root, data);
		System.out.print(" -> inserted: " + data);
		System.out.println();
	}

	//arranges the tree for being proper design  -- left side value lower than root
	private BinaryNode <T> insertNode(BinaryNode <T> root, T data) {

		BinaryNode <T> tmpNode = null;
		System.out.print(" -> " + root.getData());
		if (root.getData().compareTo(data) >=0) {
			System.out.print(" {L}");
			if (root.getLeft() == null) {
				root.setLeft(new BinaryNode <T>(data));
				return root.getLeft();
			} else {
				tmpNode = root.getLeft();
			}
		} else {
			System.out.print(" {R}");
			if (root.getRight() == null) {
				root.setRight(new BinaryNode <T>(data));
				return root.getRight();
			} else {
				tmpNode = root.getRight();
			}
		}

		return insertNode(tmpNode, data);
	}
	
	//high level method to delete node
	public void delete(T data) {

		deleteNode(this.root, data);
	}
	/*there are 3 important strange cases we should consider
	 * 1 ) deleting a node that has no children. just link the node to null and DONE
	 * 2 ) deleting a node that has 1 child. cut the line between node and 
	 * root & and make new connection between root and child
	 * 3 )  deleting a node that has 2 little children. find lowest value of right tree &
	 * replace its value with removing value, delete lowest value node from right tree
	 * */
	private BinaryNode <T> deleteNode(BinaryNode <T> root, T data) {

		if (root == null)
			return root;

		if (data.compareTo(root.getData()) < 0) {
			root.setLeft(deleteNode(root.getLeft(), data));
		} else if (root.getData().compareTo(data) < 0 ) {
			root.setRight(deleteNode(root.getRight(), data));
		} else {
			// node with no leaf nodes
			if (root.getLeft() == null && root.getRight() == null) {
				System.out.println("deleting " + data);
				return null;
			} else if (root.getLeft() == null) {
				// node with one node (no left node)
				System.out.println("deleting " + data);
				return root.getRight();
			} else if (root.getRight() == null) {
				// node with one node (no right node)
				System.out.println("deleting " + data);
				return root.getLeft();
			} else {
				// nodes with two nodes
				// search for min number in right sub tree
				T minValue = minValue(root.getRight());
				root.setData(minValue);
				root.setRight(deleteNode(root.getRight(), minValue));
				System.out.println("deleting " + data);
			}
		}

		return root;
	}
	//finds the min value of tree
	private T minValue(BinaryNode <T> node) {

		if (node.getLeft() != null) {
			return (T) minValue(node.getLeft());
		}
		return node.getData();
	}
	//high levvl method ordering traversal 
	public void inOrderTraversal() {
		doInOrder(this.root);
	}
	
	//ordering the tree properly
	private void doInOrder(BinaryNode <T> root) {

		if (root == null){
			//when it finishes print empty line
			System.out.println("");
			return;
		}
			
		doInOrder(root.getLeft());
		System.out.print(root.getData() + " ");
		doInOrder(root.getRight());
	}
	//removes the given value from tree by searching the value 
	public boolean remove(T value) {
		if (root == null)
			return false;
		else {
			if (root.getData() == value) {
				BinaryNode <T> pirateRoot = new BinaryNode ("");
				pirateRoot.setLeft(root);
				boolean result = root.remove(value, pirateRoot);
				root = pirateRoot.getLeft();
				return result;
			} else {
				return root.remove(value, null);
			}
		}
	}

}
