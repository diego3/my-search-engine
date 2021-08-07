package engine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    @DisplayName("Testing insertion and size properties")
    void testingBasicOperations() {
        LinkedList list = new LinkedList();
        list.append(new Node("File1.txt", 1));
        list.append(new Node("File10.txt", 10));
        list.append(new Node("File5.txt", 5));

        assertEquals(3, list.size());
        assertFalse(list.isEmpty());
        assertEquals(1, list.searchFrequency("File1.txt"));
        assertEquals(10, list.searchFrequency("File10.txt"));
        assertEquals(5, list.searchFrequency("File5.txt"));
        assertEquals(0, list.searchFrequency(null));
        assertEquals(0, list.searchFrequency("Not exists"));
        assertEquals(0, list.searchFrequency(""));
        System.out.println(Arrays.toString(list.getNodesAsArray()));
    }

    @Test
    @DisplayName("Testing insertion with sorted elements")
    void testSortedInsertion() {
        LinkedList list = new LinkedList();
        Node a = new Node("A", 1);
        Node b = new Node("B", 2);
        Node c = new Node("C", 3);
        list.addSorted(a);
        list.addSorted(b);
        list.addSorted(c);

        assertEquals(3, list.size());
        assertFalse(list.isEmpty());
        Node[] nodes = list.getSortedNodesAsc();

        System.out.println(Arrays.toString(nodes));

        assertEquals(a, nodes[0]);
        assertEquals(b, nodes[1]);
        assertEquals(c, nodes[2]);
    }

    @Test
    @DisplayName("Testing insertion from desc to asc order")
    void testInsertionInReversedOrder() {
        LinkedList list = new LinkedList();
        Node c = new Node("C", 3);
        Node b = new Node("B", 2);
        Node a = new Node("A", 1);
        list.addSorted(c);
        list.addSorted(b);
        list.addSorted(a);

        assertEquals(3, list.size());
        assertFalse(list.isEmpty());
        Node[] nodes = list.getSortedNodesAsc();
        System.out.println(Arrays.toString(nodes));

        assertEquals(a, nodes[0]);
        assertEquals(b, nodes[1]);
        assertEquals(c, nodes[2]);
    }
}