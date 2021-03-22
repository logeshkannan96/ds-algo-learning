package linkedList.singlyLinkedList;

public class SinglyLinkedListDriverMethod {

	public static void main(String[] args) {
		
		Employee johnDoe = new Employee(1, "John", "Doe");
		Employee billGates = new Employee(2, "Bill", "Gates");
		Employee markZucker = new Employee(3, "Mark", "ZuckerBurg");
		Employee steveJobs = new Employee(4, "Steve", "Jobs");
		
		EmployeeLinkedList empList = new EmployeeLinkedList();
		empList.push(johnDoe);
		empList.push(billGates);
		empList.push(markZucker);
		empList.push(steveJobs);
		
		empList.printList();
		
		System.out.println("Removed Node -->" + empList.removeFromFront());
		
		System.out.println("After Removed");
		empList.printList();
	}
}
