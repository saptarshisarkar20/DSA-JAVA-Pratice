package CodingNinjas;


public class PrintReversedLinkedList {
    private static void printRecur(Node<Integer> root) {
        if (root.next != null) {
            printRecur(root.next);
        }
        System.out.println(root.data);
    }

    public static void printReverse(Node<Integer> root) {
        //Your code goes here
        printRecur(root);
    }

    /*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;

    	public Node(T data) {
        	this.data = data;
    	}
	}

*/
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}