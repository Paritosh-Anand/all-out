package tree;

public class BTree {

	Node root;
	
	public void addNode(int key, String name) {
		
		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root; // Set root as the Node we will start with as we traverse the tree
			Node parent; // Future parent for our new Node
			
			while (true) {
				parent = focusNode; // root is the top parent so we start there
				if (key < focusNode.key) { // Check if the new node should go on the left side of the parent node
					focusNode = focusNode.leftChild; // Switch focus to the left child
					if (focusNode == null) { // If the left child has no children then place the new node on the left of it.
						parent.leftChild = newNode;
						return;
					}
				} else { // If we get here put the node on the right
					focusNode = focusNode.rightChild;
					if (focusNode == null) { // If the right child has no children then place the new node on the right of it
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree bTree = new BTree();

		bTree.addNode(50, "Boss");
		bTree.addNode(25, "Vice President");
		bTree.addNode(15, "Office Manager");
		bTree.addNode(30, "Secretary");
		bTree.addNode(75, "Sales Manager");
		bTree.addNode(85, "Salesman 1");
	}

}

class Node {

	int key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(int key, String name) {

		this.key = key;
		this.name = name;

	}

	public String toString() {
		/*
		 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
		 * "\nRight Child: " + rightChild + "\n";
		 */
		return name + " has the key " + key;
	}

}
