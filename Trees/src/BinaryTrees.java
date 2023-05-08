
import java.util.*;

//-1 indicates null
public class BinaryTrees {

	int index = -1;
	int sum = 0;
    ArrayList arr = new ArrayList<Integer>();
	// Create Tree
	public Node buildTree(int[] nodes) {
		index++;
		// As root node itself is null
		if (nodes[index] == -1)
			return null;
		Node temp = new Node(nodes[index]);
		temp.left = buildTree(nodes);
		temp.right = buildTree(nodes);
		return temp;
	}

	// Root Left Right
	public void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		arr.add(root.data);
		preOrder(root.left);
		preOrder(root.right);

	}

	// left right Root
	public void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	// left root right
	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public void levelOrderUsingQueue(Node root) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node currNode = queue.remove();

			if (currNode == null) {
				System.out.println();
				// After removing currentNode queue is becoming empty
				if (queue.isEmpty())
					break;
				else
					queue.add(null);
			} else {
				System.out.print(currNode.data + " ");
				if (currNode.left != null)
					queue.add(currNode.left);
				if (currNode.right != null)
					queue.add(currNode.right);
			}

		}

	}

	public int countNumberOfNodes(Node root) {
		if (root == null)
			return 0;
		int leftNodes = countNumberOfNodes(root.left);
		int rightNodes = countNumberOfNodes(root.right);
		return leftNodes + rightNodes + 1;
	}

	public int sumOfNodes(Node root) {
		if (root == null)
			return 0;
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		return leftSum + rightSum + root.data;
	}

	public int heightOfTree(Node root) {
		if (root == null)
			return 0;
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
	}

	public int countNumberOfLeafNodes(Node root) {

		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		return countNumberOfLeafNodes(root.left) + countNumberOfLeafNodes(root.right);
	}

	//O(n)
	public void findParent(Node root,int val,int parent)
	{
		if(root == null)
			return;
		if(root.data == val)
			System.out.println("Parent of "+val+" is "+parent);
		else
		{
	        // Recursive calls for the children
	        // of the current node
	        // Current node is now the new parent
			findParent(root.left,val,root.data);
		    findParent(root.right,val,root.data);
		}
		
		
	}
	
	//Transform to Sum Tree
	int toSumTree(Node node)
    {
        // Base case
        if (node == null)
            return 0;
  
        // Store the old value
        int old_val = node.data;
  
        // Recursively call for left and right subtrees and store the sum
        // as new value of this node
        node.data = toSumTree(node.left) + toSumTree(node.right);
  
        // Return the sum of values of nodes in left and right subtrees
        // and old_value of this node
        return node.data + old_val;
    }
	/*
	 * public int sumOfNodes(Node root) {
	 * 
	 * if (root == null) return 0; sum += root.data; sumOfNodes(root.left);
	 * sumOfNodes(root.right);
	 * 
	 * return sum; }
	 */
}
