import java.util.Scanner;

public class FindAndDeleteNthNodeFromLast {
	static Scanner sc = new Scanner(System.in);

	public void findAndDeleteFromLast(LL list) {
		System.out.println("Enter node postion from last");
		int n = sc.nextInt();
		Node node = list.head;
		int size = list.countNumberOfNodes();
		// (size-n+1) from start and n from last
		int nthNode = (size - n);
		System.out.println(nthNode);
		// if node is 0th Node
		if((size==1 && nthNode<=0))
		{
			System.out.println("List has only 1 element.Please enter correct position");
		}
		if (nthNode == 0) {
			list.head = list.head.next;
		} else {
			for (int i = 1; i < nthNode; i++) {
				node = node.next;
			}
			System.out.println("Node Data:" + node.data);
			node.next = node.next.next;
		}

	}

	public static void main(String[] args) {
		FindAndDeleteNthNodeFromLast fAndD = new FindAndDeleteNthNodeFromLast();
		LL list = new LL();
		Integer operationsNum = 0;

		while (operationsNum != 5) {
			if (operationsNum != 3)
				list.traverseList();
			System.out.println("1:Insert Node in the start" + "\n2.Insert Node at the end of list" + "\n3.Show List"
					+ "\n4.Find Nth Node and Delete from last" + "\n5.Exit");
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
			case 3:
				list.traverseList();
				break;
			case 4:
				fAndD.findAndDeleteFromLast(list);
				break;

			case 5:
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
