public class LL {
    // Inner class Node to represent nodes in the linked list
    private class Node {
        private int value;  // Value stored in the node
        private Node next;  // Reference to the next node

        // Constructor to initialize a node with a value
        public Node(int _value) {
            value = _value;
        }

        // Constructor to initialize a node with a value and a next node reference
        public Node(int _value, Node _next) {
            value = _value;
            next = _next;
        }
    }

    private Node head;  // Reference to the first node in the linked list
    private Node tail;  // Reference to the last node in the linked list
    private int size;   // Size of the linked list

    // Constructor to initialize an empty linked list
    public LL() {
        size = 0;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertFirst(int val) {
        Node node = new Node(val);  // Create a new node with the given value
        node.next = head;  // Set the next reference of the new node to the current head
        head = node;  // Update the head to point to the new node

        if (tail == null) {
            tail = head;  // If the list was empty, update the tail to point to the new node
        }
        size++;  // Increment the size of the linked list
    }

    // Method to insert a node at the end of the linked list
    public void insertLast(int val) {
        Node node = new Node(val);  // Create a new node with the given value
        if (tail == null) {
            head = node;  // If the list was empty, set both head and tail to the new node
            tail = node;
        } else {
            tail.next = node;  // Set the next reference of the current tail to the new node
            tail = node;  // Update the tail to point to the new node
        }
        size++;  // Increment the size of the linked list
    }

    // Method to insert a node at a specific index in the linked list
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);  // If index is 0, insert at the beginning of the list
            return;
        }
        if (index == size) {
            insertLast(value);  // If index is equal to size, insert at the end of the list
            return;
        }

        Node temp = head;

        // Traverse the list to find the node just before the index
        for (int i = 1; i < index; i++) {
            temp = temp.next;  // Move to the next node
        }

        Node node = new Node(value);  // Create a new node with the given value
        node.next = temp.next;  // Set the next reference of the new node to the next node of temp
        temp.next = node;  // Set the next reference of temp to the new node

        size++;  // Increment the size of the linked list
    }
    
    // Method to get the node at a specific index in the linked list
    public Node get(int index) {
        Node temp = head;  // Start from the head of the list

        // Traverse to the desired index
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;  // Return the node at the specified index
    }

    // Method to find the index of the first occurrence of a value in the linked list
    public int find(int value) {
        Node temp = head;  // Start from the head of the list
        int index = 0;     // Initialize index counter

        // Traverse the list until the value is found or end of list is reached
        while (temp != null) {
            if (value == temp.value) {
                return index;  // Return the index if value is found
            }
            index++;           // Increment index
            temp = temp.next;  // Move to the next node
        }
        return -1;  // Return -1 if value is not found in the list
    }

    // Method to get the value at a specific index in the linked list
    public int getValue(int index) {
        Node temp = head;  // Start from the head of the list

        // Traverse to the desired index
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;  // Return the value of the node at the specified index
    }

    // Method to delete the node at a specific index in the linked list
    public void delete(int index) {
        // Throw an exception if index is out of bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Delete the node at the beginning of the list
        if (index == 0) {
            head = head.next;  // Move head to the next node
            // Update tail if the list becomes empty
            if (head == null) {
                tail = null;
            }
        } else {
            Node temp = head;  // Start from the head of the list

            // Traverse to the node just before the node to be deleted
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;  // Skip the node to be deleted
            // Update tail if the last node is deleted
            if (index == size - 1) {
                tail = temp;
            }
        }
        size--;  // Decrement the size of the list
    }

    // public int deleteFirst(){

    // }

    // Method to display the elements of the linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " => ");  // Print the value of the current node
            temp = temp.next;  // Move to the next node
        }
        System.out.println("End");  // Print "End" to mark the end of the linked list
    }
}
