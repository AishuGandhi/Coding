import java.util.Scanner;

//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). 
//Search for the number 7 & display its index.

public class LLProblem1 {
	static Scanner sc = new Scanner(System.in);

	public void getIndexOfNum(LL list) {
		System.out.println("Enter number from list to search index");
		Integer num = sc.nextInt();
		int index = 1;
		int f = 0;
		Node tmp = list.head;
		while (tmp != null) {
			if (num == tmp.data) {
				f = 1;
				System.out.println("Data fount at index:" + (index));
				break;
			}
			index++;
			tmp = tmp.next;
		}
		if (f == 0)
			System.out.println("Data not found");
	}

	public static void main(String[] args) {
		LLProblem1 getIndex = new LLProblem1();
		LL list = new LL();
		Integer operationsNum = 0;

		while (operationsNum != 6) {
			if (operationsNum != 4)
				list.traverseList();
			System.out.println("1:Insert Node in the start" + "\n2.Insert Node at specific position"
					+ "\n3.Insert Node at the end of list" + "\n4.Show List" + "\n5.Display Index of any number");
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
				getIndex.getIndexOfNum(list);
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
