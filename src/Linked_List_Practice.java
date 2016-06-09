
public class Linked_List_Practice {

	public static void  ListSort(int lengthOfList, ListNode pointer) {
		
		int count = 1;
		ListNode swap = new ListNode();
		
		for (count = 1; count <= lengthOfList; count++) {
			if (pointer.data > pointer.next.data) {
				swap = pointer.next;
				pointer.next = swap.next;
				swap.next = pointer;
			} else {
				pointer = pointer.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
	int listLength = (int)(Math.random() * 25);
	int counter = 0;
	System.out.printf("The Linked list will have %d elements.\n", listLength);
	
	ListNode header = new ListNode();
	ListNode currentNode = header;
	ListNode review = header;
	for (int i = 1; i <= listLength; i++) {
		currentNode.next = new ListNode();
		System.out.printf("Node %d contains %3d\n", i, currentNode.data);
		currentNode = currentNode.next;
	}
		
	System.out.println("*** Verfification of linkage and data content ***");
	for (int j = 1; j <= listLength; j++) {
		System.out.printf("%d, ", review.data);
		counter++;
		review = review.next;
	}
	System.out.println("\nLinked List has " + counter + " nodes.");
	
	ListSort (listLength, header);
	
	System.out.println("*** Sorted List ***");
	review = header;
	for (int k = 1; k <= listLength; k++) {
		System.out.printf("%3d, ", review.data);
		review = review.next;
	}

	}

}
