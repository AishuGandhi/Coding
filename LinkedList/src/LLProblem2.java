import java.util.Scanner;

//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
//Delete all nodes which have values greater than 25.

public class LLProblem2 {
	static Scanner sc = new Scanner(System.in);

	public void deleteAllNumberTillGivenNumber(LL list) {

		System.out.println("Enter number:");
		Integer num = sc.nextInt();
		int f = 0;
		Node tmp = list.head;
		if(list.head ==null)
		{
			System.out.println("No data to delete.List is empty");
		}
		while (tmp != null && f!=1) {
			if (num == tmp.data) {
				f = 1;
				System.out.println("Data found Successfully!!!");
				// Delete all nodes greater than found Node
				Node curr = list.head.next,
						prev=list.head;
				while (prev != null && curr != null) {
					if (prev == list.head && num < prev.data) {
						//list.head.next = null;
						list.head = prev.next;
					}
					// if not head then
					else if (num < curr.data) {
						// set previous node to next of current node
						prev.next = curr.next;
					}
					prev = prev.next;
					curr = curr.next;
				}
			}
			tmp = tmp.next;
		}
		if (f == 0)
			System.out.println("Data not found");
	}

	public static void main(String[] args) {
		LLProblem2 delete = new LLProblem2();
		LL list = new LL();
		Integer operationsNum = 0;

		while (operationsNum != 6) {
			if (operationsNum != 4)
				list.traverseList();
			System.out.println("1:Insert Node in the start" + "\n2.Insert Node at specific position"
					+ "\n3.Insert Node at the end of list" + "\n4.Show List" + "\n5.Delete Nodes greater than given number");
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
			case 5:
				delete.deleteAllNumberTillGivenNumber(list);
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
