package HW2;

import HW2.BinaryNode;

public class BSTree {
	private BinaryNode root;

	public boolean isEmpty() {

		return (this.root == null);
	}

	public BinaryNode getRoot() {
		return this.root;
	}

	public void insert(Integer data) {

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

	private BinaryNode insertNode(BinaryNode root, Integer data) {

		BinaryNode tmpNode = null;
		System.out.print(" ->" + root.getData());
		if (root.getData() >= data) {
			System.out.print(" [L]");
			if (root.getLeft() == null) {
				root.setLeft(new BinaryNode(data));
				return root.getLeft();
			} else {
				tmpNode = root.getLeft();
			}
		} else {
			System.out.print(" [R]");
			if (root.getRight() == null) {
				root.setRight(new BinaryNode(data));
				return root.getRight();
			} else {
				tmpNode = root.getRight();
			}
		}

		return insertNode(tmpNode, data);
	}

	public void delete(Integer data) {

		deleteNode(this.root, data);
	}

	private BinaryNode deleteNode(BinaryNode root, Integer data) {

		if (root == null)
			return root;

		if (data < root.getData()) {
			root.setLeft(deleteNode(root.getLeft(), data));
		} else if (data > root.getData()) {
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
				Integer minValue = minValue(root.getRight());
				root.setData(minValue);
				root.setRight(deleteNode(root.getRight(), minValue));
				System.out.println("deleting " + data);
			}
		}

		return root;
	}

	private Integer minValue(BinaryNode node) {

		if (node.getLeft() != null) {
			return minValue(node.getLeft());
		}
		return node.getData();
	}

	public void inOrderTraversal() {
		doInOrder(this.root);
	}

	private void doInOrder(BinaryNode root) {

		if (root == null)
			return;
		doInOrder(root.getLeft());
		System.out.print(root.getData() + " ");
		doInOrder(root.getRight());
	}

	public boolean remove(int value) {
		if (root == null)
			return false;
		else {
			if (root.getData() == value) {
				BinaryNode auxRoot = new BinaryNode(0);
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
