
public class BinaryTreesMain {

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTrees bt = new BinaryTrees();
		Node root = bt.buildTree(nodes);
		// System.out.println(root.data);
		//Understood
		System.out.println("Pre Order Traversal");
		bt.preOrder(root);
		System.out.println("\nPost Order Traversal");
		bt.postOrder(root);
		System.out.println("\nIn Order Traversal");
		bt.inOrder(root);
		
		System.out.println("\nLevel Order Traversal");
		bt.levelOrderUsingQueue(root);
		//Not Understood how it counts in case of count and sum in case of sum without any change dy run call stack recursion
		System.out.print("\nNumber Of Nodes in a tree:");
		System.out.println(bt.countNumberOfNodes(root));
		System.out.print("\nSum Of Nodes in a tree:");
		System.out.println(bt.sumOfNodes(root));
		//Not Understood
		System.out.print("\nHeight Of Nodes in a tree:");
		System.out.println(bt.heightOfTree(root));
		System.out.print("\nCount Of Leaf Nodes in a tree:");
		System.out.println(bt.countNumberOfLeafNodes(root));
		
		/*System.out.println("\nRevere Level Order Traversal");
		bt.reverseLevelOrder(root);*/
		System.out.println("\nFind parent of Node 3");
		System.out.println("Parent of " + 3 + " is " + bt.findParent(root, 3, null).data);
		
		System.out.println("\nTransform Tree to Sum of Trees");
		bt.toSumTree(root);
		bt.inOrder(root);


	}

}
