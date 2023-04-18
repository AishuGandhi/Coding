import java.util.Scanner;



class Node {

	Node next;
	int data = 0;

	public Node() {
		this.next = null;
		this.data = 0;
	}
}

public class LL {
	static Scanner sc = new Scanner(System.in);

	Node head;

	public Node createNode() {
		int val;
		System.out.print("Enter Data for Node:");
		val = sc.nextInt();
		Node newNode = new Node();
		newNode.data = val;
		return newNode;
	}

	public void traverseList() {
		Node tmp = this.head;
		if (head == null)
			System.out.println("List is empty");
		else {
			while (tmp != null) {
				System.out.print(tmp.data + "->");
				tmp = tmp.next;
			}
			System.out.print("NULL");
			System.out.println();
		}

	}

	public void addFirst() {
		Node newNode = createNode();
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast() {
		Node newNode = createNode();
		if (head == null)
			head = newNode;
		else {
			Node tmp = head;
			while (tmp.next != null) {

				tmp = tmp.next;
			}
			tmp.next = newNode;
		}
	}

	public void addAnywhere() {
		Node newNode = createNode();
		int pos;
		System.out.print("Enter Position for Node:");
		pos = sc.nextInt();
		if (head == null)
			head = newNode;
		else {
			Node tmp = head;
			for (int i = 0; i < pos - 1; i++) {
				if (tmp.next != null)
					tmp = tmp.next;
			}
			// Setting newNode next equal to tmp.next
			newNode.next = tmp.next;
			// Setting previous node next to current new node
			tmp.next = newNode;
		}
	}

	public int countNumberOfNodes() {
		int count = 0;
		Node tmp = this.head;
		if (head == null)
			System.out.println("List is empty");
		else {
			while (tmp != null) {
				count++;
				tmp = tmp.next;
			}

			System.out.println("Number of nodes in the list:" + count);
		}
		return count;
	}

	public void deleteFirst() {

		if (head == null)
			System.out.println("List is empty");
		// for single element
		else if (head.next == null) {
			System.out.println("Only one element in the list deleted:" + head.data);
			head = null;

		} else {
			head = head.next;

		}
	}

	public void deleteLast() {
		if (head == null)
			System.out.println("List is empty");
		// for single element
		else if (head.next == null) {
			System.out.println("Only one element in the list" + head.data);
			head = null;
		} else {
			Node tmp = head, prev = head;
			while (tmp.next != null) {
				prev = tmp;
				tmp = tmp.next;
			}
			prev.next = null;
		}
	}

	public void deleteAny() {
		if (head == null)
			System.out.println("Lis is empty");
		// for single element
		else if (head.next == null) {
			System.out.println("Only one element in the list" + head.data);
			head = null;
		} else {
			// int pos;
			// System.out.print("Enter data for the node:");
			// pos = sc.nextInt();
			// Node tmp = head, prev = head;
			// for (int i = 0; i < pos - 1; i++) {
			// prev = tmp;
			// tmp = tmp.next;
			// }
			int d;
			System.out.print("Enter data for the node:");
			d = sc.nextInt();
			int f = 0;
			Node tmp = head, prev = head;
			while (tmp != null) {
				if (d == tmp.data) {
					System.out.println("Data Found & Delete Success");
					prev.next = tmp.next;
					tmp.next = null;
					f = 1;
					break;
				} else {
					prev = tmp;
					tmp = tmp.next;
				}
			}
			if (f == 0)
				System.out.println("Data not found in list");

		}
	}

	public void replaceNodeData() {
		int d, replace;
		System.out.print("Enter data to be replace:");
		replace = sc.nextInt();
		System.out.print("Enter which node data to be replace:");
		d = sc.nextInt();
		int f = 0;
		Node tmp = head;
		while (tmp != null) {
			if (d == tmp.data) {
				System.out.println("Data Found & replaced Successfully");

				tmp.data = replace;
				f = 1;
				break;
			} else
				tmp = tmp.next;
		}
		if (f == 0)
			System.out.println("Data not found in list");

	}

	// Without using extra space time-complexity=o(n) & space-complexity=o(1)
	public Node reverseLinkedList(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		Node prev = head;
		Node curr = head.next;
		Node next = head.next;
		while (curr.next != null) {
			curr.next = prev;

			prev = curr;
			curr = next;
			next = next.next;
		}
		// setting initial node next to null
		head.next = null;
		// setting last node as head now
		head = curr;
		// setting last node pointer to previous node
		curr.next = prev;
		return head;
		// System.out.println("Reverse List Output:");
		// traverseList();

	}

	public Node reverseRecursive(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;

	}

	public static void main(String[] args) {

		LL list = new LL();
		Integer operationsNum = 0;

		while (operationsNum != 11) {
			if (operationsNum != 4)
				list.traverseList();
			System.out.println("1:Insert Node in the start" + "\n2.Insert Node at specific position"
					+ "\n3.Insert Node at the end of list" + "\n4.Show List" + ""
					+ "\n5.Delete First Node \n6.Delete Any Node" + "\n7.Delete Last Node "
					+ " \n8.Number of Nodes in the list" + "\n9.Replace Node Data\n10.Reverse a Linked List"
					+ "\n11.Exit and show final list");
			System.out.print("Enter your choice:");
			operationsNum = sc.nextInt();
			switch (operationsNum) {

			// Add Node at start of list
			case 1:
				list.addFirst();

				break;
			// Add Node anywhere in list
			case 2:
				list.addAnywhere();
				break;
			case 3:
				list.addLast();

				break;
			// Done with operations show list
			case 4:
				list.traverseList();
				break;
			// Delete from start of list
			case 5:
				list.deleteFirst();
				break;
			case 6:
				list.deleteAny();
				break;
			case 7:
				list.deleteLast();
				break;
			case 8:
				list.countNumberOfNodes();
				break;
			case 9:
				list.replaceNodeData();
				break;
			// Done with operations show list
			case 10:
				list.head = list.reverseRecursive(list.head);
				break;
			// Done with operations show list
			case 11:
				System.out.println("You are exited");
				System.exit(0);
				break;
			// Please enter correct choice
			default:
				System.out.println("Please Enter correct choice...");

			}
		}

	}

}
