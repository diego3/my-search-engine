package engine.sort;

import engine.LinkedList;
import engine.Node;
import org.junit.jupiter.api.Test;

class BubbleSortLinkedListTest {

    @Test
    void sort2() {
        LinkedList list = new LinkedList();
        Node a = new Node("A", 1);
        Node c = new Node("C", 3);
        list.append(a);
        list.append(c);

        LinkedList list1 = BubbleSortLinkedList.sort(list);

        Node aux = list1.getHead();
        while(aux != null) {
            System.out.println(aux);
            aux = aux.getNext();
        }
    }

    @Test
    void sort3() {
        LinkedList list = new LinkedList();
        Node a = new Node("A", 1);
        Node b = new Node("B", 3);
        Node c = new Node("C", 5);
        list.append(a);
        list.append(b);
        list.append(c);

        LinkedList list1 = BubbleSortLinkedList.sort(list);

        Node aux = list1.getHead();
        while(aux != null) {
            System.out.println(aux);
            aux = aux.getNext();
        }
    }
}