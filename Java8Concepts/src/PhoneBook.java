
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
	phonebook head = null, tail = null;

	class phonebook {
		String name;
		String email;
		String phNo;
		phonebook prev, next;

		phonebook(String name, String email, String phno) {
			this.name = name;
			this.email = email;
			this.phNo = phno;
		}
	}

	public void Insert() {
		String n, e, p;
		int check, corretphno = 0, checkmail = 0;
		Scanner sc = new Scanner(System.in);
		try {
			do {
				System.out.println("***Create Contact***");
				System.out.print("Enter the name : ");
				n = sc.nextLine();
				do {
					System.out.println("Enter the email : ");
					e = sc.nextLine();
					if (valid(e)) {
						checkmail++;
					} else {
						checkmail = 0;
						System.out.println("ERROR...Please enter valid email address");
					}
				} while (checkmail == 0);
				do {
					System.out.println("Enter the contact : ");
					p = sc.nextLine();
					if (isValidMobileNo(p)) {
						corretphno++;
					} else {
						corretphno = 0;
						System.out.println("ERROR...Please enter valid phone number");
					}
				} while (corretphno == 0);

				phonebook new_contact = new phonebook(n, e, p);
				if (head == null) {
					head = new_contact;
					tail = new_contact;
				} else {
					tail.next = new_contact;
					new_contact.prev = tail;
					tail = new_contact;
				}
				System.out.print("Press 1 to add contact otherwise press any key : ");
				check = Integer.parseInt(sc.nextLine());
			} while (check == 1);
		} catch (Exception E) {
			System.out.println(E);
		}
	}

	public void display() {
		System.out.println("***Contact Details***");
		if (head == null) {
			System.out.println("Phonebook is empty");
		} else {
			phonebook temp = head;
			System.out.println("Name\tPhone Number\tE-mail Address");
			while (temp != null) {
				System.out.println(temp.name + "\t" + temp.phNo + "\t" + temp.email);
				temp = temp.next;
			}
		}
	}

	public static boolean isValidMobileNo(String str) {
		Pattern ptrn = Pattern.compile("[0-9]{10}");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));
	}

	public static boolean valid(String mail) {
		String emailRegex = "^([a-z0-9].+)@([a-z].+)$";

		Pattern pat = Pattern.compile(emailRegex);

		boolean val = pat.matcher(mail).matches();
		return val;
	}

	public void searchName() {
		Scanner sc = new Scanner(System.in);
		int check = 0;
		try {
			do {
				System.out.println("enter the name to search:");
				String n = sc.nextLine();
				phonebook temp = head;
				int count = 0;
				while (temp != null) {
					if (temp.name.equals(n)) {
						count++;
						System.out.println("Name:" + temp.name);
						System.out.println("email:" + temp.email);
						System.out.println("phNo:" + temp.phNo);
					}
					temp = temp.next;
				}
				if (count == 0)
					System.out.println("Name doesn't found");
				System.out.print("Press 1 to continue search otherwise press any key : ");
				check = Integer.parseInt(sc.nextLine());
			} while (check == 1);
		} catch (Exception e1) {
		}
	}

	public void updateDetails() {

		if (head == null) {
			System.out.println("Phonebook is empty");
			return;
		}

		Scanner sc = new Scanner(System.in);
		int n;
		String ph = null;
		int correctphno = 0;
		try {
			phonebook temp = head;
			do {
				do {
					System.out.print("Enter the phone number to update : ");
					ph = sc.nextLine();
					if (isValidMobileNo(ph)) {
						correctphno++;
					} else {
						correctphno = 0;
						System.out.println("ERROR...Please enter valid phone number");
					}
				} while (correctphno == 0);

				while (temp != null) {
					if (temp.phNo.equals(ph)) {
						break;
					}
					temp = temp.next;
				}
				System.out.println(
						"Press 1 - To Update name :\nPress 2 - To Update phone number : \nPress 3 - To Update email : ");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					System.out.print("Enter Updated name : ");
					temp.name = sc.nextLine();
					break;
				case 2:
					System.out.print("Enter Updated phone number : ");
					temp.phNo = sc.nextLine();
					break;
				case 3:
					System.out.print("Enter Updated E-mail Id : ");
					temp.email = sc.nextLine();
					break;

				default:
					System.out.println("Please enter valid choice");

				}
				System.out.print("Press 1 to update any other Phonebook details, else press any key :");
				n = Integer.parseInt(sc.nextLine());
			} while (n == 1);
		}

		catch (Exception e1) {
			System.out.println(e1);
		}
	}

	public void deleteContact() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int count = 0;
		try {
			do {

				System.out.print("Enter the name to delete the contact : ");
				String c = sc.nextLine();
				phonebook temp = head;
				while (temp != null) {
					if (temp.name.equals(c)) {
						if (temp == head) {
							if (head.next == null) {
								head = null;
								break;
							} else {
								head = temp.next;
								head.prev = null;
							}
						} else if (temp == tail) {
							tail = temp.prev;
							temp.prev.next = null;
						} else {
							temp.next.prev = temp.prev;
							temp.prev.next = temp.next;
						}
						count++;
					}
					temp = temp.next;
				}
				if (count == 0)
					System.out.println("Name is not in the phonebook");
				else
					System.out.println("Deleted Successfully !!!");

				display();
				System.out.println();
				System.out.print("Press 1 - to delete the another contact details else press any key");
				n = Integer.parseInt(sc.nextLine());
			} while (n == 1);
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}

	public void dupName() {
		// Node current will point to head
		phonebook current, index;

		// Checks whether list is empty
		if (head == null) {
			return;
		} else {
			// Initially, current will point to head node
			for (current = head; current != null; current = current.next) {
				// index will point to node next to current
				for (index = current.next; index != null; index = index.next) {
					if (current.name.equals(index.name)) {

						// index's previous node will point to node next to index thus, removes the
						// duplicate node
						// changing its prev node next to the duplicate node next which points to next
						// node
						index.prev.next = index.next;
						if (index.next != null)
							index.next.prev = index.prev;

						else {
							tail = index.prev;
						}

					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		int loop = 0;
		boolean done = false;
		PhoneBook new_phonebook = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("****Welcome to the Phonebook****");
			System.out.println("1.To Insert the contact\n2.To Search the contact");
			System.out.println("3.To Update the contact details\n4.To Delete the contact\n5.duplication Name\n6.Exit");
			System.out.print("Enter your choice : ");
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				new_phonebook.Insert();
				new_phonebook.display();
				break;

			case 2:
				new_phonebook.searchName();
				break;

			case 3:
				new_phonebook.updateDetails();
				new_phonebook.display();
				break;

			case 4:
				new_phonebook.deleteContact();
				new_phonebook.display();
				System.out.println();
				break;

			case 5:
				new_phonebook.dupName();
				new_phonebook.display();
				System.out.println();
				break;

			case 6:
				System.out.println("Thank You for using Our phonebook");
				done = true;
				break;

			default:
				System.out.println("Select between 1 to 5");
			}
		} while (!done);
	}
}