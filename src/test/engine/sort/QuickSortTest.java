package engine.sort;

import engine.LinkedList;
import engine.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sortRecursive() {
        LinkedList list = new LinkedList();
        Node c = new Node("C", 30);
        Node b = new Node("B", 20);
        Node e = new Node("E", 60);
        Node f = new Node("F", 100);
        Node d = new Node("D", 40);
        Node a = new Node("A", 10);
        list.append(c);
        list.append(b);
        list.append(e);
        list.append(f);
        list.append(d);
        list.append(a);
        Node[] nodes = list.getNodesAsArray();

        System.out.println(Arrays.toString(nodes));
        QuickSort.sort(nodes);

        System.out.println(Arrays.toString(nodes));
    }

    @Test
    void sortIterative() {
        LinkedList list = new LinkedList();
        Node c = new Node("C", 30);
        Node b = new Node("B", 20);
        Node e = new Node("E", 60);
        Node f = new Node("F", 100);
        Node d = new Node("D", 40);
        Node a = new Node("A", 10);
        list.append(c);
        list.append(b);
        list.append(e);
        list.append(f);
        list.append(d);
        list.append(a);
        Node[] nodes = list.getNodesAsArray();

        System.out.println(Arrays.toString(nodes));
        QuickSortIterative.sort(nodes);

        System.out.println(Arrays.toString(nodes));
    }
}