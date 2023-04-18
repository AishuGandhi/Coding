import java.util.Scanner;

class NodeLoop {

	Node next;
	int data = 0;


}
public class IsListPalindromeAndHasCycle {
	static Scanner sc = new Scanner(System.in);
	Node head;
	/*public NodeLoop createNode() {
		int val;
		System.out.print("Enter Data for Node:");
		val = sc.nextInt();
		NodeLoop newNode = new NodeLoop();
		newNode.data = val;
		System.out.print("Enter Next for Node:");
		Node next = sc.next();
		newNode.next = next;
		return newNode;
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
	public boolean hasCycle(LL list)
	{
		Node  hare = list.head;
		Node turtle = list.head;
		while(hare.next.next!=null)
		{
			if(turtle == hare)
				return true;
			hare = hare.next.next;
			turtle = turtle.next;
		}
		
		return false;
	}*/
	public boolean isPalindrome(LL list) {
		
		if (list.head ==null|| list.head.next == null) {
           return false;
		}
		Node firstHalfHead = list.head;
		Node middle = findMiddle(list.head);
		Node secondHalfHead = list.reverseLinkedList(middle.next);
		// Compare 2 halves of list
		while (secondHalfHead != null) {
			if (secondHalfHead.data != firstHalfHead.data) {
				System.out.println("List is not palindrome");
				return false;
			}
			firstHalfHead = firstHalfHead.next;
			secondHalfHead = secondHalfHead.next;
		}
		return true;

	}

	

	public Node findMiddle(Node head)
	{
	     Node turtle = head;
	     Node hare = head;
	     while(hare.next!=null && hare.next.next!=null) {
	    	 hare = hare.next.next;
	    	 turtle = turtle.next;
	     }
	     //Head of new Node
	     return turtle;
	}
	
	public static void main(String[] args) {
		IsListPalindromeAndHasCycle palindrome = new IsListPalindromeAndHasCycle();
		LL list = new LL();
		Integer operationsNum = 0;

		while (operationsNum != 6) {
			if (operationsNum != 4)
				list.traverseList();
			System.out.println("1:Insert Node in the start" + "\n2.Insert Node at the end of list" + "\n3.Show List"
					+ "\n5.Is List Palindrome?");
			System.out.print("Enter your choice:");
			operationsNum = sc.nextInt();
			switch (operationsNum) {
			// Add Node at start of list
			case 1:
				list.addFirst();
				break;
			// Add Node anywhere in list
			case 2:
				list.addLast();
				break;
			// Done with operations show list
			case 4:
				list.traverseList();
				break;
			case 5:
				boolean res = palindrome.isPalindrome(list);
				if(res)
					System.out.println("List is palindrome");
				else
					System.out.println("List is not palindrome");
				break;
			case 6:
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
