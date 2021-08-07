package engine.sort;

import engine.LinkedList;
import engine.Node;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class BubbleSortTest {

    @Test
    @DisplayName("Testing sorting in asc and desc directions")
    void testSorting() {
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

        BubbleSort.sortDesc(nodes);
        System.out.print("DESC: ");
        System.out.println(Arrays.toString(nodes));
        assertEquals(f, nodes[0]);
        assertEquals(e, nodes[1]);
        assertEquals(d, nodes[2]);
        assertEquals(c, nodes[3]);
        assertEquals(b, nodes[4]);
        assertEquals(a, nodes[5]);


        BubbleSort.sortAsc(nodes);
        System.out.print("ASC: ");
        System.out.println(Arrays.toString(nodes));
        assertEquals(a, nodes[0]);
        assertEquals(b, nodes[1]);
        assertEquals(c, nodes[2]);
        assertEquals(d, nodes[3]);
        assertEquals(e, nodes[4]);
        assertEquals(f, nodes[5]);
    }
}