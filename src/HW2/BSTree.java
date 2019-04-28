package HW2;

import HW2.BinaryNode;

public class BSTree<T extends Comparable<T>>  {
	private BinaryNode <T> root;

	public boolean isEmpty() {

		return (this.root == null);
	}

	public BinaryNode <T> getRoot() {
		return this.root;
	}

	public void insert(T data) {

		System.out.print("[input: " + data + "]");
		if (root == null) {
			this.root = new BinaryNode(data);
			System.out.println(" -> inserted: " + data);
			return;
		}

		insertNode(this.root, data);
		System.out.print(" -> inserted: " + data);
		System.out.println();
	}

	private BinaryNode <T> insertNode(BinaryNode <T> root, T data) {

		BinaryNode <T> tmpNode = null;
		System.out.print(" ->" + root.getData());
		if (root.getData().compareTo(data) >=0) {
			System.out.print(" [L]");
			if (root.getLeft() == null) {
				root.setLeft(new BinaryNode <T>(data));
				return root.getLeft();
			} else {
				tmpNode = root.getLeft();
			}
		} else {
			System.out.print(" [R]");
			if (root.getRight() == null) {
				root.setRight(new BinaryNode <T>(data));
				return root.getRight();
			} else {
				tmpNode = root.getRight();
			}
		}

		return insertNode(tmpNode, data);
	}

	public void delete(T data) {

		deleteNode(this.root, data);
	}

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

	private T minValue(BinaryNode <T> node) {

		if (node.getLeft() != null) {
			return (T) minValue(node.getLeft());
		}
		return node.getData();
	}

	public void inOrderTraversal() {
		doInOrder(this.root);
	}

	private void doInOrder(BinaryNode <T> root) {

		if (root == null){
			System.out.println("");
			return;
		}
			
		doInOrder(root.getLeft());
		System.out.print(root.getData() + " ");
		doInOrder(root.getRight());
	}

	public boolean remove(T value) {
		if (root == null)
			return false;
		else {
			if (root.getData() == value) {
				BinaryNode <T> auxRoot = new BinaryNode ("");
				auxRoot.setLeft(root);
				boolean result = root.remove(value, auxRoot);
				root = auxRoot.getLeft();
				return result;
			} else {
				return root.remove(value, null);
			}
		}
	}

}
