
public class LList {
	Node head;
	
	//Append Node at the beginning of a Linked List
	public void push(int value) {
		
		Node newNode = new Node(value); //Creates a node with the value
		
		//if the head is null then make the value the new head
		if(this.head == null) {
			this.head = newNode; 	
		}else {
			newNode.next = this.head;
			this.head = newNode;
		}	
		
		System.out.println("value " + value + " added");
		return;
	}
	
	//appends value at the end of a linked List
	void append(int val) {
		
		Node newNode = new Node(val);
		newNode.next = null;
		Node tempNode = this.head;
		
		
		if(this.head == null) {
			this.head = newNode;
			return;
		}else {
		
		//loops while the node is not null
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		
		tempNode.next = newNode;
		return;
		
		}
	}
	
	public void insertAtIndex(int num , int val)
	{
		Node search = head;
		
 	 	//Let the temporary array iterate through the Linked List
		for(int i = 0; i < num -1; i++)
 	 	{
			search = search.next;	
 	 	}
 	 			
		//Temp node that stores the value at the index
		Node temp = search.next;
		
		//Creates a new Node
		Node newNode = new Node(val);
		
		search.next = newNode;
		newNode.next = temp;
		
	}
	
	//Implamenting the delete functionality of a linked lsit
	public void delete(int value) {
		
		Node current = head;
		Node prev = null;
		
		//Check if the head is null. If it is then return
		if(current == null) 
			return;	
		//Check if the value is in it 
		while(current != null && current.value != value ) {
			prev = current;
			current = current.next;
		}
		//if item doesnt exist in the linked list
		if(prev.value != value) {
			System.out.println("The item does not exist");
			return;
		}
		//Skip the current node and get the reference to the next node
		prev.next = current.next;
		
	}
	
	//insert after a node
	public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        
        Node newNode = new Node(new_data);
        Node temp = prev_node.next;
        prev_node.next = newNode;
        newNode.next = temp;
        return;
    
    }
	
	//Prints all items from the linked list
	void printAll() {	
		Node tempNode = this.head;
		while(tempNode != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
		}
	}
	//Inner class because this doesn't exist without the Linked List. Takes a node as a constructor
	static class Node{
		int value;
		Node next;
		//This is the constructor of the node, it takes an interger
		Node(int a){
			this.value = a;
		}
			
	}
	public static void main (String[] args) {	
		
		//Testing the insert after linked list method
		LList list = new LList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.insertAtIndex(3, 10);
		list.delete(5);
		
		
	}
	
}
