package linkedList.singlyLinkedList;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size;
	
	public void push(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);
		employeeNode.setNext(head);
		head = employeeNode;
		size++;
	}
	
	public void printList() {
		EmployeeNode empNode = head;
		while(empNode != null) {
			System.out.println(empNode.getEmployee());
			empNode = empNode.getNext();
		}
	}
	
	public EmployeeNode removeFromFront() {
		if(head == null) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = removedNode.getNext();
		size--;
		return removedNode;
	}
	
}
