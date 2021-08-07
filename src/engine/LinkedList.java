package engine;


import engine.sort.BubbleSort;
import engine.sort.QuickSort;
import engine.sort.QuickSortIterative;

public class LinkedList {
    private Node head;
    private int length;

    public LinkedList() {
        head = null;
    }

    public LinkedList(String fileName, int frequency) {
        head = new Node(fileName, frequency);
    }

    public LinkedList(Node firstNode) {
        append(firstNode);
    }

    public void append(Node[] nodes) {
        for(Node node : nodes) {
            append(node);
        }
    }

    public void append(String fileName, int frequency) {
        append(new Node(fileName, frequency));
    }

    public void append(Node node) {
        if (head == null) {
            head = node;
            length++;
            return;
        }

        Node aux = head;
        while(aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(node);
        length++;
    }

    public void addSorted(Node node) {
        append(node);

        //bubble sort
        //LinkedList[] nodes = getNodesAsArray();
        //BubbleSort.sortAsc(nodes);

    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Node[] getNodesAsArray() {
        Node[] nodes = new Node[length];
        int i = 0;
        Node first = head;
        while (first != null) {
            nodes[i] = first;
            first = first.getNext();
            i++;
        }
        return nodes;
    }

    public Node[] getSortedNodesAsc() {
        Node[] nodes = getNodesAsArray();
        QuickSort.sort(nodes);
        return nodes;
    }

    public Node[] getSortedNodesDesc() {
        Node[] nodes = getNodesAsArray();
        QuickSortIterative.sort(nodes);
        return nodes;
    }

    public Node getHead() {
        return head;
    }

    public int searchFrequency(String fileName) {
        Node node = getNode(fileName);
        if (node == null) {
            return 0;
        }
        return node.getFrequency();
    }

    public Node getNode(String fileName) {
        Node aux = head;
        while (aux != null) {
            if (aux.getFileName().equals(fileName)) {
                return aux;
            }
            aux = aux.getNext();
        }
        return null;
    }
}
