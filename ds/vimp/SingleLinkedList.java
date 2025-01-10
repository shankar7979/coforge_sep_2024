package datastructure;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

public class SingleLinkedList {
    Node start;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = start;
        start = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        System.out.println("---------- display -------------");
        Node current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
[1/1, 8:58 PM] Subodh: Add with sorted - 
    public void addSorted(int data) {
        Node newNode = new Node(data);
        if (start == null || start.data >= newNode.data) {
            newNode.next = start;
            start = newNode;
        } else {
            Node current = start;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
// Merge existing linked list -

   // Method to sort the linked list using merge sort
    public void sort() {
        start = mergeSort(start);
    }

    // Helper method to perform merge sort
    private Node mergeSort(Node head) {
        // Base case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }
        // Split the list into two halves
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        // Recursively sort the two halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);
        // Merge the sorted halves
        return sortedMerge(left, right);
    }

    // Helper method to merge two sorted lists
    private Node sortedMerge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        Node result;
        if (left.data <= right.data) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    // Helper method to get the middle of the list
    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        // add first
       list.addFirst(1);
       list.addFirst(2);
       list.addFirst(3);
        list.display();

        // add at the last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
    }
}
